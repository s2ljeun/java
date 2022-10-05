import java.io.*;
import java.net.*;

class A11 implements Serializable{
	int a = 10;
	transient int b = 20;
}

public class Exam_11 {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		ObjectOutputStream oos = null;
		try {
			ds = new DatagramSocket();
			A11 ap = new A11();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(ap);
			oos.close();
			byte[] by = baos.toByteArray();
			InetAddress ia = InetAddress.getByName("localhost");
			dp = new DatagramPacket(by, by.length, ia, 12345);
			ds.send(dp);
			ds.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}









