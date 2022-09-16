import java.awt.*;

class MyFrame02 extends Frame{ // 자바에 내장된 프레임 클래스를 상속받아 (프레임) 만들기
	public MyFrame02(String title) {
		super(title); // 상위 클래스에게 매개변수 넘겨주기 - 타이틀 찍는 기능이 상위 클래스에 있으므로
		
		super.setSize(400, 300); // Frame.setSiz
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2; //전체화면의 가로 가운데 - frame의 가로 절반값
		int ypos = (int)(screen.getHeight()/2) - this.getWidth()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("awt연습");
	}
}


