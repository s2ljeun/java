import java.net.*;
import java.util.*;

public class Exam_05 extends Thread{
	private DatagramPacket send_dp, receive_dp;
	private DatagramSocket ds;
	private InetAddress ia;
	private Scanner in;
	
	public Exam_05() {
		try {
			ia = InetAddress.getByName("localhost");
			ds = new DatagramSocket(12345);
			in = new Scanner(System.in);
		}catch(Exception e) {
			e.printStackTrace();
		}
		this.start();
		sendMessage();
	}
	
	public void sendMessage() {
		while(true) {
			try {
				System.out.print("전송할 메세지 : ");
				String msg = in.next();
				send_dp = new DatagramPacket(msg.getBytes(), 
									msg.getBytes().length, ia, 12346);
				ds.send(send_dp);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				receive_dp = new DatagramPacket(new byte[65508], 65508);
				ds.receive(receive_dp);
				String msg = new String(receive_dp.getData()).trim();
				System.out.println("받은 메세지 : " + msg);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new Exam_05();
	}
}









