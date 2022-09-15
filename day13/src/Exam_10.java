import java.awt.*;
class MyFrame10 extends Frame{
	private GridLayout gl = new GridLayout(4, 1);
	private Label lb1 = new Label("좋아하는 연예인은?");
	private Panel p1 = new Panel();
	private Checkbox cb1 = new Checkbox("츄");
	private Checkbox cb2 = new Checkbox("승희");
	private Checkbox cb3 = new Checkbox("지효");
	private Checkbox cb4 = new Checkbox("모모");
	private Checkbox cb5 = new Checkbox("비니");
	
	private Label lb2 = new Label("성별?");
	private Panel p2 = new Panel();
	private CheckboxGroup cg = new CheckboxGroup();
	private Checkbox ra1 = new Checkbox("여성", cg, true);
	private Checkbox ra2 = new Checkbox("남성", cg, false);
	
	private Font font = new Font("", Font.PLAIN, 20);
	
	public void init() {
		this.setLayout(gl);
		this.add(lb1);
		this.add(p1);
		p1.setLayout(new GridLayout(1,5));
		p1.add(cb1);p1.add(cb2);p1.add(cb3);p1.add(cb4);p1.add(cb5);
		this.add(lb2);
		this.add(p2);
		p2.setLayout(new GridLayout(1,2));
		p2.add(ra1);p2.add(ra2);
		
		lb1.setFont(font);
		lb2.setFont(font);
	}
	
	public MyFrame10(String title) {
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

public class Exam_10 {
	public static void main(String[] args) {
		MyFrame10 mf = new MyFrame10("awt연습");
	}
}