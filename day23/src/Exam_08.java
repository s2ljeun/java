import java.net.*;
import java.util.*;

public class Exam_08 {	//클라이언트
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		InetAddress ia = InetAddress.getByName("localhost");
		DatagramSocket ds = new DatagramSocket(12346);
		while(true) {
			System.out.print("time : date : date&time : exit : ");
			String msg = in.next();
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 12345);
			DatagramPacket dp2 = new DatagramPacket(new byte[65508], 65508);
			ds.send(dp);
			if (msg.equals("exit")) break;
			ds.receive(dp2);		
			System.out.println(new String(dp2.getData()).trim());
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
