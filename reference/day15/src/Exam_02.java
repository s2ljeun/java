import java.awt.*;
import java.awt.event.*;

class MyFrame02 extends Frame implements ActionListener{
	private Button bt = new Button("Ȯ��");
	int co = 1;
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("South", bt);
		bt.addActionListener(this);
	}

	public void update(Graphics g) {
		//Graphics Ŭ������ �̿��� �׸��׸��� �����ϱ� ���� �ʱ�ȭ �����ִ� �� 
        paint(g);
    }
	public void paint(Graphics g) {
		//���� Graphics Ŭ������ �̿��Ͽ� �׸��׸��� �����ϴ� ��
		g.drawLine(50,50,100,100);//�����׸��� : 1,2�Ű������� ��ǥ�� 3,4�Ű������� ��ǥ�� ���������� �����
		g.drawRect(50,50,100,100);//���簢���׸��� : 1,2�Ű������� ������ǥ, 3��°�� ���η� �̵�, 4��° ���η� �̵��Ͽ� ���� �׾� �����
		g.setColor(Color.red);
		g.fillRect(200,50,100,100);
		g.fillOval(50,50,100,100);//���׸��� : ��ǥ�� ���簢���� ����� �� �簢���� �ִ�� �ϴ� ���� �����
		int x[] = new int[] {70, 120, 100};
		int y[] = new int[] {70, 100, 130};
		g.setColor(Color.blue);
		//g.fillPolygon(x, y, 3);//x�迭�� y�迭�� ���� �ϳ��� ���� ��ǥ�� ��� �� ���� �����Ѵ�
		//poligon�� polyline�� �������� ������ ���� �ϼ��Ѵ� ���Ѵ��� ����
		g.drawPolyline(x, y, 3);
		g.setFont(new Font("", Font.BOLD, 30));
		g.drawString("�ȳ��ϼ���", 50, 200);
		
		Image img = Toolkit.getDefaultToolkit().getImage("iu.png");
		g.drawImage(img, 50,50,300,300, this);
		//System.out.println("co = " + co);
		//co++;
	}
	//Graphics Ŭ������ �����ϱ� ���� paint�޼ҵ尡 ����Ǵ� ���� 3����
	//Frame�� ȭ�鿡 �㶧, update�޼ҵ尡 �ҷ��� ���� ������ �ȴ�
	//Frame�� ����� ������ �ɶ� �ٽ� ������ �ȴ�
	//repaint �޼ҵ带 �����ų�� �ٽ� ������ �ȴ�
		
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
		MyFrame02 mf = new MyFrame02("awt����");
	}
}