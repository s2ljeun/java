import java.io.*;

public class Exam_06 {
	public static void main(String[] args) throws IOException {
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data2.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		String name = "홍길동";
		int kor = 100;
		double avg = 90.23;
		
		dos.writeUTF(name); // 문자열 을 (버퍼메로리에) 저장하고자 할때
		dos.writeInt(kor); // int형 값을  (버퍼메로리에) 저장하고자 할때
		dos.writeDouble(avg); // double형 값을  (버퍼메로리에) 저장하고자 할때
		
//		dos.flush(); // buffer메모리에 있는 값을 file에 넣어줘라
		dos.close(); // buffer메모리를 비우고 닫아라.
	}

}
