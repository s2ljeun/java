import java.net.*;
import java.io.*;

public class Exam_12 {
	public static void main(String[] args) throws Exception {
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		DatagramSocket ds = new DatagramSocket(12345);
		
		ds.receive(dp);
		ds.close();
		
		ByteArrayInputStream baos = new ByteArrayInputStream(dp.getData());
		ObjectInputStream ois = new ObjectInputStream(baos);
		A11 ap = (A11)ois.readObject();
		System.out.println("ap.a = " + ap.a);
		System.out.println("ap.b = " + ap.b);
	}
}
