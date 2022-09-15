import java.awt.*;

class MyFrame08 extends Frame{
	private BorderLayout bl = new BorderLayout();
	private Label lb = new Label("전화기예제", Label.CENTER);
	private Panel p = new Panel();
	private GridLayout gl = new GridLayout(4, 3);
	private Button bt[] = new Button[12];
	private String[] str = new String[] {"*", "0", "#"};
	
	private Font font = new Font("", Font.BOLD, 30);
	private Color color = new Color(95, 32, 132); // Color클래스 객체 새로 만들어서 색 지정 가능
	private Cursor cur = new Cursor(Cursor.HAND_CURSOR);
	
	public void init() {
		this.setLayout(bl);
		this.add("North", lb);
		this.add("Center", p);
		p.setLayout(gl);
		this.setCursor(cur);
		
		lb.setFont(font);
		this.setBackground(color);
		
		for(int i=0; i<bt.length; ++i) {
			if (i>8) bt[i] = new Button(str[i-9]);
			else bt[i] = new Button(String.valueOf(i+1));
			bt[i].setFont(font);
			bt[i].setBackground(Color.orange); // Color클래스 템플릿 컬러 사용 가능
			bt[i].setForeground(Color.white);
			p.add(bt[i]);
		}
	}
	
	public MyFrame08(String title) {
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

public class Exam_08 {
	public static void main(String[] args) {
		MyFrame08 mf = new MyFrame08("awt연습");
	}
}


//import java.awt.*;
//class MyFrame08 extends Frame{
//	
//	private Label lb = new Label("전화기 예제", Label.CENTER);
//	private Button bt1 = new Button("1");
//	private Button bt2 = new Button("2");
//	private Button bt3 = new Button("3");
//	private Button bt4 = new Button("4");
//	private Button bt5 = new Button("5");
//	private Button bt6 = new Button("6");
//	private Button bt7 = new Button("7");
//	private Button bt8 = new Button("8");
//	private Button bt9 = new Button("9");
//	private Button bt10 = new Button("*");
//	private Button bt11 = new Button("0");
//	private Button bt12 = new Button("#");
//	
//	private BorderLayout bl = new BorderLayout();
//	private GridLayout gl = new GridLayout(4,3);
//	private Panel p = new Panel();
//	
//	public void init() {
//		this.setLayout(bl);
//		this.add("North", lb);
//		this.add("Center", p);
//		
//		p.setLayout(gl);
//		p.add(bt1);
//		p.add(bt2);
//		p.add(bt3);
//		p.add(bt4);
//		p.add(bt5);
//		p.add(bt6);
//		p.add(bt7);
//		p.add(bt8);
//		p.add(bt9);
//		p.add(bt10);
//		p.add(bt11);
//		p.add(bt12);
//		
//		
//	}
//	
//	public MyFrame08(String title) {
//		super(title);
//		this.init();
//		
//		super.setSize(300, 400);
//		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
//		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
//		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
//		super.setLocation(xpos, ypos);
//		super.setResizable(false);
//		
//		super.setVisible(true);
//	}
//}
//
//public class Exam_08 {
//	public static void main(String[] args) {
//		MyFrame08 mf = new MyFrame08("awt연습");
//	}
//}