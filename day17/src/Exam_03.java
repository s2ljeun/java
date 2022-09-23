//방법1

class MyThread03 extends Thread{
	public void run() {
		System.out.println("스레드 실습 예제 입니다.");
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		System.out.println("main 메소드 실행 중!!");
		MyThread03 mt = new MyThread03();
		mt.start();
		System.out.println("main 메소드 실행 끝!!");
	}
}
