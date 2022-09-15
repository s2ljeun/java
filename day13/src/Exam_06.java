import java.awt.*;
class MyFrame06 extends Frame{
	
	Button bt1 = new Button("��ư1");
	Button bt2 = new Button("��ư2");
	Button bt3 = new Button("��ư3");
	Button bt4 = new Button("��ư4");
	Button bt5 = new Button("��ư5");
	
	BorderLayout bl = new BorderLayout(5, 10); // ����
	//FrameŬ������ default Layout
	//add�� �⺻ ��ġ�� Center
	
	public MyFrame06(String title) {
		super(title);
		this.setLayout(bl);
		
		this.add("North", bt1);
		this.add("South", bt2);
		this.add("West", bt3);
//		this.add("East", bt4);
		this.add(bt5); //"Center", bt5
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("awt����");
	}
}