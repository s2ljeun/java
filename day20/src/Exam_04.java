import java.io.*;

public class Exam_04 {
	public static void main(String[] args) throws IOException{
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data1.txt");
		
		//byte ��� - 1����Ʈ �����ϰڴ� / �ѱ��� ������ �� �ȴ�
		FileOutputStream fos = new FileOutputStream(file, true);
		//��ü������ 2��° �Ű������� false�� rewrite, true�� append / default�� rewrite
//		fos.write('A');
//		fos.write(66);
		String msg = "Hello, Java!!";
//		System.out.println(msg.substring(7,11)); // ���ϴ� �κи� �ڸ���
		byte[] by = msg.getBytes(); // �迭�� �ְ������ �ȵǹǷ� byte�迭�� ����
		fos.write(by, 7, 4); // substring�� ���� �ٸ���
	}

}
