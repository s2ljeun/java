import java.io.*;

public class Exam_04 {
	public static void main(String[] args) throws IOException{
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data1.txt");
		
		//byte 통신 - 1바이트 전송하겠다 / 한글은 전송이 안 된다
		FileOutputStream fos = new FileOutputStream(file, true);
		//객체생성시 2번째 매개변수가 false면 rewrite, true면 append / default는 rewrite
//		fos.write('A');
//		fos.write(66);
		String msg = "Hello, Java!!";
//		System.out.println(msg.substring(7,11)); // 원하는 부분만 자르기
		byte[] by = msg.getBytes(); // 배열을 넣고싶은데 안되므로 byte배열로 변경
		fos.write(by, 7, 4); // substring과 조금 다르다
	}

}
