import test.*;
class A01{
	int a;
	int b;
}
class B01 extends Test1{
	public void disp() {
		a = 100;
		System.out.println("a = "  + a);
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		//t1.a = 100;
		//System.out.println("t1.a = " + t1.a);
		A01 ap = new A01();
		ap.a = 100;
		//ap.b = 200;
		System.out.println("ap.a = " + ap.a);
	}
}
