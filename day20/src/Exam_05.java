import java.io.*;

public class Exam_05 {
	public static void main(String[] args) throws IOException {
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data1.txt");
		
		FileInputStream fis = new FileInputStream(file);
		while(true) { // 1����Ʈ�� ������ ���� ���� ������ �𸣹Ƿ� while
			int res = fis.read();
			if (res < 0) break; // ������ ������ �� �̻� ����Ʈ�� ������ read()�� -1�� ��ȯ���ش�
			System.out.print((char)res); // char������ ����ȯ �� res
		}
	}
}
