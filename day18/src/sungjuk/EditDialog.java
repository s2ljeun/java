package sungjuk;

import java.awt.*;

public class EditDialog extends Dialog{
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	private Panel p4 = new Panel();
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	private Label kor_lb = new Label("국어 : ", Label.RIGHT);
	private TextField kor_tf = new TextField();
	private Label eng_lb = new Label("영어 : ", Label.RIGHT);
	private TextField eng_tf = new TextField();
	Button input_bt = new Button("수정");
	Button cencle_bt = new Button("취소");

	public Student getStudent() {
		String name = name_tf.getText();
		int kor = Integer.parseInt(kor_tf.getText());
		int eng = Integer.parseInt(eng_tf.getText());
		Student st = new Student(name, kor, eng);
		return st;
	}
	
	public void setStudent(Student st) {
		name_tf.setText(st.getName());
		kor_tf.setText(String.valueOf(st.getKor()));
		eng_tf.setText(String.valueOf(st.getEng()));
	}
	
	public void clearDialog() {
		name_tf.setText("");
		kor_tf.setText("");
		eng_tf.setText("");
		setVisible(false);
	}
	
	public void init() {
		this.setLayout(new GridLayout(4, 1));
		this.add(p1);
		p1.setLayout(new BorderLayout());
		p1.add("West", name_lb);
		name_tf.setEditable(false);
		p1.add(name_tf);
		this.add(p2);
		p2.setLayout(new BorderLayout());
		p2.add("West", kor_lb);
		p2.add(kor_tf);
		this.add(p3);
		p3.setLayout(new BorderLayout());
		p3.add("West", eng_lb);
		p3.add(eng_tf);
		this.add(p4);
		p4.setLayout(new GridLayout());
		p4.add(input_bt);
		p4.add(cencle_bt);
	}
	
	public EditDialog(Frame owner, 
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