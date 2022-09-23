package baseball;
import java.awt.*;

public class InputDialog extends Dialog{
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	private Panel p4 = new Panel();
	
	private Label team_lb = new Label("구단 : ", Label.RIGHT);
	private Choice team_tf = new Choice();
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	private Label salary_lb = new Label("연봉 : ", Label.RIGHT);
	private TextField salary_tf = new TextField();
	protected Button input_bt = new Button("입력");
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
	
	public int getSalary() {
		return Integer.parseInt(salary_tf.getText());
	}
	
	public void clearDialog() {
		name_tf.setText("");
		salary_tf.setText("");
		this.setVisible(false);
	}

	public void init() {
		this.setLayout(new GridLayout(4, 1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", team_lb);
		p1.add(team_tf);
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", name_lb);
		p2.add(name_tf);
		this.add(p3);
		p3.setLayout(new BorderLayout());
		p3.add("West", salary_lb);
		p3.add(salary_tf);
		this.add(p4);
		p4.setLayout(new GridLayout());
		p4.add(input_bt);
		p4.add(cencle_bt);
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
