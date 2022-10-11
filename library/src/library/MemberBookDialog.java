package library;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MemberBookDialog extends Dialog{
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	
	private Label num_lb = new Label("µµ¼­¹øÈ£ : ", Label.RIGHT);
	private TextField num_tf = new TextField();

	JButton confirm_bt = new JButton("´ë¿©");
	JButton return_bt = new JButton("¹Ý³³");
	
	public int getBook() {
		int num = Integer.parseInt(num_tf.getText());
		return num;
	}
	
	public void clearDialog() {
		num_tf.setText("");
	}
	
	public void init() {
		this.setLayout(new GridLayout(2, 1));
		//main_jp.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10)); //»óÇÏÁÂ¿ì ¶ç¿ì±â
		
		this.add(jp1);
		jp1.setLayout(new BorderLayout());
		jp1.add("West", num_lb);
		jp1.add(num_tf);
		
		this.add(jp2);
		jp2.setLayout(new GridLayout(1,2));
		jp2.add(confirm_bt);
		jp2.add(return_bt);
	}
		
	public MemberBookDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		this.init();
		this.setSize(300,200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);

	}

}