import java.io.*;

public class Exam_02 {
	public static void main(String[] args) throws IOException {
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data1.txt");
		
		File imsi = File.createTempFile("temp", ".txt", dir); // ���۰�, ����, ���
		imsi.deleteOnExit(); // ���α׷��� ���ᰡ �Ǹ� �ӽ÷� ���� ������ �����ض�
		//file.delete(); //������ ��� �����ض�
		try {
			Thread.sleep(3000); //deleteOnExit�� thread sleep�� ���� �ڿ� ������ ����
		}catch(InterruptedException e) {}
		
		/*
		if(file.createNewFile()) {
			System.out.println(file.getName() + "�� ��������ϴ�.");
		}else {
			System.out.println(file.getName() + "�� �̹� �����ϴ� �����Դϴ�.");
		}

		file.createNewFile(); // ������ �������� ������ ����� true ��ȯ, �ƴϸ� false�� ��ȯ
		*/
	}
}
