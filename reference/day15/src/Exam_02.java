import java.awt.*;
import java.awt.event.*;

class MyFrame02 extends Frame implements ActionListener{
	private Button bt = new Button("확인");
	int co = 1;
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("South", bt);
		bt.addActionListener(this);
	}

	public void update(Graphics g) {
		//Graphics 클래스를 이용한 그림그리기 구현하기 위해 초기화 시켜주는 곳 
        paint(g);
    }
	public void paint(Graphics g) {
		//실제 Graphics 클래스를 이용하여 그림그리기 구현하는 곳
		g.drawLine(50,50,100,100);//직선그리기 : 1,2매개변수의 좌표와 3,4매개변수의 좌표를 일직선으로 만든다
		g.drawRect(50,50,100,100);//직사각형그리기 : 1,2매개변수는 시작좌표, 3번째는 가로로 이동, 4번째 세로로 이동하여 선을 그어 만든다
		g.setColor(Color.red);
		g.fillRect(200,50,100,100);
		g.fillOval(50,50,100,100);//원그리기 : 좌표로 직사각형을 만들어 그 사각형을 최대로 하는 원을 만든다
		int x[] = new int[] {70, 120, 100};
		int y[] = new int[] {70, 100, 130};
		g.setColor(Color.blue);
		//g.fillPolygon(x, y, 3);//x배열과 y배열의 값을 하나씩 꺼내 좌표를 잡고 그 선을 연결한다
		//poligon과 polyline의 차이점은 마지막 선을 완성한다 안한다의 차이
		g.drawPolyline(x, y, 3);
		g.setFont(new Font("", Font.BOLD, 30));
		g.drawString("안녕하세요", 50, 200);
		
		Image img = Toolkit.getDefaultToolkit().getImage("iu.png");
		g.drawImage(img, 50,50,300,300, this);
		//System.out.println("co = " + co);
		//co++;
	}
	//Graphics 클래스를 구현하기 위한 paint메소드가 실행되는 시점 3가지
	//Frame이 화면에 뜰때, update메소드가 불려가 먼저 실행이 된다
	//Frame의 사이즈가 변경이 될때 다시 실행이 된다
	//repaint 메소드를 실행시킬때 다시 실행이 된다
		
	public MyFrame02(String title) {
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
		repaint();
		
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("awt연습");
	}
}