//Ŭ���̾�Ʈ: ������ ����ϰڽ��ϴ�(��ü �����)
import java.io.*;
import java.net.*;

public class Exam_04 {
	public static void main(String[] args) throws IOException {
		InetAddress ia = InetAddress.getByName("localhost");
		//getByName("localhost"); getByName("192.168.0.39");
		
		Socket soc = new Socket(ia, 12345); // ���� ����
		//��ü�� ������� ���� ip�ּҿ� ��Ʈ��ȣ�� ������ ������ ���� ��û > ���� > ������ > ��ü �ϼ�
		//Ŭ(���̾�Ʈ)���� ������ ������ ��û�� �� ���� ���� ��ü�� �����Ѵ�.
		//��ü ������ ������ ����� �ְ� �޴´�.
		String msg = "�ǽ���!!!";
		OutputStreamWriter osw = new OutputStreamWriter(soc.getOutputStream()); // ������ �����ִ� ��ü ���� ������
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println(msg);
		
		pw.flush(); // ���۸޸��̹Ƿ� close> close�ϸ� ��Ʈ?�����ϱ� flush�� �ٲٱ�
		
		// ���� ����
		InputStreamReader isr = new InputStreamReader(soc.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		br.close();
		
		soc.close(); // ���� ����
		
		
		
	}
}
// file����: FileWriter, ��Ʈ��ũ�� �ܼ� ����: OutputStreamWriter