import java.io.*;

public class Exam_12 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data4.txt");
		
		// 3. ��ü �о�� �� �̷���!
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Object obj = ois.readObject(); // �о���� Ŭ������ ���� ��� ClassNotFoundException�� �߻�!! -> throws�� ����(ó��)���־�� ��.
		A11 ap = (A11)obj; // ��A11�� ����ȯ (?)
		ap.disp();
	}
}
