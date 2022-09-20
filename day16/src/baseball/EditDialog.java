package baseball;
import java.awt.*;

public class EditDialog extends Dialog {
	private Panel p1 = new Panel();
	private Label club_lb = new Label("현재구단: ", Label.RIGHT);
	private Choice club_ch = new Choice();
	
	private Panel p2 = new Panel();
	private Label name_lb = new Label("이름: ", Label.RIGHT);
	private TextField name_tf = new TextField();
	
	private Panel p3 = new Panel();
	private Label move_lb = new Label("옮길구단: ", Label.RIGHT);
	private Choice move_ch = new Choice();
	
	private Panel p4 = new Panel();
	Button input_bt = new Button("입력");
	Button cancle_bt = new Button("취소");
	
	public void clearDialog() {
		name_tf.setText("");
		setVisible(false);
	}
	
	
	public void init() {
		this.setLayout(new GridLayout(4,1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", club_lb);
		p1.add("Center", club_ch);
		
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", name_lb);
		p2.add("Center", name_tf);
		
		this.add(p3);
		p3.setLayout(new BorderLayout());
		p3.add("West", move_lb);
		p3.add("Center", move_ch);
		
		this.add(p4);
		p4.setLayout(new GridLayout(1,2));
		p4.add(input_bt);
		p4.add(cancle_bt);

	}

	public EditDialog(Frame owner, String title, boolean modal) {
		super(owner);
		this.init();
		super.setSize(200, 200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}

}
