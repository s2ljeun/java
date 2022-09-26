import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame04 extends JFrame{	
	private JTabbedPane jtp = new JTabbedPane();
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JPanel jp4 = new JPanel();
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		
		con.add("Center", jtp);
		jp1.setBackground(Color.black);
		jtp.addTab("1번", jp1);
		
		jp2.setBackground(Color.red);
		jtp.addTab("2번", jp2);
		
		jp3.setBackground(Color.blue);
		jtp.addTab("3번", jp3);
		
		jp4.setBackground(Color.green);
		jtp.addTab("4번", jp4);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame04(String title) {
		super(title);
		this.init();
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);

	}

}
public class Exam_04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("swing예제");
	}
}
