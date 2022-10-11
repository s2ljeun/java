package library;

import java.awt.*;
import java.awt.event.*;
import java.util.List;

import javax.swing.*;

public class MemberGUI extends JFrame implements ActionListener {
	private JPanel main_jp = new JPanel();
	private JPanel north_jp = new JPanel();
	private JPanel center_jp = new JPanel();
	
	private JPanel user_jp = new JPanel();
	private JButton book_bt = new JButton("도서관리");
	private JButton status_bt = new JButton("내 정보 수정");
	
	private JPanel search_jp = new JPanel();
	private JTextField search_tf = new JTextField();
	private JButton search_bt = new JButton("도서검색");
	
	private JTextArea search_ta = new JTextArea();
	
	private BookPro pro = new BookProImpl();
	private MemberPro pro2 = new MemberProImpl();
	private BookDAO dao = new BookDAO();
	private MemberBookDialog mbdlg = new MemberBookDialog(this, "도서관리", true);
	private StatusDialog stdlg = new StatusDialog(this, "내 정보 수정", true);
	
	public void init() {
		Container con = this.getContentPane();
		con.add(main_jp);
		main_jp.setLayout(new BorderLayout());
		
		main_jp.add("North", north_jp);
		north_jp.setLayout(new BorderLayout());
		north_jp.add("East", user_jp);
		user_jp.setLayout(new GridLayout(1,2));
		user_jp.add(book_bt);
		user_jp.add(status_bt);
		
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
	
	public void start() { // 액션리스너
		search_bt.addActionListener(this);
		book_bt.addActionListener(this);
		status_bt.addActionListener(this);
		
		mbdlg.confirm_bt.addActionListener(this);
		mbdlg.return_bt.addActionListener(this);
		
		stdlg.confirm_bt.addActionListener(this);
		
	}
	
	public MemberGUI(String title) {
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
		if(search_bt == e.getSource()) { // 도서검색 버튼
			String searchWord = search_tf.getText();
			List<Book> list = (List<Book>) pro.search(searchWord);
			this.view(list);
			
		}else if(book_bt == e.getSource()) { // 도서관리 버튼
			mbdlg.setVisible(true);
			
		}else if(mbdlg.confirm_bt == e.getSource()) { // 도서관리dlg - 대여버튼
			int num = mbdlg.getBook();
			Book bk = dao.searchBook(num);
			if(bk.isChekOut()) { //이미 대여되어있다면
				JOptionPane.showMessageDialog(null, "해당 도서는 대출중입니다.", "", JOptionPane.INFORMATION_MESSAGE);
			}else {
				int res = pro.check(bk);
				if (res>0) {
					JOptionPane.showMessageDialog(null, "도서 대여를 완료했습니다.", "", JOptionPane.INFORMATION_MESSAGE);
					mbdlg.clearDialog();
					mbdlg.setVisible(false);
					List<Book> list = (List<Book>) pro.search("");
					this.view(list);
				}else {
					JOptionPane.showMessageDialog(null, "도서번호를 확인해주세요.", "", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		}else if(mbdlg.return_bt == e.getSource()) { // 도서관리dlg - 반납버튼
			int num = mbdlg.getBook();
			Book bk = dao.searchBook(num);
			if(!bk.isChekOut()) { //이미 반납되어있다면
				JOptionPane.showMessageDialog(null, "해당 도서는 대출중이 아닙니다.", "", JOptionPane.INFORMATION_MESSAGE);
			}else {
				int res = pro.check(bk);
				if (res>0) {
					JOptionPane.showMessageDialog(null, "도서 반납을 완료했습니다.", "", JOptionPane.INFORMATION_MESSAGE);
					mbdlg.clearDialog();
					mbdlg.setVisible(false);
					List<Book> list = (List<Book>) pro.search("");
					this.view(list);
				}else {
					JOptionPane.showMessageDialog(null, "도서번호를 확인해주세요.", "", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else if(status_bt == e.getSource()) { // 내 정보 수정 버튼
			String id = this.getTitle();
			System.out.print(id);
			Member mb = pro2.view(id);
			stdlg.id_tf.setText(mb.getId());
			stdlg.name_tf.setText(mb.getName());
			stdlg.pw_tf.setText(mb.getPw());
			stdlg.tel_tf.setText(mb.getTel());
			stdlg.setVisible(true);

		}else if(stdlg.confirm_bt == e.getSource()) { // 수정dlg - 확인 버튼
			
		}
		
	}

}
