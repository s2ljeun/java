import java.io.*;

public class Exam_07 {
	public static void main(String[] args) throws IOException {
		File dir = new File("E:\\bigdata2\\study\\day20\\src");
		File file = new File(dir, "data2.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String name = dis.readUTF();
		int kor = dis.readInt();
		double avg = dis.readDouble();
		
		System.out.println(name+"´ÔÀÇ ±¹¾îÁ¡¼ö : " + kor + ", Æò±Õ : " + avg);
	}
}
