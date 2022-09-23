import java.awt.*;
import java.awt.event.*;

class MyImage03 extends Canvas{
	private Image img;
	private int x, y;
	
	public MyImage03(Image img) {
		this.img = img;
		x = 200;
		y = 200;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
		if (this.x > 400) this.x = 400;
		else if (this.x < 50) this.x = 50;
		System.out.println("x = " + this.x);
		y = this.x;
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 50, 50, x, y, this);
	}
}

class MyFrame03 extends Frame implements ActionListener{
	private Panel east_p = new Panel();
	private Button bt1 = new Button("확대");
	private Button bt2 = new Button("축소");
	private Button bt3 = new Button("원본");
	private Button bt4 = new Button("종료");
	private Image img = Toolkit.getDefaultToolkit().getImage("bts.png");
	private MyImage03 mi = new MyImage03(img);
		
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("East", east_p);
		east_p.setLayout(new GridLayout(4, 1));
		east_p.add(bt1); bt1.addActionListener(this);
		east_p.add(bt2); bt2.addActionListener(this);
		east_p.add(bt3); bt3.addActionListener(this);
		east_p.add(bt4); bt4.addActionListener(this);
		this.add("Center", mi);
	}
	
	public MyFrame03(String title) {
		super(title);
		this.init();
		super.setSize(800, 600);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bt1) {
			mi.setX(mi.getX() + 50);
		}else if (e.getSource() == bt2) {
			mi.setX(mi.getX() - 50);
		}else if (e.getSource() == bt3) {
			mi.setX(200);
		}else if (e.getSource() == bt4) {
			System.exit(0);
		}
		mi.repaint();
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("awt연습");
	}
}