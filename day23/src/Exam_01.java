// UDP���: �ڷ� ������ ��
// UDP���: byte/object��� <-> TCP���: +text���

import java.net.*;
import java.io.*;

public class Exam_01 {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		InetAddress ia = null;
		
		String msg = "Hello, java!!";
		byte[] data = msg.getBytes(); // UDP ����� byte/obj ��Ÿ� �����ϱ� ������ byte�迭�� ����
		
		try {
			ia = InetAddress.getByName("localhost"); // ���� �ּ� ���ϱ�
			dp = new DatagramPacket(data, data.length, ia, 12345); // ������, �������� ����, ���� �ּ�, ���� ��Ʈ��ȣ
			ds = new DatagramSocket(); // ������ ���� ���� ����α�
			ds.send(dp); // �߼�
			ds.close(); // �ݱ�
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.print("���� �Ϸ�!!");
				
		
	}
}
