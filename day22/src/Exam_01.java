// TCP���
// ������ ��Ʈ��ȣ�� ���ϱ� ���� �������� �����
import java.io.*;
import java.net.*;

public class Exam_01 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		for(int i=0; i<65535; ++i) { // ��Ʈ��ȣ�� 0������ 65535���� ����� �� �ִ�
			// ��Ʈ��ȣ�� 0 ~ 1023�������� �� �˷��� ��Ʈ��ȣ��� �ؼ� ������� �ʴ´�
			// 49152 ~ 65535�������� ������Ʈ��ȣ��� �ؼ� (����) ���̰� �ִ�
			try {
				ss = new ServerSocket(i);
				ss.close();
			}catch(IOException e) {
				System.out.println(i+ "�� ��Ʈ��ȣ�� ��� ��!!");
			}
		}
	}

}
