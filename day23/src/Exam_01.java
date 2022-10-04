// UDP통신: 자료 보내는 곳
// UDP통신: byte/object통신 <-> TCP통신: +text통신

import java.net.*;
import java.io.*;

public class Exam_01 {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		InetAddress ia = null;
		
		String msg = "Hello, java!!";
		byte[] data = msg.getBytes(); // UDP 통신은 byte/obj 통신만 가능하기 떄문에 byte배열로 변경
		
		try {
			ia = InetAddress.getByName("localhost"); // 상대방 주소 구하기
			dp = new DatagramPacket(data, data.length, ia, 12345); // 데이터, 데이터의 길이, 상대방 주소, 상대방 포트번호
			ds = new DatagramSocket(); // 데이터 받을 곳은 비워두기
			ds.send(dp); // 발송
			ds.close(); // 닫기
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.print("전송 완료!!");
				
		
	}
}
