import java.awt.*;
import java.awt.event.*;
class MyImage04 extends Canvas{
	private Image img;
	
	public MyImage04(Image img) {
		this.img = img;
	}
	
	public void setImage(Image img) {
		this.img = img;
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, getWidth()-10, getHeight()-10, this);
	}
	
}

class MyFrame04 extends Frame implements ActionListener{
	private Panel center_p = new Panel();
	private Label north_lb = new Label("가위바위보!",Label.CENTER);

	private Panel east_p = new Panel();
	private Button scissor_bt = new Button("가위");
	private Button rock_bt = new Button("바위");
	private Button paper_bt = new Button("보");
	private Button retry_bt = new Button("다시");
	private Button exit_bt = new Button("종료");
	
	public Image img = Toolkit.getDefaultToolkit().getImage("fastrcp.gif");
	private MyImage04 mi = new MyImage04(img);
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", center_p);
		center_p.setLayout(new BorderLayout());
		center_p.add("North", north_lb);
		center_p.add("Center", mi); // canvas 객체 들어갈 곳
		
		this.add("East", east_p);
		east_p.setLayout(new GridLayout(5,1));
		east_p.add(scissor_bt); scissor_bt.addActionListener(this);
		east_p.add(rock_bt); rock_bt.addActionListener(this);
		east_p.add(paper_bt); paper_bt.addActionListener(this);
		east_p.add(retry_bt); retry_bt.addActionListener(this);
		east_p.add(exit_bt); exit_bt.addActionListener(this);
		
	}
	
	public MyFrame04(String title) {
		super(title);
		this.init();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		int ransu = (int)(Math.random()*3) +1;
		Image img2 = null;
		switch(ransu) {
		case 1: img2 = Toolkit.getDefaultToolkit().getImage("c.jpg"); break;
		case 2: img2 = Toolkit.getDefaultToolkit().getImage("r.jpg"); break;
		case 3: img2 = Toolkit.getDefaultToolkit().getImage("p.jpg"); break;
		}
		mi.setImage(img2);
		
		if(e.getSource() == scissor_bt) {
			if(ransu==1) {
				north_lb.setText("비겼습니다.");
			}else if(ransu==2) {
				north_lb.setText("컴퓨터가 이겼습니다.");
			}else if(ransu==3) {
				north_lb.setText("당신이 이겼습니다.");
			}
		}else if(e.getSource() == rock_bt) {
			if (ransu==2) {
				north_lb.setText("비겼습니다.");
			}else if (ransu==3) {
				north_lb.setText("컴퓨터가 이겼습니다.");
			}else {
				north_lb.setText("당신이 이겼습니다.");
			}
		}else if(e.getSource() == paper_bt) {
			if (ransu==3) {
				north_lb.setText("비겼습니다.");
			}else if (ransu==1) {
				north_lb.setText("컴퓨터가 이겼습니다.");
			}else {
				north_lb.setText("당신이 이겼습니다.");
			}
		}else if(e.getSource() == retry_bt) {
			mi.setImage(img);
			north_lb.setText("가위바위보!");
		}else if(e.getSource() == exit_bt) {
			System.exit(0);
		}
		
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("awt연습");
	}
}
