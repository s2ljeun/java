import java.io.*;

public class Exam_01 {
	public static void main(String[] args) {
		File f1 = new File("G:\\jieun\\study\\day20\\src\\data1.txt");
		File f2 = new File("G:\\jieun\\study\\day20\\src", "data1.txt");
		File dir = new File("G:" + File.separator + "jieun" + File.separator + "study"
							+ File.separator + "day20" + File.separator + "src");
		File f3 = new File(dir, "data1.txt");

		//f1, f2, f3�� ��� �ϳ��� ������ ����Ű�� ��ü�Դϴ�.
		// File��ü�� ����Ű�� ���� �߻��θ��̴�. - ������ ������ �ʿ䰡 ����.
		
		System.out.println("File.separator = " + File.separator);
		// ����������, window : \\, linux: /
		// os���� �ٸ��Ƿ� java������ File.separator�� ���
		System.out.println("File.separatorChar = " + File.separatorChar);
		// char������ �ް������ char ���̸� �ȴ�
		System.out.println("File.pathSeparator = " + File.pathSeparator);
		// �н�������, window: ;, linux: :
		// ���������� os���� �ٸ��Ƿ�...
		System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
	}
}
