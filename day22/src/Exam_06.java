//Ŭ���̾�Ʈ
import java.net.*;
import java.io.*;
import java.util.*;

public class Exam_06 extends Thread {
	InetAddress ia; //Ŭ�̴ϱ� �������� ��� ���̳ݾ�巹�� �ʿ�
	Socket soc;
	PrintWriter pw; // �޼��� ����
	Scanner in;
	BufferedReader br; //�޼��� �ޱ�
	
	public Exam_06() {
		in = new Scanner(System.in);
		
		try {
			ia = InetAddress.getByName("localhost");
			soc = new Socket(ia, 12345);
			
			this.start(); // ��Ƽ������� �޴� �� ���� (soc�� ������ ����)

			pw = new PrintWriter(soc.getOutputStream()); // soc�� ������ ����
			
			while(true) {
				System.out.print("������ ������ �޼���: ");
				String msg = in.next();
				pw.println(msg);
				pw.flush();
				
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			while(true) {
				String msg = br.readLine();
				if(msg == null) break;
				System.out.println("�������� �� �޼���: " + msg);
			}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Exam_06();
	}
	
}
