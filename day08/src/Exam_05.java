class A05{
	private int a;
	private static int b;
	static {
		System.out.println("static ������ ����");
	}
	{
		System.out.println("{} ������ ����");
	}
	A05(){		System.out.println("A05() �����ڰ� ����");	}
	A05(int a){		System.out.println("A05(int a) �����ڰ� ����");	}
}
public class Exam_05 {
	public static void main(String[] args) {
		A05 ap = new A05();
		A05 bp = new A05(10);
	}
}
