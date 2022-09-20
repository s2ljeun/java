package member;
import java.awt.*;

public class InputDialog extends Dialog{
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	private Label tel_lb = new Label("전화번호 : ", Label.RIGHT);
	private TextField tel_tf = new TextField();
	Button input_bt = new Button("입력");
	Button cencle_bt = new Button("취소");

	public Member getMember() {
		String name = name_tf.getText();
		String tel = tel_tf.getText();
		Member mb = new Member(name, tel);
		return mb;
	}
	
	public void clearDialog() {
		name_tf.setText("");
		tel_tf.setText("");
		this.setVisible(false);
	}

	public void init() {
		this.setLayout(new GridLayout(3, 1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", name_lb);
		p1.add(name_tf);
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", tel_lb);
		p2.add(tel_tf);
		this.add(p3);
		p3.setLayout(new GridLayout());
		p3.add(input_bt);
		p3.add(cencle_bt);
	}
	
	public InputDialog(Frame owner, 
					String title, boolean modal) {
		super(owner, title, modal);
		
		this.init();
		super.setSize(200, 150);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}
	
}
