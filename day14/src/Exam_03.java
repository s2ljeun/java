// class에 상속받는 방식
// adapter와 listener의 차이?? , 익명중첩클래스??

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame03 extends Frame implements ActionListener, MouseListener{
	private Button bt = new Button("종료");

	public void init() {
		this.setLayout(new BorderLayout());
		this.add("South", bt);
		bt.addActionListener(this); //MyFrame03가 actionlistener를 상속받았으므로, 자체가 액션리스너이므로 this라고 적는다.
		bt.addMouseListener(this);
		WindowAdapter wa = new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		};
		this.addWindowListener(wa);
	}
	
	public MyFrame03(String title) {
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

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		bt.setLabel("버튼 위에 마우스가 있네요!!");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		bt.setLabel("종료");
		
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("awt연습");
	}
}
