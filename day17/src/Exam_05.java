class MyThread05 extends Thread{
	public void run() {
		System.out.println("스레드 정보 : " + Thread.currentThread());
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		System.out.println("main 메소드 실행 중!!");
		MyThread05 mt = new MyThread05();
		mt.setName("스레드");
		mt.setPriority(10);//priority값은 1이 최저, 10이 최고, 5는 default
		mt.start();
		try {
			Thread.sleep(3000);		//현재 스레드 재우기
			mt.join(3000);			//mt객체에 3초간 연결하기
		}catch(InterruptedException e) {}
		System.out.println("main 스레드 정보 : " + Thread.currentThread());
		System.out.println("main 메소드 실행 끝!!");
	}
}








