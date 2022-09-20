import java.awt.*;
class MyButton01 extends Button{ // 버튼 기능을 사용하고 추가기능을 씌우기 위해 상속받는다
	private Image img;
	public MyButton01() {
		img = Toolkit.getDefaultToolkit().getImage("cww.jpg");
	}
	public void paint(Graphics g) {
		g.drawImage(img, 5,5,this.getWidth()-10, this.getHeight()-10, this); // 이미지를 꽉 채우지 않고 버튼 티 내려고 -10~
	}
}

class MyFrame01 extends Frame{
	private MyButton01 bt = new MyButton01();

	public MyFrame01(String title) {
		super(title);
		this.add(bt);
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("awt연습");
	}
}
