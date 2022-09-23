//방법2\

class MyThread04 implements Runnable{
	@Override
	public void run() {
		System.out.println("멀티스레드 중 Runnable상속시 처리방법");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		System.out.println("main 메소드 실행 중!!");
		MyThread04 mt = new MyThread04();
		Thread th = new Thread(mt);
		th.start();
		System.out.println("main 메소드 실행 끝!!");
	}
}
