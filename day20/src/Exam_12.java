import java.io.*;

public class Exam_12 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data4.txt");
		
		// 3. 객체 읽어올 때 이렇게!
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Object obj = ois.readObject(); // 읽어오는 클래스가 없는 경우 ClassNotFoundException이 발생!! -> throws로 예방(처리)해주어야 함.
		A11 ap = (A11)obj; // ★A11로 형변환 (?)
		ap.disp();
	}
}
