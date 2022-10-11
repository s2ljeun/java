package library;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StatusDialog extends Dialog{
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JPanel jp4 = new JPanel();
	private JPanel jp5 = new JPanel();
	
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	TextField name_tf = new TextField();
	private Label id_lb = new Label("아이디 : ", Label.RIGHT);
	TextField id_tf = new TextField();
	private Label pw_lb = new Label("비밀번호 : ", Label.RIGHT);
	TextField pw_tf = new TextField();
	private Label pw_re_lb = new Label("비밀번호 확인 : ", Label.RIGHT);
	TextField pw_re_tf = new TextField();
	private Label tel_lb = new Label("전화번호 : ", Label.RIGHT);
	TextField tel_tf = new TextField();

	JButton confirm_bt = new JButton("확인");
	
	private MemberPro pro = new MemberProImpl();
	
	public Member getMember() {
		String name = name_tf.getText();
		String id = id_tf.getText();
		String pw = pw_tf.getText();
		String tel = tel_tf.getText();
		Member mb = new Member(name, id, pw, tel);
		return mb;
	}
	
	public void clearDialog() {
		name_tf.setText("");
		id_tf.setText("");
		pw_tf.setText("");
		pw_re_tf.setText("");
		tel_tf.setText("");
	}
	
	public void init() {
		this.setLayout(new GridLayout(6, 1));
		
		this.add(jp1);
		jp1.setLayout(new BorderLayout());
		jp1.add("West", name_lb);
		jp1.add(name_tf);
		
		this.add(jp2);
		jp2.setLayout(new BorderLayout());
		jp2.add("West", id_lb);
		jp2.add(id_tf);
		
		this.add(jp3);
		jp3.setLayout(new BorderLayout());
		jp3.add("West", pw_lb);
		jp3.add(pw_tf);
		
		this.add(jp4);
		jp4.setLayout(new BorderLayout());
		jp4.add("West", pw_re_lb);
		jp4.add(pw_re_tf);
		
		this.add(jp5);
		jp5.setLayout(new BorderLayout());
		jp5.add("West", tel_lb);
		jp5.add(tel_tf);
		
		this.add(confirm_bt);

	}
	
	public StatusDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		this.init();
		this.setSize(600,400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);

	}
}
