import java.awt.*;
class MyFrame05 extends Frame{
	
	Button bt1 = new Button("��ư1");
	Button bt2 = new Button("��ư2");
	Button bt3 = new Button("��ư3");
	Button bt4 = new Button("��ư4");
	Button bt5 = new Button("��ư5");
	Button bt6 = new Button("��ư6");
	Button bt7 = new Button("��ư7");
	Button bt8 = new Button("��ư8");
	
	GridLayout gl = new GridLayout(4,2, 5, 10); // ��,�� ��Ȯ�� ����־���� / 5px 10px ����
	
	public MyFrame05(String title) {
		super(title);
		
		this.setLayout(gl); // ���̾ƿ� ����
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		this.add(bt7);
		this.add(bt8);
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("awt����");
	}
}