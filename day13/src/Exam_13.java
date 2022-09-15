//≠
import java.awt.*;

class MyFrame13 extends Frame{
	private BorderLayout bl = new BorderLayout();
	private Panel north_p = new Panel();
	private Label north_lb = new Label("力格 : ", Label.RIGHT);
	private TextField north_tf = new TextField();
	private TextArea ta = new TextArea();
	private Panel south_p = new Panel();
	private Button ok_bt = new Button("历厘");
	private Button cencle_bt = new Button("秒家");
	
	
	public void init() {
		this.setLayout(bl);
		this.add("North", north_p);
		north_p.setLayout(new BorderLayout());
		north_p.add("West", north_lb);
		north_p.add("Center", north_tf);
		this.add("Center", ta);
		this.add("South", south_p);
		south_p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		south_p.add(ok_bt);
		south_p.add(cencle_bt);
	}
	
	public MyFrame13(String title) {
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

public class Exam_13 {
	public static void main(String[] args) {
		MyFrame13 mf = new MyFrame13("awt楷嚼");
	}
}