import java.awt.*;
import java.awt.event.*;
class MyButton01 extends Button{
	private Image img;
	public MyButton01(Image img) {
		this.img = img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyFrame01 extends Frame implements ActionListener{
	private MyButton01 mbt[] = new MyButton01[9];
	
	private Label score_lb = new Label("���� : 00��", Label.CENTER);
	private Label time_lb = new Label("�ð� : 10��", Label.CENTER);
	private Button start_bt = new Button("����");

	private Image img1 = Toolkit.getDefaultToolkit().getImage("dudu.png");
	private Image img2 = Toolkit.getDefaultToolkit().getImage("du.png");
	
	private Panel p = new Panel();
	private Panel east_p = new Panel();
	
	private boolean isEnable = false;
	private int co = 0;
	private int ransu;
	private int time = 10;
	
	public void init() {
		this.addWindowListener(new WindowAdapter() {
		@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setLayout(new BorderLayout());
		this.add("Center", p);
		p.setLayout(new GridLayout(3, 3));
		for(int i=0; i<mbt.length; ++i) {
			mbt[i] = new MyButton01(img1);
			mbt[i].addActionListener(this);
			p.add(mbt[i]);
		}
		this.add("East", east_p);
		east_p.setLayout(new GridLayout(3, 1));
		east_p.add(score_lb);
		east_p.add(time_lb);
		east_p.add(start_bt);	
		start_bt.addActionListener(this);
		buttonSetting();
	}
	
	public void buttonSetting() {
		start_bt.setEnabled(!isEnable);
		for(int i=0; i<mbt.length; ++i) {
			mbt[i].setEnabled(isEnable);
		}
	}
	
	public MyFrame01(String title) {
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
	
	public void dudu() {
		while(true) {
			int su = (int)(Math.random()*9);
			if (ransu != su) {
				ransu = su;
				break;
			}
		}
		mbt[ransu].setImg(img2);
		mbt[ransu].repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start_bt) {
			co = 0;
			time = 10;
			score_lb.setText("���� : 0"+co+"��");
			time_lb.setText("�ð� : "+time+"��");
			isEnable = true;
			buttonSetting();
			dudu();
		}else {
			for(int i=0; i<mbt.length; ++i) {
				if (e.getSource()==mbt[i]) {
					if (ransu == i) {
						mbt[i].setImg(img1);
						mbt[i].repaint();
						co++;
						if (co<10) {
							score_lb.setText("���� : 0"+co+"��");
						}else {
							score_lb.setText("���� : "+co+"��");
						}
						dudu();
					}
				}
			}
		}
		
	}

	public void buttonClear() {
		for(int i=0; i<mbt.length; ++i) {
			mbt[i].setImg(img1);
		}
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("�δ�������");
	}
}