import java.net.*;

public class Exam_03 {
	public static void main(String[] args) throws Exception {
		DatagramPacket dp = null;
		DatagramSocket ds = new DatagramSocket(12345);
		
		while(true) {
			dp = new DatagramPacket(new byte[65508], 65508); // ���� ���� ������ dp���� ���ؼ� while ������
			ds.receive(dp);
			System.out.println("���� ������: " + new String(dp.getData()).trim());
		}
		//ds.close();
		
	}
}
