import java.awt.*;
import java.awt.event.*;

class MyFrame02 extends Frame{
	private Button bt = new Button("����");
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("South", bt);
		MyEvent002 me = new MyEvent002();
		bt.addMouseListener(me);
	}
	
	public MyFrame02(String title) {
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

class MyEvent002 extends MouseAdapter{ // �̰͵� �� ������� ����

	@Override // ��Ŭ�� > source > override/implement methods
	public void mouseClicked(MouseEvent e) {
		System.exit(0);
	}
	
}

public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("awt����");
	}
}
