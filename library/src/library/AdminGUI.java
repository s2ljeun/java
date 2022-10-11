package library;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;
import java.util.List;

public class AdminGUI extends JFrame implements ActionListener {
	private JPanel main_jp = new JPanel();
	private JPanel north_jp = new JPanel();
	private JPanel center_jp = new JPanel();
	
	private JPanel user_jp = new JPanel();
	private JButton delete_book_bt = new JButton("도서삭제");
	private JButton add_book_bt = new JButton("도서등록");

	private JPanel search_jp = new JPanel();
	private JTextField search_tf = new JTextField();
	private JButton search_bt = new JButton("도서검색");

	private JTextArea search_ta = new JTextArea();
	
	private AdminBookDialog abdlg = new AdminBookDialog(this, "도서등록", true);
	private AdminDeleteDialog addlg = new AdminDeleteDialog(this, "도서삭제", true);
	private BookPro pro = new BookProImpl();
	
	public void init() {
		Container con = this.getContentPane();
		con.add(main_jp);
		main_jp.setLayout(new BorderLayout());
		
		main_jp.add("North", north_jp);
		north_jp.setLayout(new BorderLayout());
		north_jp.add("East", user_jp);
		user_jp.setLayout(new GridLayout(1,2));
		user_jp.add(delete_book_bt);
		user_jp.add(add_book_bt);
		
		main_jp.add("Center", center_jp);
		center_jp.setLayout(new BorderLayout());
		
		center_jp.add("North", search_jp);
		search_jp.setLayout(new BorderLayout());
		search_jp.add("Center", search_tf);
		search_jp.add("East", search_bt);
		
		center_jp.add("Center", search_ta);
		search_ta.setEditable(false);
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void start() {
		add_book_bt.addActionListener(this);
		delete_book_bt.addActionListener(this);
		search_bt.addActionListener(this);
		
		abdlg.add_bt.addActionListener(this);
		abdlg.cancle_bt.addActionListener(this);
		
		addlg.delete_bt.addActionListener(this);
		addlg.cancle_bt.addActionListener(this);
	}
	
	public AdminGUI(String title) {
		super(title);
		this.init();
		this.start();
		this.setSize(900,400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
		List<Book> list = (List<Book>) pro.search("");
		this.view(list);

	}
	
	protected void view(List<Book> list) {
		search_ta.setText("");
		search_ta.append("No.\t\t책 이름\t\t저자\t\t출판사\t\t대출\n");
		search_ta.append("=========================================================================================================================\n");
		for(Book bk : list) {
			search_ta.append(bk.getNo() + "\t\t" + bk.getTitle() + "\t\t"
							+ bk.getAuthor() + "\t\t" + bk.getPub() + "\t\t"
							+ bk.isChekOut() + "\n");
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(add_book_bt == e.getSource()) { // 도서등록 버튼
			abdlg.setVisible(true);
		}else if(abdlg.add_bt == e.getSource()) { // 등록 dlg - 추가 버튼
			Book bk = abdlg.getBook(); //입력된 책 정보
			int res = pro.insert(bk);
			if (res>0) {
				JOptionPane.showMessageDialog(null, "도서를 추가했습니다.", "", JOptionPane.INFORMATION_MESSAGE);
				abdlg.clearDialog();
				abdlg.setVisible(false);
				List<Book> list = (List<Book>) pro.search("");
				this.view(list);
			}else {
				JOptionPane.showMessageDialog(null, "다시 시도해주세요.", "", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(abdlg.cancle_bt == e.getSource()) { // 등록 dlg - 취소 버튼
			abdlg.clearDialog();
			abdlg.setVisible(false);
		}else if(search_bt == e.getSource()) { // 도서검색 버튼
			String searchWord = search_tf.getText();
			List<Book> list = (List<Book>) pro.search(searchWord);
			this.view(list);
		}else if(delete_book_bt == e.getSource()) { // 도서삭제 버튼
			addlg.setVisible(true);
		}else if(addlg.delete_bt == e.getSource()) { // 삭제dlg - 삭제 버튼
			int num = addlg.getNum(); //북 no
			int res = pro.delete(num);
			if (res>0) {
				JOptionPane.showMessageDialog(null, "도서를 삭제했습니다.", "", JOptionPane.INFORMATION_MESSAGE);
				addlg.clearDialog();
				addlg.setVisible(false);
				List<Book> list = (List<Book>) pro.search("");
				this.view(list);
			}else {
				JOptionPane.showMessageDialog(null, "도서번호를 확인해주세요.", "", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(addlg.cancle_bt == e.getSource()) { // 삭제dlg - 취소 버튼
			addlg.clearDialog();
			addlg.setVisible(false);
		}
	}

}
