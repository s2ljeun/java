import java.awt.*;

class MyFrame02 extends Frame{ // �ڹٿ� ����� ������ Ŭ������ ��ӹ޾� (������) �����
	public MyFrame02(String title) {
		super(title); // ���� Ŭ�������� �Ű����� �Ѱ��ֱ� - Ÿ��Ʋ ��� ����� ���� Ŭ������ �����Ƿ�
		
		super.setSize(400, 300); // Frame.setSiz
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2; //��üȭ���� ���� ��� - frame�� ���� ���ݰ�
		int ypos = (int)(screen.getHeight()/2) - this.getWidth()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("awt����");
	}
}


