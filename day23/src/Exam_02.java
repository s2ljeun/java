// UDP통신: 자료 받는 곳
// -> 단방향 통신이기 때문에 받기만 하면 된다

import java.net.*;
import java.io.*;

public class Exam_02 {
	public static void main(String[] args) throws Exception{
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		DatagramSocket ds = new DatagramSocket(12345); // 받는 곳은 반드시 포트번호를 넣어서 객체를 만들어준다
		
		ds.receive(dp); //dp에 담기
		ds.close(); //닫기
		
		System.out.println("접속자 정보: " + dp.getAddress());
		System.out.println("전송 내용: " + new String(dp.getData())); // byte배열을 String으로 변환
		
	
	}
}
