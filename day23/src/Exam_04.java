//받고 보내기

import java.net.*;

public class Exam_04 {
	public static void main(String[] args) throws Exception {
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		DatagramSocket ds = new DatagramSocket(12345);
		
		ds.receive(dp);
		
		InetAddress ia = dp.getAddress();//보낸곳의 아이피 주소로 InetAddress객체를 완성
		String msg = new String(dp.getData()).trim();
		DatagramPacket dp2 = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 12346);
		ds.send(dp2);
		ds.close();
	}
}
