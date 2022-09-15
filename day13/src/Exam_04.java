import java.awt.*;
class MyFrame04 extends Frame{
	Button bt1 = new Button("버튼1");
	Button bt2 = new Button("버튼2");
	
	FlowLayout f1 = new FlowLayout(FlowLayout.LEFT); // FlowLayout
	//default는 CENTER, 왼쪽기준정렬 FlowLayout.LEFT, 오른쪽기준정렬 FlowLayout.RIGHT
	
	public MyFrame04(String title) {
		super(title);
		
		this.setLayout(f1);
		this.add(bt1); // 버튼 넣기
		this.add(bt2);
		
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("awt연습");
	}
}