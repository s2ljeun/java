import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame04 extends Frame implements ActionListener{
	private GridLayout gl = new GridLayout(2,1);
	private Panel p = new Panel();
	private GridLayout gl2 = new GridLayout(1,2);
	private Button bt1 = new Button("왼쪽");
	private Button bt2 = new Button("오른쪽");
	private Label lb = new Label("버튼을 누르세요!!");
	
	public void init() {
		this.setLayout(gl);
		this.add(p); // ★그리드에 따라 순차적으로 add
		p.setLayout(gl2);
		
		bt1.setFont(new Font("", Font.ITALIC, 30));
		bt2.setFont(new Font("", Font.ITALIC, 30));

		p.add(bt1);
		p.add(bt2);
		bt1.addActionListener(this);
		bt2.addActionListener(this);

		lb.setFont(new Font("", Font.BOLD, 25));
		this.add(lb); // ★그리드에 따라 순차적으로 add
	}
	
	public MyFrame04(String title) {
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
		if (e.getSource() == bt1) { // 이벤트를 발생시킨 객체가 누군지를 e.getSource()로 알 수 있다.
			lb.setText("왼쪽버튼을 누르셨습니다.");
		}else if (e.getSource() == bt2) {
			lb.setText("오른쪽버튼을 누르셨습니다.");
		}
		
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("awt연습");
	}
}
