import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame04 extends Frame implements ActionListener{
	private GridLayout gl = new GridLayout(2,1);
	private Panel p = new Panel();
	private GridLayout gl2 = new GridLayout(1,2);
	private Button bt1 = new Button("����");
	private Button bt2 = new Button("������");
	private Label lb = new Label("��ư�� ��������!!");
	
	public void init() {
		this.setLayout(gl);
		this.add(p); // �ڱ׸��忡 ���� ���������� add
		p.setLayout(gl2);
		
		bt1.setFont(new Font("", Font.ITALIC, 30));
		bt2.setFont(new Font("", Font.ITALIC, 30));

		p.add(bt1);
		p.add(bt2);
		bt1.addActionListener(this);
		bt2.addActionListener(this);

		lb.setFont(new Font("", Font.BOLD, 25));
		this.add(lb); // �ڱ׸��忡 ���� ���������� add
	}
	
	public MyFrame04(String title) {
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1) { // �̺�Ʈ�� �߻���Ų ��ü�� �������� e.getSource()�� �� �� �ִ�.
			lb.setText("���ʹ�ư�� �����̽��ϴ�.");
		}else if (e.getSource() == bt2) {
			lb.setText("�����ʹ�ư�� �����̽��ϴ�.");
		}
		
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("awt����");
	}
}
