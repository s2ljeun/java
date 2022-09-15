import java.awt.*;

class MyFrame03 extends Frame{
	Label lb = new Label("안녕하세요", Label.CENTER); //컴포넌트
	// default는 left, 가운데 center, 오른쪽 right
	
	public MyFrame03(String title) {
		super(title);
		this.add(lb); // 라벨 넣기
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("awt연습");
	}
}