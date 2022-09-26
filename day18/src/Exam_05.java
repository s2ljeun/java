import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame05 extends JFrame{
	private JToolBar jtb = new JToolBar();
	private JButton jbt1 = new JButton("�Է�");
	private JButton jbt2 = new JButton("����");
	private JButton jbt3 = new JButton("����");
	private JButton jbt4 = new JButton("����");
	private JTabbedPane jtp = new JTabbedPane();
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JPanel jp4 = new JPanel();
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtb);
		jtb.add(jbt1);
		jtb.add(jbt2);
		jtb.add(jbt3);
		jtb.addSeparator();
		jtb.add(jbt4);
		con.add("Center", jtp);
		jp1.setBackground(Color.BLACK);
		jp2.setBackground(Color.RED);
		jp3.setBackground(Color.BLUE);
		jp4.setBackground(Color.GREEN);
		jtp.addTab("�̸���", jp1);
		jtp.addTab("�����", jp2);
		jtp.addTab("�����", jp3);
		jtp.addTab("������", jp4);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame05(String title) {
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
public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("swing����");
	}
}