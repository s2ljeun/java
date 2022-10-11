package library;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminBookDialog extends Dialog{
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JPanel jp4 = new JPanel();
	
	private Label title_lb = new Label("도서명 : ", Label.RIGHT);
	private TextField title_tf = new TextField();
	private Label author_lb = new Label("저자 : ", Label.RIGHT);
	private TextField author_tf = new TextField();
	private Label pub_lb = new Label("출판사 : ", Label.RIGHT);
	private TextField pub_tf = new TextField();

	JButton add_bt = new JButton("추가");
	JButton cancle_bt = new JButton("취소");
	
	public Book getBook() {
		String title = title_tf.getText();
		String author = author_tf.getText();
		String pub = pub_tf.getText();
		Book bk = new Book(title, author, pub);
		return bk;
	}
	
	public void clearDialog() {
		title_tf.setText("");
		author_tf.setText("");
		pub_tf.setText("");
	}
	
	public void init() {
		this.setLayout(new GridLayout(4, 1));
		//main_jp.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10)); //상하좌우 띄우기
		
		this.add(jp1);
		jp1.setLayout(new BorderLayout());
		jp1.add("West", title_lb);
		jp1.add(title_tf);
		
		this.add(jp2);
		jp2.setLayout(new BorderLayout());
		jp2.add("West", author_lb);
		jp2.add(author_tf);
		
		this.add(jp3);
		jp3.setLayout(new BorderLayout());
		jp3.add("West", pub_lb);
		jp3.add(pub_tf);
		
		this.add(jp4);
		jp4.setLayout(new GridLayout(1,2));
		jp4.add(add_bt);
		jp4.add(cancle_bt);
	}
		
	public AdminBookDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		this.init();
		this.setSize(300,400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);

	}

}
