import java.awt.*;

class MyFrame09 extends Frame{
	private BorderLayout bl = new BorderLayout();
	private Label lb = new Label("계 산 기 예 제", Label.CENTER);
	private Panel p = new Panel();
	private GridLayout gl = new GridLayout(4,4,5,5);
	private Button[] bt = new Button[16];
	private String[] str = new String[] {"7","8","9","+","4","5","6","-",
											"1","2","3","*","0","=","%","/"};
	
	public void init() {
		this.setLayout(bl);
		this.setBackground(Color.orange);
		lb.setFont(new Font("", Font.BOLD, 30));
		this.add("North", lb);
		this.add("Center", p);
		p.setLayout(gl);
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new Button(str[i]);
			bt[i].setBackground(Color.WHITE);
			bt[i].setForeground(Color.orange);
			bt[i].setFont(new Font("", Font.PLAIN, 25));
			p.add(bt[i]);
		}
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
}
public class Exam_09 {
	public static void main(String[] args) {
		MyFrame09 mf = new MyFrame09("계산기예제");
	}
}