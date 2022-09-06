// 메소드 오버로딩 , 매개변수가 다른 메소드는 서로 다른 것.

public class Exam_02 {
	public static void main(String[] args) {
		star();
		System.out.println("aaaaa");
		star(5);star(10);
		System.out.println("bbbbb");
		//star(2.2);
		System.out.println("ccccc");
		star(); star(); star(); star(); star();
	}
	public static void star() {
		System.out.println("******");
	}
	public static void star(float b) {
		System.out.println("******");
	}
	public static void star(int a) {
		for(int i=0; i<a; ++i) {
			System.out.print("*");
		}
		System.out.println();
	}
}








