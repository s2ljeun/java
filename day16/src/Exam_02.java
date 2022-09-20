import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyButton02 extends Button{
	private Image img;

	public MyButton02(Image img) {
		this.img = img;
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, this.getWidth()-10, this.getHeight()-10, this);
	}
}


class MyFrame02 extends Frame implements ActionListener{
	private MyButton02[] bt = new MyButton02[4];

	private Panel p = new Panel();
	private Label lb = new Label("버튼을 누르세요!", Label.CENTER);
	private String[] str = new String[] {"승희", "효정", "유아", "유빈"};
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", p);
		p.setLayout(new GridLayout(1,4));
		for(int i=0; i<bt.length; ++i) {
			Image img = Toolkit.getDefaultToolkit().getImage("img0" + (i+1) + ".jpg");
			bt[i] = new MyButton02(img);
			p.add(bt[i]);
			bt[i].addActionListener(this);
		}
				
		this.add("South", lb);
	}
	
	public MyFrame02(String title) {
		super(title);
		this.init();
		
		super.setSize(800, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<bt.length; ++i) {
			if(e.getSource() == bt[i]) {
				lb.setText(str[i] + "버튼을 누르셨습니다.");
			}
		}
		
		
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("awt연습");
	}
}
