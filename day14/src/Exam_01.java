import java.awt.*;
import java.awt.event.*;

class MyFrame01 extends Frame{
	private Button bt = new Button("종료");
	
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("South", bt);
		MyEvent01 me = new MyEvent01(); // ActionListener 객체를 만든 후
		bt.addActionListener(me); // 이벤트처리메소드에 매개변수로 넣어준다
		//★이벤트핸들러에 의해 처리됨 / 위처럼 이벤트를 걸면 이벤트 핸들러가 이벤트처리메소드를 메모리에 올리고 있다가 이벤트 감지시 매개변수로 보낸다 => 멀티스레드
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


class MyEvent01 implements ActionListener{ // 잘 사용하지 않는 방식

	@Override // 상속받은 인터페이스가 가지고 있던 메소드를 오버라이드
	public void actionPerformed(ActionEvent e) { //★이벤트 핸들러가 ActionEvent e 라는 매개변수에 보냄(?)
		System.exit(0);
		
	}
	
}

public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("awt연습");
	}
}
