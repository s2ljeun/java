import java.io.*;

public class Exam_05 {
	public static void main(String[] args) throws IOException {
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data1.txt");
		
		FileInputStream fis = new FileInputStream(file);
		while(true) { // 1바이트씩 꺼내는 것이 언제 끝날지 모르므로 while
			int res = fis.read();
			if (res < 0) break; // 파일이 끝나고 더 이상 바이트가 없으면 read()가 -1을 반환해준다
			System.out.print((char)res); // char형으로 형변환 한 res
		}
	}
}
