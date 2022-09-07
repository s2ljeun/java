class A02{
	int a = 10;
}
class B02 extends A02{ //확장. 상속관계
	int b = 20;
	//A02 ap = new A02();
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
class C02{
	int c = 30;
	B02 bp = new B02(); // 포함관계
	public void disp2() {
		System.out.println("a = " + bp.a);
		System.out.println("b = " + bp.b);
		System.out.println("c = " + c);
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		
	}
}
