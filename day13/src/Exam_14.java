import java.awt.*;
class MyFrame14 extends Frame{
	private Dialog dlg = new Dialog(this, "알림", true);
	private Label lb = new Label("새로운 창을 띄우기 위해 사용하는 컴포넌트");
	private Panel p = new Panel();
	private Button bt = new Button("확인");
	
	public void init() {
		dlg.setLayout(new BorderLayout());
		dlg.add("Center", lb);
		dlg.add("South", p);
		p.setLayout(new FlowLayout());
		p.add(bt);
		
	}
	
	public MyFrame14(String title) {
		super(title);
		this.init();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		dlg.setBounds(xpos, ypos, 300, 150);
		//setSize() + setLocation() : 앞의 2자리는 location값, 뒤 두자리는 size값
		dlg.setResizable(false);
		dlg.setVisible(true);
	}
}

public class Exam_14 {
	public static void main(String[] args) {
		MyFrame14 mf = new MyFrame14("awt연습");
	}
}