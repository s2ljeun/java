class MyThread05 extends Thread{
	public void run() {
		System.out.println("������ ���� : " + Thread.currentThread());
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ� ���� ��!!");
		MyThread05 mt = new MyThread05();
		mt.setName("������");
		mt.setPriority(10);//priority���� 1�� ����, 10�� �ְ�, 5�� default
		mt.start();
		try {
			Thread.sleep(3000);		//���� ������ ����
			mt.join(3000);			//mt��ü�� 3�ʰ� �����ϱ�
		}catch(InterruptedException e) {}
		System.out.println("main ������ ���� : " + Thread.currentThread());
		System.out.println("main �޼ҵ� ���� ��!!");
	}
}








