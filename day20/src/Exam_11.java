import java.io.*;

// 1. 원본데이터 - 저장해야하는 데이터는 반드시 serializable 하자
class A11 implements Serializable{ // 직렬화, 역직렬화를 알아서 해주는 인터페이스 -> 하드디스크에 직렬로 넣기 / 메모리에 병렬상태로 올리기
	int a;
	int b;
	transient int c; // 파일I/O나 네트워크에서 객체 전송시 이 멤버필드는 전송하지 말아라
	
	public A11() {
		a = 10;
		b = 20;
		c = 30;
	}
	
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}

public class Exam_11 {
	public static void main(String[] args) throws IOException {
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data4.txt");
		
		// 2. 객체 작성할 때 이렇게~
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		A11 ap = new A11(); // 객체 생성 !!
		oos.writeObject(ap);	//객체를 파일에 넣는다(멤버필드값만 저장이 된다)
		oos.close();
		
		
		
	}
}
