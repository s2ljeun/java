import java.net.*;
import java.io.*;
import javax.swing.*;
public class Exam_09 {	//������ �����ؼ� ������
	public static void main(String[] args) throws Exception {
		JFileChooser jfc = new JFileChooser(".");
		int res = jfc.showOpenDialog(null);
		if (res != 0) {
			JOptionPane.showMessageDialog(null, "���ϼ����� ���ؼ� �����մϴ�.", "�˸�", 
					JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		File file = jfc.getSelectedFile();
		DataInputStream dis = new DataInputStream
				(new BufferedInputStream(new FileInputStream(file)));
		byte[] by = new byte[65508];
		InetAddress ia = InetAddress.getByName("localhost");
		DatagramSocket ds = new DatagramSocket();
		while(true) {
			int x = dis.read(by, 0, by.length);
			if (x == -1) break;
			DatagramPacket dp = new DatagramPacket(by, x, ia, 12345);
			ds.send(dp);
		}
		String end = "end";
		DatagramPacket dp2 = new DatagramPacket(end.getBytes(), end.getBytes().length, ia, 12345);
		ds.send(dp2);
		ds.close();
		System.out.println("�������� �Ϸ�!!");
	}
}










