import java.awt.*;
class MyFrame14 extends Frame{
	private Dialog dlg = new Dialog(this, "�˸�", true);
	private Label lb = new Label("���ο� â�� ���� ���� ����ϴ� ������Ʈ");
	private Panel p = new Panel();
	private Button bt = new Button("Ȯ��");
	
	public void init() {
		dlg.setLayout(new BorderLayout());
		dlg.add("Center", lb);
		dlg.add("South", p);
		p.setLayout(new FlowLayout());
		p.add(bt);
		
	}
	
	public MyFrame14(String title) {
		super(title);
		this.init();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		dlg.setBounds(xpos, ypos, 300, 150);
		//setSize() + setLocation() : ���� 2�ڸ��� location��, �� ���ڸ��� size��
		dlg.setResizable(false);
		dlg.setVisible(true);
	}
}

public class Exam_14 {
	public static void main(String[] args) {
		MyFrame14 mf = new MyFrame14("awt����");
	}
}