//클라이언트
import java.net.*;
import java.io.*;
import java.util.*;

public class Exam_06 extends Thread {
	InetAddress ia; //클이니까 서버소켓 대신 아이넷어드레스 필요
	Socket soc;
	PrintWriter pw; // 메세지 쓰기
	Scanner in;
	BufferedReader br; //메세지 받기
	
	public Exam_06() {
		in = new Scanner(System.in);
		
		try {
			ia = InetAddress.getByName("localhost");
			soc = new Socket(ia, 12345);
			
			this.start(); // 멀티스레드로 받는 것 실행 (soc가 생성된 이후)

			pw = new PrintWriter(soc.getOutputStream()); // soc가 생성된 이후
			
			while(true) {
				System.out.print("서버에 전달할 메세지: ");
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
				System.out.println("서버에게 온 메세지: " + msg);
			}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Exam_06();
	}
	
}
