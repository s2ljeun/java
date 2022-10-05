//클
import java.net.*;

public class Exam_01 {
	public static void main(String[] args) throws Exception {
		String msg = "Chui up plz...^^";
		
		InetAddress ia = InetAddress.getByName("226.50.50.50"); //멀티캐스트용 주소
		DatagramPacket dp = new DatagramPacket(msg.getBytes(),
							msg.getBytes().length, ia, 12345);
		MulticastSocket ms = new MulticastSocket();
		ms.send(dp); // 보내기
		ms.close();
		
	}

}
