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
	public void disp() { //Outer03�� ����޼ҵ�
		class Inner03{ //�޼ҵ� ���� Ŭ���� : ������øŬ���� -> disp() �޼ҵ� �ȿ����� ��� ����.
			private int c; //����ʵ�
			public Inner03() { //������
				c = 30;
			}
			public void disp_in() { //�޼ҵ�
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
