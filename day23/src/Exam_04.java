//�ް� ������

import java.net.*;

public class Exam_04 {
	public static void main(String[] args) throws Exception {
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		DatagramSocket ds = new DatagramSocket(12345);
		
		ds.receive(dp);
		
		InetAddress ia = dp.getAddress();//�������� ������ �ּҷ� InetAddress��ü�� �ϼ�
		String msg = new String(dp.getData()).trim();
		DatagramPacket dp2 = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 12346);
		ds.send(dp2);
		ds.close();
	}
}
