// text area
import java.awt.*;
class MyFrame09 extends Frame{
	private BorderLayout bl = new BorderLayout();
	private Panel pl1 = new Panel();
	private Panel pl2 = new Panel();
	private Label lb1 = new Label();
	private Label lb2 = new Label();
	private Button bt[] = new Button[16];
	private TextArea ta = new TextArea();

	public void init() {
		this.setLayout(bl);
		this.add("Center", pl1);
		pl1.setLayout(new GridLayout(4,4));
		for(int i=0; i<bt.length; i++) {
			bt[i] = new Button("야호");
			pl1.add(bt[i]);
		}
		
		this.add("East", pl2);
		pl2.setLayout(new BorderLayout());
		pl2.add("North", lb1);
		pl2.add("Center", ta);
		pl2.add("South", lb2);
		
		
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
		MyFrame09 mf = new MyFrame09("awt연습");
	}
}
