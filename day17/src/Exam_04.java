//���2\

class MyThread04 implements Runnable{
	@Override
	public void run() {
		System.out.println("��Ƽ������ �� Runnable��ӽ� ó�����");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ� ���� ��!!");
		MyThread04 mt = new MyThread04();
		Thread th = new Thread(mt);
		th.start();
		System.out.println("main �޼ҵ� ���� ��!!");
	}
}
