// ip�� �����ϱ� ����
import java.net.*;
import java.net.UnknownHostException;

public class Exam_02 {
	public static void main(String[] args) throws UnknownHostException{
		//���� �� ���ϱ�
		/*
		//DNS ������ ����(�� ����) �ٸ� ���� �����ּҸ� ���� �� �ִ� - ���̹��� ���� ��� ������ ���������� pc���� ���µ� ������ 2�������� ���� (�� ������ ������ ���ӹ�� X)
		InetAddress ia[] = InetAddress.getAllByName("www.naver.com");
		for(int i=0; i<ia.length; ++i) {
			System.out.println("�ּ�: " + ia[i].getHostAddress());
			System.out.println("ȣ��Ʈ�̸�: " + ia[i].getHostName());
		}
		*/
		
		// ip�ּҿ� 1)localhost 2)127.0.0.1 3)�ڽ��� ip�ּ� - ��� �ڽ��� ����Ű�� �ּ��̴� (192.168.0.220 �� ...)
		
		//�� ��  ���ϱ�
		InetAddress ia = null;
		try {
			ia = InetAddress.getByName("localhost"); //www.naver.com //nw.ezenac.co.kr
			System.out.println("�ּ�: " + ia.getHostAddress());
			System.out.println("ȣ��Ʈ�̸�: " + ia.getHostName());
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
