package baseball;
import java.awt.*;

public class InputDialog extends Dialog {
	private Panel p1 = new Panel();
	private Label club_lb = new Label("구단: ", Label.RIGHT);
	private Choice club_ch = new Choice();
	
	private Panel p2 = new Panel();
	private Label name_lb = new Label("이름: ", Label.RIGHT);
	private TextField name_tf = new TextField();
	
	private Panel p3 = new Panel();
	private Label salary_lb = new Label("연봉: ", Label.RIGHT);
	private TextField salary_tf = new TextField();
	
	private Panel p4 = new Panel();
	Button input_bt = new Button("입력");
	Button cancle_bt = new Button("취소");
	
//	private BaseballPro pro = new BaseballProImpl();
	
	public void clearDialog() {
		name_tf.setText("");
		salary_tf.setText("");
		setVisible(false);
	}
	
	
	public void init() {
		this.setLayout(new GridLayout(4,1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", club_lb);
		p1.add("Center", club_ch); //club_ch 안에 구단선택지 더해주기 //HashTable에서 key값을 어떻게 가져오냐고~
//		club_ch.add();
		
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", name_lb);
		p2.add("Center", name_tf);
		
		this.add(p3);
		p3.setLayout(new BorderLayout());
		p3.add("West", salary_lb);
		p3.add("Center", salary_tf);
		
		this.add(p4);
		p4.setLayout(new GridLayout(1,2));
		p4.add(input_bt);
		p4.add(cancle_bt);

	}

	public InputDialog(Frame owner, String title, boolean modal) {
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
