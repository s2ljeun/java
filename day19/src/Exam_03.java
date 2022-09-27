import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyImage03 extends Canvas{
	Image img;
	public void MyImage03(Image img){
		this.img = img;
	}
	
	public void paint(Graphics g) {
		
	}
}

class MyFrame03 extends JFrame implements ActionListener{
	
	private JPanel north_jp = new JPanel();
	
	private JPanel input_jp = new JPanel();
	private JLabel horse_jlb = new JLabel("말의 수:", Label.RIGHT);
	private JTextField horse_tf = new JTextField();
	
	private JButton setting_bt = new JButton("설정");
	private JButton initial_bt = new JButton("초기화");

	private JPanel center_jp = new JPanel();
	private JButton jbt = new JButton("확인");
	private 
	
	
	Container con;
	
	public void init() {
		con = this.getContentPane();
		con.setLayout(new BorderLayout());

		con.add("North", north_jp);
		north_jp.setLayout(new GridLayout(1,3));
		
		north_jp.add(input_jp);
		input_jp.setLayout(new GridLayout(1,2));
		input_jp.add(horse_jlb);
		input_jp.add(horse_tf);
		
		north_jp.add(setting_bt);
		north_jp.add(initial_bt);
		setting_bt.addActionListener(this);
		initial_bt.addActionListener(this);
		
		con.add("Center", center_jp);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame03(String title) {
		super(title);
		this.init();
		this.setSize(800,400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(setting_bt == e.getSource()) {
			int horse = Integer.parseInt(horse_tf.getText());
			center_jp.setLayout(new GridLayout(horse,1));
			
		}
		/*
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
		*/
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("swing예제");
	}
}
