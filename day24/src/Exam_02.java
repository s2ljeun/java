//서버
import java.net.*;

public class Exam_02 {
	public static void main(String[] args) throws Exception{
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		
		MulticastSocket ms = new MulticastSocket(12345);
		InetAddress ia = InetAddress.getByName("226.50.50.50"); // 받을 주소
		ms.joinGroup(ia); // 주소로 조인
		ms.receive(dp); // 조인 후 값 받기
		ms.leaveGroup(ia); // 떠나기
		ms.close(); // 닫기
		
		System.out.println("보낸이: " + dp.getAddress().getHostAddress());
		System.out.println("내용물: " + new String(dp.getData()).trim());
	}
}
