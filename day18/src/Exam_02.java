import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame02 extends JFrame implements ActionListener{
	private JToolBar jtb = new JToolBar();
	private JButton jbt1 = new JButton("1번");
	private JButton jbt2 = new JButton("2번");
	private JButton jbt3 = new JButton("3번");
	private JButton jbt4 = new JButton("4번");
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtb);
		jtb.add(jbt1);
		jtb.add(jbt2);
		jtb.add(jbt3);
		jtb.add(jbt4);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame02(String title) {
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
	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("swing예제");
	}
}
