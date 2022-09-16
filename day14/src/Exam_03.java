// class�� ��ӹ޴� ���
// adapter�� listener�� ����?? , �͸���øŬ����??

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame03 extends Frame implements ActionListener, MouseListener{
	private Button bt = new Button("����");

	public void init() {
		this.setLayout(new BorderLayout());
		this.add("South", bt);
		bt.addActionListener(this); //MyFrame03�� actionlistener�� ��ӹ޾����Ƿ�, ��ü�� �׼Ǹ������̹Ƿ� this��� ���´�.
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
		bt.setLabel("��ư ���� ���콺�� �ֳ׿�!!");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		bt.setLabel("����");
		
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("awt����");
	}
}
