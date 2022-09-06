class A05{
	private int a;
	private static int b;
	static {
		System.out.println("static 구문이 실행");
	}
	{
		System.out.println("{} 구문이 실행");
	}
	A05(){		System.out.println("A05() 생성자가 실행");	}
	A05(int a){		System.out.println("A05(int a) 생성자가 실행");	}
}
public class Exam_05 {
	public static void main(String[] args) {
		A05 ap = new A05();
		A05 bp = new A05(10);
	}
}
