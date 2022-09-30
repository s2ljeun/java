import java.net.*;
import java.io.*;
import java.util.*;

public class Exam_09 {
	private ServerSocket ss;	//���� ��Ʈ��ȣ ����
	private Socket soc;			//���
	
	private PrintWriter pw;		//Ŭ���Թ��� ���� �ٸ� Ŭ���� ����
	private BufferedReader br;	//Ŭ���� �� ���� �ޱ� ����

	private Hashtable<String, Socket> ht;	//Ŭ���̾�Ʈ ����
	
	public Exam_09() throws IOException {
		ss = new ServerSocket(12345);
		ht = new Hashtable<>();
		while(true) {
			soc = ss.accept();
			ChatClient cc = new ChatClient(soc);
			cc.start();
		}
	}
	public void sendMessage(String msg) throws IOException { // �޼ҵ� ���� ������ �����ε�
		String[] data = msg.split(":");//data[0]-�̸�, data[1]-�޼���
		Enumeration<String> enu = ht.keys();
		while(enu.hasMoreElements()) {
			String n = enu.nextElement();
			//if (n.equals(data[0])) continue; //�� �޼����� ������ �������� �ʴ´�.
			Socket s = ht.get(n);
			pw = new PrintWriter(s.getOutputStream(), true);
			pw.println(msg);
			pw.flush();
		}
	}
	public void sendMessage(Socket soc, String name) throws IOException {
		if (ht.size() != 0) {
			Enumeration<String> enu = ht.keys();
			while(enu.hasMoreElements()) {
				String n = enu.nextElement();
				Socket s = ht.get(n);
				pw = new PrintWriter(s.getOutputStream(), true); // true -> autoflush
				pw.println(name+"�� ����");
				pw.flush();
			}
		}
		ht.put(name, soc);
	}
		
	class ChatClient extends Thread{ //�Ϲ���øŬ���� (Ŭ���� ���� Ŭ����) // ���� �ٸ� ������� ���ư����ϱ� ������
		Socket soc;
		ChatClient(Socket soc){
			this.soc = soc;
		}
		public void run() {
			while(true) { // �о���� ���� ��� �ؾ� �ϱ� ������ while �ȿ�
				try {
					br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
					String str = br.readLine();
					if (str == null) break;
					if (str.charAt(0) == '@') {
						sendMessage(soc, str.substring(1));
					}else {
						sendMessage(str);
					}
				}catch(IOException e) {
					
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Exam_09();
	}
}







