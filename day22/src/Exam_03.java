//서버: 서버소켓과 소켓 설정
import java.net.*;
import java.io.*;

public class Exam_03 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket soc = null;
		InputStreamReader isr;
		BufferedReader  br;
		
		PrintWriter pw; // 에코 서버
		
		
		try{
			ss = new ServerSocket(12345);
			System.out.println("서버 대기중 ......");
			soc = ss.accept(); // 12345번 포트로 들어온 곳과 통신을 한다
			System.out.println("접속자 정보: " + soc.toString());
			isr = new InputStreamReader(soc.getInputStream());
			br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println("전송된 내용: " + msg);

			// 에코 서버
			// pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			pw = new PrintWriter(soc.getOutputStream()); // 생성자에 따라 알아서 버퍼에 넣고 알아서 아웃풋스트림라이터 해준다
			pw.println(msg);
			pw.close();

		}catch(IOException e) {
			
		}
	}

}

/*
서버 대기중 ......
접속자 정보: Socket[addr=/127.0.0.1,port=55223,localport=12345]
// (상대방)<ip주소, 통신할 때 사용한 포트>, (통신하려고 준비한)내 포트
// 상대방이 통신할 때 사용한 포트도 같이 받아야 내가 또 보내줄 수 있다.
 */
