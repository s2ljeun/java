import java.awt.*;
class MyFrame11 extends Frame{
	private GridLayout gl = new GridLayout(2,1);
	private Label lb = new Label("당신이 좋아하는 구단은?");
	private Choice ch = new Choice();
	
	public void init() {
		this.setLayout(gl);
		lb.setFont(new Font("", Font.BOLD, 25));
		this.add(lb);
		ch.setFont(new Font("", Font.PLAIN, 15));
		this.add(ch);
		
		String[] teamName = new String[] 
				{"SSG", "LG", "KT", "키움", "기아", "NC", "롯데", "삼성", "두산", "한화"};
		for(int i=0; i<teamName.length; ++i) {
			ch.add(teamName[i]);
		}
	}
	
	public MyFrame11(String title) {
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

public class Exam_11 {
	public static void main(String[] args) {
		MyFrame11 mf = new MyFrame11("awt연습");
	}
}