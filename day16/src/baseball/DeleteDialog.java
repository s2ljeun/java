package baseball;
import java.awt.*;

public class DeleteDialog extends Dialog {
	private Panel p1 = new Panel();
	private Label club_lb = new Label("현재구단: ", Label.RIGHT);
	private Choice club_ch = new Choice();
	
	private Panel p2 = new Panel();
	private Label name_lb = new Label("이름: ", Label.RIGHT);
	private TextField name_tf = new TextField();
	
	Button delete_bt = new Button("삭제");
	
	public void init() {
		this.setLayout(new GridLayout(3,1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", club_lb);
		p1.add("Center", club_ch);
		
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", name_lb);
		p2.add("Center", name_tf);
				
		this.add(delete_bt);

	}

	public DeleteDialog(Frame owner, String title, boolean modal) {
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
