import java.io.*;

// 1. ���������� - �����ؾ��ϴ� �����ʹ� �ݵ�� serializable ����
class A11 implements Serializable{ // ����ȭ, ������ȭ�� �˾Ƽ� ���ִ� �������̽� -> �ϵ��ũ�� ���ķ� �ֱ� / �޸𸮿� ���Ļ��·� �ø���
	int a;
	int b;
	transient int c; // ����I/O�� ��Ʈ��ũ���� ��ü ���۽� �� ����ʵ�� �������� ���ƶ�
	
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
		
		// 2. ��ü �ۼ��� �� �̷���~
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		A11 ap = new A11(); // ��ü ���� !!
		oos.writeObject(ap);	//��ü�� ���Ͽ� �ִ´�(����ʵ尪�� ������ �ȴ�)
		oos.close();
		
		
		
	}
}
