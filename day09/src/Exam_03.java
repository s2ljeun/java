import java.io.*;

class A03{
	int a;
	int b;

	public A03() { a = 10; b = 20; } // 디폴트 생성자 - 매개변수가 없는 생성자
	
	public A03(int x) {
		a = 100;
		b = 200;
	}
	
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

class B03 extends A03{
	int c;
	//int b;
	public B03() {
		super();	//부모클래스의 생성자를 호출하는 메소드 -> 매개변수가 없으므로 default 생성자를 호출
		c = 30;
		//b = 1000;
	}
	
	public void disp() {
		/*
		 * System.out.println("a = " + this.a);//겹치지 않는 a는 super, this 다 사용 가능
		 * System.out.println("b = " + super.b);//겹치는 b는 부모일때 super, 자식일때 this
		 * System.out.println("c = " + c);
		 */
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		B03 ap = new B03();
		ap.disp();
		System.out.println("ap.b = " + ap.b);
	}
}





