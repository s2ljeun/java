import java.awt.*;
import java.util.*;

class MyFrame17 extends Frame{
	private int year, month, week, lastDay;
	private Scanner in;
	private Calendar cal;
	
	private BorderLayout bl = new BorderLayout();
	private Label north_lb = new Label("");
	private Panel p = new Panel();
	private Button bt[] = new Button[49];
	private String str[] = new String[] {"일", "월", "화", "수", "목", "금", "토"};

	private int co = 0; // 버튼의 위치
	
	public void init() {
		in = new Scanner(System.in);
		System.out.print("년도를 입력: ");
		year = in.nextInt();
		System.out.print("월을 입력: ");
		month = in.nextInt();
		cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		week = cal.get(Calendar.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		north_lb.setText(year+"년" + month +"월"); // 라벨에 글을 새로 써준다
		
		this.setLayout(bl);
		this.add("North", north_lb);
		this.add("Center", p);
		p.setLayout(new GridLayout(7,7));
		for(int i=0; i<str.length; i++) {
			bt[co] = new Button(str[i]);
			p.add(bt[co]);
			co++;
		}
		for(int i=1; i<week; ++i) {
			bt[co] = new Button("");
			p.add(bt[co]);
			co++;
		}
		
		for(int i=1; i<=lastDay; ++i) {
			bt[co] = new Button(String.valueOf(i));
			p.add(bt[co]);
			co++;
		}
		
		for(int i=co; i<bt.length; ++i) {
			bt[i] = new Button("");
			p.add(bt[co]);
			co++;
		}
		
	}
	
	public MyFrame17(String title) {
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

public class Exam_17 {
	public static void main(String[] args) {
		MyFrame17 mf = new MyFrame17("awt연습");
	}
}
