import java.awt.*;
import java.awt.event.*;

class MyFrame01 extends Frame{
	private Button bt = new Button("����");
	
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("South", bt);
		MyEvent01 me = new MyEvent01(); // ActionListener ��ü�� ���� ��
		bt.addActionListener(me); // �̺�Ʈó���޼ҵ忡 �Ű������� �־��ش�
		//���̺�Ʈ�ڵ鷯�� ���� ó���� / ��ó�� �̺�Ʈ�� �ɸ� �̺�Ʈ �ڵ鷯�� �̺�Ʈó���޼ҵ带 �޸𸮿� �ø��� �ִٰ� �̺�Ʈ ������ �Ű������� ������ => ��Ƽ������
	}
	
	public MyFrame01(String title) {
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


class MyEvent01 implements ActionListener{ // �� ������� �ʴ� ���

	@Override // ��ӹ��� �������̽��� ������ �ִ� �޼ҵ带 �������̵�
	public void actionPerformed(ActionEvent e) { //���̺�Ʈ �ڵ鷯�� ActionEvent e ��� �Ű������� ����(?)
		System.exit(0);
		
	}
	
}

public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("awt����");
	}
}
