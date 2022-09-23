package baseball;

import java.awt.*;

public class DeleteDialog extends Dialog{
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
  	
	private Label team_lb = new Label("현재구단 : ", Label.RIGHT);
	private Choice team_tf = new Choice();
	private Label name_lb = new Label("선수이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	protected Button input_bt = new Button("삭제");
	protected Button cencle_bt = new Button("취소");

	public void teamSetting(String[] team) {
		for(int i=0; i<team.length; ++i) {
			team_tf.add(team[i]);
		}
	}
	
	public String getName() {
		return name_tf.getText();
	}
	
	public String getTeam() {
		return team_tf.getSelectedItem();
	}
	
	public void clearDialog() {
		name_tf.setText("");
		this.setVisible(false);
	}

	public void init() {
		this.setLayout(new GridLayout(3, 1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", team_lb);
		p1.add(team_tf);
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", name_lb);
		p2.add(name_tf);
		this.add(p3);
		p3.setLayout(new GridLayout());
		p3.add(input_bt);
		p3.add(cencle_bt);
	}
	
	public DeleteDialog(Frame owner, 
					String title, boolean modal) {
		super(owner, title, modal);
		
		this.init();
		super.setSize(200, 120);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}
	
}