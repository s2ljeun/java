import java.net.*;

public class Exam_04 {
	public static void main(String[] args) throws Exception {
		String msg = "SilSeup";
		InetAddress ia = InetAddress.getByName("192.168.0.255"); // ��ε�ĳ��Ʈ �ּ�
		
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 12345);
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		ds.close();
		
	}
}
