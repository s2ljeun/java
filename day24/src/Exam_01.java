//Ŭ
import java.net.*;

public class Exam_01 {
	public static void main(String[] args) throws Exception {
		String msg = "Chui up plz...^^";
		
		InetAddress ia = InetAddress.getByName("226.50.50.50"); //��Ƽĳ��Ʈ�� �ּ�
		DatagramPacket dp = new DatagramPacket(msg.getBytes(),
							msg.getBytes().length, ia, 12345);
		MulticastSocket ms = new MulticastSocket();
		ms.send(dp); // ������
		ms.close();
		
	}

}
