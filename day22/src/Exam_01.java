// TCP통신
// 서버의 포트번호를 구하기 위해 서버소켓 만들기
import java.io.*;
import java.net.*;

public class Exam_01 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		for(int i=0; i<65535; ++i) { // 포트번호는 0번에서 65535번을 사용할 수 있다
			// 포트번호의 0 ~ 1023번까지는 잘 알려진 포트번호라고 해서 사용하지 않는다
			// 49152 ~ 65535번까지는 동적포트번호라고 해서 (자주) 쓰이고 있다
			try {
				ss = new ServerSocket(i);
				ss.close();
			}catch(IOException e) {
				System.out.println(i+ "번 포트번호는 사용 중!!");
			}
		}
	}

}
