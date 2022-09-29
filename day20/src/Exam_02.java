import java.io.*;

public class Exam_02 {
	public static void main(String[] args) throws IOException {
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data1.txt");
		
		File imsi = File.createTempFile("temp", ".txt", dir); // 시작값, 끝값, 경로
		imsi.deleteOnExit(); // 프로그램이 종료가 되면 임시로 만든 파일을 삭제해라
		//file.delete(); //파일을 즉시 삭제해라
		try {
			Thread.sleep(3000); //deleteOnExit은 thread sleep이 끝난 뒤에 삭제를 수행
		}catch(InterruptedException e) {}
		
		/*
		if(file.createNewFile()) {
			System.out.println(file.getName() + "를 만들었습니다.");
		}else {
			System.out.println(file.getName() + "는 이미 존재하는 파일입니다.");
		}

		file.createNewFile(); // 파일이 존재하지 않으면 만들고 true 반환, 아니면 false를 반환
		*/
	}
}
