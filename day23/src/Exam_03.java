//������ �ޱ�

import java.net.*;

public class Exam_03 {
	public static void main(String[] args) throws Exception {
		String msg = "Hello, Java!!";
		InetAddress ia = InetAddress.getByName("localhost");
		DatagramPacket dp = new DatagramPacket
				(msg.getBytes(), msg.getBytes().length, ia, 12345);
		DatagramSocket ds = new DatagramSocket(12346);
		ds.send(dp);
		
		DatagramPacket dp2 = new DatagramPacket(new byte[65508], 65508);
		ds.receive(dp2);
		ds.close();
		
		System.out.println("���۵� ���� : " + new String(dp2.getData()).trim());
	}
}
