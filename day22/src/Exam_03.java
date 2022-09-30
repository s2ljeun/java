//����: �������ϰ� ���� ����
import java.net.*;
import java.io.*;

public class Exam_03 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket soc = null;
		InputStreamReader isr;
		BufferedReader  br;
		
		PrintWriter pw; // ���� ����
		
		
		try{
			ss = new ServerSocket(12345);
			System.out.println("���� ����� ......");
			soc = ss.accept(); // 12345�� ��Ʈ�� ���� ���� ����� �Ѵ�
			System.out.println("������ ����: " + soc.toString());
			isr = new InputStreamReader(soc.getInputStream());
			br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println("���۵� ����: " + msg);

			// ���� ����
			// pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			pw = new PrintWriter(soc.getOutputStream()); // �����ڿ� ���� �˾Ƽ� ���ۿ� �ְ� �˾Ƽ� �ƿ�ǲ��Ʈ�������� ���ش�
			pw.println(msg);
			pw.close();

		}catch(IOException e) {
			
		}
	}

}

/*
���� ����� ......
������ ����: Socket[addr=/127.0.0.1,port=55223,localport=12345]
// (����)<ip�ּ�, ����� �� ����� ��Ʈ>, (����Ϸ��� �غ���)�� ��Ʈ
// ������ ����� �� ����� ��Ʈ�� ���� �޾ƾ� ���� �� ������ �� �ִ�.
 */
