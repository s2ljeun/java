import java.io.*;

public class Exam_06 {
	public static void main(String[] args) throws IOException {
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data2.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		String name = "ȫ�浿";
		int kor = 100;
		double avg = 90.23;
		
		dos.writeUTF(name); // ���ڿ� �� (���۸޷θ���) �����ϰ��� �Ҷ�
		dos.writeInt(kor); // int�� ����  (���۸޷θ���) �����ϰ��� �Ҷ�
		dos.writeDouble(avg); // double�� ����  (���۸޷θ���) �����ϰ��� �Ҷ�
		
//		dos.flush(); // buffer�޸𸮿� �ִ� ���� file�� �־����
		dos.close(); // buffer�޸𸮸� ���� �ݾƶ�.
	}

}
