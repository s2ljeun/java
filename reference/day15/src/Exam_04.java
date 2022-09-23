import java.awt.*;
import java.awt.event.*;

class MyImage04 extends Canvas{
	private Image img;
	public MyImage04(Image img) {
		this.img = img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, getWidth()-10, getHeight()-10, this);
	}
}
class MyFrame04 extends Frame implements ActionListener{
	Image img = Toolkit.getDefaultToolkit().getImage("fastrcp.gif");
	MyImage04 mib = new MyImage04(img);
	private Button bt1 = new Button("가위");
	private Button bt2 = new Button("바위");
	private Button bt3 = new Button("보");
	private Button bt4 = new Button("시작");
	private Button bt5 = new Button("종료");
	private Label msg_lb = new Label("가위바위보 버튼을 눌러주세요");
	
	private Panel p = new Panel();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", mib);
		this.add("North", msg_lb);
		this.add("East", p);
		p.setPreferredSize(new Dimension(100,300));
		p.setLayout(new GridLayout(5,1));
		p.add(bt1);	bt1.addActionListener(this);
		p.add(bt2);	bt2.addActionListener(this);
		p.add(bt3);	bt3.addActionListener(this);
		p.add(bt4);	bt4.addActionListener(this);
		p.add(bt5);	bt5.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		int ransu = (int)(Math.random()*3) + 1;
		Image img2 = null;
		switch(ransu) {
		case 1 : img2 = Toolkit.getDefaultToolkit().getImage("c.jpg"); break;
		case 2 : img2 = Toolkit.getDefaultToolkit().getImage("r.jpg"); break;
		case 3 : img2 = Toolkit.getDefaultToolkit().getImage("p.jpg"); break;
		}
		mib.setImg(img2);
		if (e.getSource()==bt1) {
			if (ransu==1) {
				msg_lb.setText("비겼습니다.");
			}else if (ransu==2) {
				msg_lb.setText("컴퓨터가 이겼습니다.");
			}else {
				msg_lb.setText("당신이 이겼습니다.");
			}
		}else if (e.getSource()==bt2) {
			if (ransu==2) {
				msg_lb.setText("비겼습니다.");
			}else if (ransu==3) {
				msg_lb.setText("컴퓨터가 이겼습니다.");
			}else {
				msg_lb.setText("당신이 이겼습니다.");
			}
		}else if (e.getSource()==bt3) {
			if (ransu==3) {
				msg_lb.setText("비겼습니다.");
			}else if (ransu==1) {
				msg_lb.setText("컴퓨터가 이겼습니다.");
			}else {
				msg_lb.setText("당신이 이겼습니다.");
			}
		}else if (e.getSource()==bt4) {
			mib.setImg(img);
		}else if (e.getSource()==bt5) {
			System.exit(0);
		}
		mib.repaint();
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("frame예제");
	}
}