import java.awt.*;
class MyFrame05 extends Frame{
	
	Button bt1 = new Button("버튼1");
	Button bt2 = new Button("버튼2");
	Button bt3 = new Button("버튼3");
	Button bt4 = new Button("버튼4");
	Button bt5 = new Button("버튼5");
	Button bt6 = new Button("버튼6");
	Button bt7 = new Button("버튼7");
	Button bt8 = new Button("버튼8");
	
	GridLayout gl = new GridLayout(4,2, 5, 10); // 행,열 정확히 집어넣어야함 / 5px 10px 마진
	
	public MyFrame05(String title) {
		super(title);
		
		this.setLayout(gl); // 레이아웃 적용
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
		MyFrame05 mf = new MyFrame05("awt연습");
	}
}