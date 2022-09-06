package inner;

class Outer03{
	private int a;
	private static int b;
	static {
		b = 20;
	}
	public Outer03() {
		a = 10;
	}
	public void disp() { //Outer03의 멤버메소드
		class Inner03{ //메소드 안의 클래스 : 지역중첩클래스 -> disp() 메소드 안에서만 사용 가능.
			private int c; //멤버필드
			public Inner03() { //생성자
				c = 30;
			}
			public void disp_in() { //메소드
				System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("c = " + c);
			}
		}
		Inner03 in = new Inner03();
		in.disp_in();
	}
}

public class Exam_03 {
	
}
