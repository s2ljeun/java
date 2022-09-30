//클라이언트: 서버랑 통신하겠습니다(객체 만들기)
import java.io.*;
import java.net.*;

public class Exam_04 {
	public static void main(String[] args) throws IOException {
		InetAddress ia = InetAddress.getByName("localhost");
		//getByName("localhost"); getByName("192.168.0.39");
		
		Socket soc = new Socket(ia, 12345); // 소켓 열기
		//객체를 만드려는 순간 ip주소와 포트번호를 가지고 서버로 가서 요청 > 응답 > 재응답 > 객체 완성
		//클(라이언트)에서 서버에 접속을 요청할 때 위와 같이 객체를 생성한다.
		//객체 생성시 서버와 통신을 주고 받는다.
		String msg = "실습중!!!";
		OutputStreamWriter osw = new OutputStreamWriter(soc.getOutputStream()); // 소켓이 갖고있는 객체 통해 보내기
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println(msg);
		
		pw.flush(); // 버퍼메모리이므로 close> close하면 포트?닫히니까 flush로 바꾸기
		
		// 에코 서버
		InputStreamReader isr = new InputStreamReader(soc.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		br.close();
		
		soc.close(); // 접속 종료
		
		
		
	}
}
// file전송: FileWriter, 네트워크나 콘솔 전송: OutputStreamWriter