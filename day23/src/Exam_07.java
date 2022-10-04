import java.net.*;
import java.util.*;
import java.text.*;

public class Exam_07 {	//서버
	public static void main(String[] args) throws Exception {
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		DatagramSocket ds = new DatagramSocket(12345);
		while(true) {
			ds.receive(dp);
			String msg = new String(dp.getData()).trim();
			InetAddress ia = dp.getAddress();
			Date date = new Date();
			SimpleDateFormat sdf = null;
			switch(msg) {
			case "time" :	sdf = new SimpleDateFormat("HH시 mm분 ss초"); break;
			case "date" :	sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); break;
			case "date&time" :	sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초"); break;
			case "exit" :
				System.out.println("서버 프로그램 닫습니다.");
				System.exit(0);
			}
			String data = sdf.format(date);
			DatagramPacket dp2 = new DatagramPacket(data.getBytes(), data.getBytes().length, ia, 12346);
			ds.send(dp2);
		}
	}
}






