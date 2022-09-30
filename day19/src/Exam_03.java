import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame03 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel[] jlb = new JLabel[3];
	private JButton jbt = new JButton("확인");
	Container con;
	
	public void init() {
		con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("Center", jp);
		jp.setLayout(new GridLayout(3, 1));
		for(int i=0; i<3; ++i) {
			jlb[i] = new JLabel(i+1+"번");
			jp.add(jlb[i]);
		}
		con.add("South", jbt);
		jbt.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame03(String title) {
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
		con.remove(jp);
		jp = new JPanel();
		jp.setLayout(new GridLayout(4,1));
		jlb = new JLabel[4];
		for(int i=0; i<4; ++i) {
			jlb[i] = new JLabel(i+1+"번");
			jp.add(jlb[i]);
		}
		con.add("Center", jp);
		con.validate();
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("swing예제");
	}
}
