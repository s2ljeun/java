// UDP���: �ڷ� �޴� ��
// -> �ܹ��� ����̱� ������ �ޱ⸸ �ϸ� �ȴ�

import java.net.*;
import java.io.*;

public class Exam_02 {
	public static void main(String[] args) throws Exception{
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		DatagramSocket ds = new DatagramSocket(12345); // �޴� ���� �ݵ�� ��Ʈ��ȣ�� �־ ��ü�� ������ش�
		
		ds.receive(dp); //dp�� ���
		ds.close(); //�ݱ�
		
		System.out.println("������ ����: " + dp.getAddress());
		System.out.println("���� ����: " + new String(dp.getData())); // byte�迭�� String���� ��ȯ
		
	
	}
}
