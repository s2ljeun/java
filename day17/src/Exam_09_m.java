import java.awt.*;
import java.awt.event.*;

class MyButton09 extends Button{
	private Image img;
	public void setImage(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	} 
}
class MyFrame09 extends Frame implements ActionListener, Runnable{
	private Panel center_p = new Panel();
	private Panel east_p = new Panel();
	private MyButton02[] bt = new MyButton02[9];
	private Label num_lb = new Label("맞출번호 : ");
	private Label score_lb = new Label("점수 : ");
	private Label time_lb = new Label("시간: ");
	private Button start_bt = new Button("시작");
	
	private boolean isEnable = false;
	private int[] number = new int[9];
	private int checkNum = 1;
	private int score = 0;
	private int time;
	
	public void buttonSetting() {
		start_bt.setEnabled(!isEnable);
		for(int i=0; i<bt.length; ++i) {
			bt[i].setEnabled(isEnable);
		}
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", center_p);
		center_p.setLayout(new GridLayout(3,3));
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new MyButton02();
			bt[i].setFont(new Font("", Font.BOLD, 20));
			center_p.add(bt[i]);
			bt[i].addActionListener(this);
		}
		east_p.setPreferredSize(new Dimension(100,300));
		this.add("East", east_p);		
		east_p.setLayout(new GridLayout(4,1));
		east_p.add(num_lb);
		east_p.add(score_lb);
		east_p.add(time_lb);
		east_p.add(start_bt);
		start_bt.addActionListener(this);
		buttonSetting();
	}
	
	public MyFrame09(String title) {
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
	
	public void buttonNumSetting() {
		for(int i=0; i<number.length; ++i) {
			number[i] = (int)(Math.random() * 9) + 1;
			for(int j=0; j<i; ++j) {
				if (number[i] == number[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<number.length; ++i) {
			Image img = Toolkit.getDefaultToolkit().getImage("img/"+number[i]+".png");
			bt[i].setImage(img);
			bt[i].repaint();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start_bt) {
			time = 10;
			num_lb.setText("맞출번호 : " + checkNum);
			score_lb.setText("점수 : "+score+"점");
			time_lb.setText("시간 : " + time);
			isEnable = true;
			buttonSetting();
			buttonNumSetting();
			Thread th = new Thread(this);
			th.start();
		}
		for(int i=0; i<bt.length; ++i) {
			if (e.getSource()==bt[i]) {
				if (checkNum == number[i]) {
					score++;
					checkNum++;
					if (checkNum>9) {
						checkNum = 1;
						buttonNumSetting();
					}
					num_lb.setText("맞출번호 : " + checkNum);
					score_lb.setText("점수 : "+score+"점");
				}
			}
		}
	}

	@Override
	public void run() {
		while(true) {
			time--;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			time_lb.setText("시간 : " + time);
			if (time == 0) {
				start_bt.setEnabled(isEnable);
				for(int i=0; i<bt.length; ++i) {
					bt[i].setEnabled(!isEnable);
				}
				break;
			}
		}
	}
}

public class Exam_09_m {
	public static void main(String[] args) {
		MyFrame09 mf = new MyFrame09("awt연습");
	}
}