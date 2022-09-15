import java.awt.*;
class MyFrame07 extends Frame{
	// ������ ����� ���̾ƿ��� ��Ƽ� ������Ʈ �ø��� - �� ������Ʈ�� ���̾ƿ��� �� ����
	private Button bt1 = new Button("YES");
	private Button bt2 = new Button("NO1");
	private Button bt3 = new Button("NO2");
	
	private BorderLayout bl = new BorderLayout();
	private Panel p1 = new Panel(); //default layout = FlowLayout
	private GridLayout gl1 = new GridLayout(1,2);
	private Panel p2 = new Panel();
	private GridLayout gl2 = new GridLayout(2,1);
	
	public void init() {
		this.setLayout(bl); // ��ü ���̾ƿ� ���
		this.add("South", p1); // south�� �г� �ֱ�
		p1.setLayout(gl1); // �г��� �׸��巹�̾ƿ����� ����
		p1.add(bt1); // ���� �׸��巹�̾ƿ��� ��ư 1
		p1.add(p2); // ������ �׸��� ���̾ƿ��� �г� �߰�
		p2.setLayout(gl2);
		p2.add(bt2);
		p2.add(bt3);
		
	}
	
	public MyFrame07(String title) {
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

public class Exam_07 {
	public static void main(String[] args) {
		MyFrame07 mf = new MyFrame07("awt����");
	}
}