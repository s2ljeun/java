import java.awt.*;

public class Exam_01 {
	public static void main(String[] args) {
		//Frame f1 = new Frame();
		Frame f2 = new Frame("awt����");
		
		//f1.setSize(400, 300); // ������ ũ�� ����
		f2.setSize(300, 200);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); //��ũ�� ȭ���� ���μ��� ���� ���ؼ� Dimension Ŭ������ �־��

		int xpos = (int)(screen.getWidth()/2) - f2.getWidth()/2; //��üȭ���� ���� ��� - frame�� ���� ���ݰ�
		int ypos = (int)(screen.getHeight()/2) - f2.getWidth()/2;
		f2.setLocation(xpos, ypos);
		//f1.setLocation(300, 300); // �»�� ������ ��ġ ����
		//f2.setLocation(400, 400);
		
		//f1.setVisible(true); // ���̱� ����
		f2.setVisible(true);
		
		f2.setResizable(false); // ������ ũ�� ����
		
	}

}
