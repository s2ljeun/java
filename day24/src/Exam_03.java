import java.net.*;

public class Exam_03 {
	public static void main(String[] args) throws Exception {
		DatagramPacket dp = null;
		DatagramSocket ds = new DatagramSocket(12345);
		
		while(true) {
			dp = new DatagramPacket(new byte[65508], 65508); // 새로 받을 때마다 dp비우기 위해서 while 안으로
			ds.receive(dp);
			System.out.println("받은 데이터: " + new String(dp.getData()).trim());
		}
		//ds.close();
		
	}
}
