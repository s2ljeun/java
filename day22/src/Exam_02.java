// ip를 관리하기 위해
import java.net.*;
import java.net.UnknownHostException;

public class Exam_02 {
	public static void main(String[] args) throws UnknownHostException{
		//여러 개 구하기
		/*
		//DNS 서버를 통해(내 전용) 다른 곳의 서버주소를 얻어올 수 있다 - 네이버를 예로 들면 서버가 여러개지만 pc별로 오픈된 서버가 2개정도로 제한 (이 서버가 막히면 접속방법 X)
		InetAddress ia[] = InetAddress.getAllByName("www.naver.com");
		for(int i=0; i<ia.length; ++i) {
			System.out.println("주소: " + ia[i].getHostAddress());
			System.out.println("호스트이름: " + ia[i].getHostName());
		}
		*/
		
		// ip주소에 1)localhost 2)127.0.0.1 3)자신의 ip주소 - 모두 자신을 가르키는 주소이다 (192.168.0.220 등 ...)
		
		//한 개  구하기
		InetAddress ia = null;
		try {
			ia = InetAddress.getByName("localhost"); //www.naver.com //nw.ezenac.co.kr
			System.out.println("주소: " + ia.getHostAddress());
			System.out.println("호스트이름: " + ia.getHostName());
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
