//���1

class MyThread03 extends Thread{
	public void run() {
		System.out.println("������ �ǽ� ���� �Դϴ�.");
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ� ���� ��!!");
		MyThread03 mt = new MyThread03();
		mt.start();
		System.out.println("main �޼ҵ� ���� ��!!");
	}
}
