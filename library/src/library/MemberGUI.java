package library;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MemberGUI extends JFrame implements ActionListener {
	private JPanel main_jp = new JPanel();
	private JPanel north_jp = new JPanel();
	private JPanel center_jp = new JPanel();
	
	private JPanel user_jp = new JPanel();
	private JButton book_status_bt = new JButton("대출현황");
	private JButton user_status_bt = new JButton("내 정보 수정");
	
	private JPanel search_jp = new JPanel();
	private JTextField search_tf = new JTextField();
	private JButton search_bt = new JButton("도서검색");
	
	
	private JTextArea search_ta = new JTextArea();
	
	public void init() {
		Container con = this.getContentPane();
		con.add(main_jp);
		main_jp.setLayout(new BorderLayout());
		
		main_jp.add("North", north_jp);
		north_jp.setLayout(new BorderLayout());
		north_jp.add("East", user_jp);
		user_jp.setLayout(new GridLayout(1,2));
		user_jp.add(book_status_bt);
		user_jp.add(user_status_bt);
		
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
	
	public MemberGUI(String title) {
		super(title);
		this.init();
		this.setSize(600,400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
