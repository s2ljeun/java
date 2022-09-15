import java.awt.*;

public class Exam_01 {
	public static void main(String[] args) {
		//Frame f1 = new Frame();
		Frame f2 = new Frame("awt연습");
		
		//f1.setSize(400, 300); // 프레임 크기 설정
		f2.setSize(300, 200);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); //스크린 화면의 가로세로 값을 구해서 Dimension 클래스에 넣어라

		int xpos = (int)(screen.getWidth()/2) - f2.getWidth()/2; //전체화면의 가로 가운데 - frame의 가로 절반값
		int ypos = (int)(screen.getHeight()/2) - f2.getWidth()/2;
		f2.setLocation(xpos, ypos);
		//f1.setLocation(300, 300); // 좌상단 꼭짓점 위치 설정
		//f2.setLocation(400, 400);
		
		//f1.setVisible(true); // 보이기 설정
		f2.setVisible(true);
		
		f2.setResizable(false); // 프레임 크기 고정
		
	}

}
