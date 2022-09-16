import java.awt.*;
import java.awt.event.*;

class MyFrame07 extends Frame implements ActionListener{
	private Panel p = new Panel();
	private Label lb1 = new Label("좋아하는 연예인은?");
	private Panel p1 = new Panel();
	private Checkbox cb[] = new Checkbox[5];
	String[] str = new String[] {"츄", "승희", "지효", "모모", "비니"};
	private Button bt = new Button("확인");
	
	private Font font = new Font("", Font.PLAIN, 20);
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add(p);
		p.setLayout(new GridLayout(2, 1));
		lb1.setFont(font);
		p.add(lb1);
		p.add(p1);
		p1.setLayout(new GridLayout(1, 5));
		for(int i=0; i<cb.length; i++) {
			cb[i] = new Checkbox(str[i]);
			p1.add(cb[i]);
		}
		this.add("South", bt);
		bt.addActionListener(this);
	}
	
	public MyFrame07(String title) {
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
		System.out.print("당신이 좋아하는 연애인 : ");
		for(int i=0; i<cb.length; ++i) {
			if (cb[i].getState()) {
				System.out.print(cb[i].getLabel() +" ");
			}
		}
		
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		MyFrame07 mf = new MyFrame07("awt연습");
	}
}