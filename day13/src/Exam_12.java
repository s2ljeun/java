import java.awt.*;

class MyFrame12 extends Frame{
	private BorderLayout bl = new BorderLayout();
	private Label lb = new Label("알파벳목록", Label.CENTER);
	private List list = new List(5, true); // true -> 리스트 여러개 선택 가능
	
	public void init() {
		this.setLayout(bl);
		this.add("North", lb);
		this.add("Center", list);
		for(char i='a'; i<='z'; ++i) {
			list.add(""+i+i+i);
		}
	}
	
	public MyFrame12(String title) {
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

public class Exam_12 {
	public static void main(String[] args) {
		MyFrame12 mf = new MyFrame12("awt연습");
	}
}