import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyImage03 extends Canvas{ // 캔버스 상속받아 이미지 객체 만들기
	private Image img;
	private int x, y;
	
	public void setImage(Image img) { // 이미지 Setter
		this.img = img;
	}

	public MyImage03() { // 생성자
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, this.getWidth()-10, this.getHeight()-10, this);
	}
}

class MyFrame03 extends JFrame implements ActionListener{
	private JToolBar jtb = new JToolBar();
	private JButton jbt1 = new JButton("세비체");
	private JButton jbt2 = new JButton("연어초밥");
	private JButton jbt3 = new JButton("가지라구파스타");
	private JButton jbt4 = new JButton("감바스");

	private Image img1 = Toolkit.getDefaultToolkit().getImage("1.jpg");
	private Image img2 = Toolkit.getDefaultToolkit().getImage("2.jpg");
	private Image img3 = Toolkit.getDefaultToolkit().getImage("3.jpg");
	private Image img4 = Toolkit.getDefaultToolkit().getImage("4.jpg");
	private MyImage03 mi = new MyImage03(); // (최초)객체 생성
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtb);
		jtb.add(jbt1);
		jtb.add(jbt2);
		jtb.add(jbt3);
		jtb.add(jbt4);
		
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		jbt3.addActionListener(this);
		jbt4.addActionListener(this);
		
		con.add("Center", mi); // 객체 넣기

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
		if(e.getSource()==jbt1) {
			mi.setImage(img1);
		} else if(e.getSource()==jbt2){
			mi.setImage(img2);
		} else if(e.getSource()==jbt3){
			mi.setImage(img3);
		} else if(e.getSource()==jbt4){
			mi.setImage(img4);
		}
		mi.repaint();
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("swing예제");
	}
}
