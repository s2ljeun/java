import java.io.*;

class A03{
	int a;
	int b;

	public A03() { a = 10; b = 20; } // ����Ʈ ������ - �Ű������� ���� ������
	
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
		super();	//�θ�Ŭ������ �����ڸ� ȣ���ϴ� �޼ҵ� -> �Ű������� �����Ƿ� default �����ڸ� ȣ��
		c = 30;
		//b = 1000;
	}
	
	public void disp() {
		/*
		 * System.out.println("a = " + this.a);//��ġ�� �ʴ� a�� super, this �� ��� ����
		 * System.out.println("b = " + super.b);//��ġ�� b�� �θ��϶� super, �ڽ��϶� this
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





