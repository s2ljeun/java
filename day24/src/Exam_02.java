//����
import java.net.*;

public class Exam_02 {
	public static void main(String[] args) throws Exception{
		DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
		
		MulticastSocket ms = new MulticastSocket(12345);
		InetAddress ia = InetAddress.getByName("226.50.50.50"); // ���� �ּ�
		ms.joinGroup(ia); // �ּҷ� ����
		ms.receive(dp); // ���� �� �� �ޱ�
		ms.leaveGroup(ia); // ������
		ms.close(); // �ݱ�
		
		System.out.println("������: " + dp.getAddress().getHostAddress());
		System.out.println("���빰: " + new String(dp.getData()).trim());
	}
}
