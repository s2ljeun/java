import java.net.*;
import java.io.*;
import java.util.*;

public class Exam_09 {
	private ServerSocket ss;	//서버 포트번호 지정
	private Socket soc;			//통신
	
	private PrintWriter pw;		//클에게받은 글을 다른 클에게 전송
	private BufferedReader br;	//클에게 온 글을 받기 위해

	private Hashtable<String, Socket> ht;	//클라이언트 묶음
	
	public Exam_09() throws IOException {
		ss = new ServerSocket(12345);
		ht = new Hashtable<>();
		while(true) {
			soc = ss.accept();
			ChatClient cc = new ChatClient(soc);
			cc.start();
		}
	}
	public void sendMessage(String msg) throws IOException { // 메소드 명은 같지만 오버로딩
		String[] data = msg.split(":");//data[0]-이름, data[1]-메세지
		Enumeration<String> enu = ht.keys();
		while(enu.hasMoreElements()) {
			String n = enu.nextElement();
			//if (n.equals(data[0])) continue; //내 메세지는 나한테 전송하지 않는다.
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
				pw.println(name+"님 입장");
				pw.flush();
			}
		}
		ht.put(name, soc);
	}
		
	class ChatClient extends Thread{ //일반중첩클래스 (클래스 안의 클래스) // 각자 다른 스레드로 돌아가야하기 때문에
		Socket soc;
		ChatClient(Socket soc){
			this.soc = soc;
		}
		public void run() {
			while(true) { // 읽어오는 것을 계속 해야 하기 때문에 while 안에
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







