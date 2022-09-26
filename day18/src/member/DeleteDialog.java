package member;

import java.awt.*;

public class DeleteDialog extends Dialog{
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	Button input_bt = new Button("입력");

	public String getName() {
		return name_tf.getText();
	}
	
	public void clearDialog() {
		name_tf.setText("");
		this.setVisible(false);
	}

	public void init() {
		this.setLayout(new GridLayout(2, 1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", name_lb);
		p1.add(name_tf);
		this.add(p2);
		p2.setLayout(new FlowLayout());
		p2.add(input_bt);
	}
	
	public DeleteDialog(Frame owner, 
					String title, boolean modal) {
		super(owner, title, modal);
		
		this.init();
		super.setSize(200, 100);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}
	
}