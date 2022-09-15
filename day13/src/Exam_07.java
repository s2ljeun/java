import java.awt.*;
class MyFrame07 extends Frame{
	// 프레임 만들고 레이아웃을 잡아서 컴포넌트 올리기 - 각 컴포넌트는 레이아웃을 꽉 차지
	private Button bt1 = new Button("YES");
	private Button bt2 = new Button("NO1");
	private Button bt3 = new Button("NO2");
	
	private BorderLayout bl = new BorderLayout();
	private Panel p1 = new Panel(); //default layout = FlowLayout
	private GridLayout gl1 = new GridLayout(1,2);
	private Panel p2 = new Panel();
	private GridLayout gl2 = new GridLayout(2,1);
	
	public void init() {
		this.setLayout(bl); // 전체 레이아웃 잡기
		this.add("South", p1); // south에 패널 넣기
		p1.setLayout(gl1); // 패널을 그리드레이아웃으로 설정
		p1.add(bt1); // 왼쪽 그리드레이아웃에 버튼 1
		p1.add(p2); // 오른쪽 그리드 레이아웃에 패널 추가
		p2.setLayout(gl2);
		p2.add(bt2);
		p2.add(bt3);
		
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
}

public class Exam_07 {
	public static void main(String[] args) {
		MyFrame07 mf = new MyFrame07("awt연습");
	}
}