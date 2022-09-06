package inner;

import inner.Outer01.Inner01;

class Outer02{
	private int a;
	private static int b;
	static {
		b = 20;
	}
	public Outer02() {
		a = 10;
	}
	public void disp() { //����޼ҵ�
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	// ����μ� Ŭ������ ����� �� �ִ� - ��øŬ����
	static class Inner02{ // �� �ٱ� Ŭ�����ʹ� ���� ���������� ����� ����
		private int c; //�� ����� Outer01 Ŭ�������� ����� �� ����.
		public Inner02() {
			c = 30;
		}
		public void disp_in() {
			//�ٱ��� Ŭ���� ��� �� static ����� ����� �� �ִ�
//			System.out.println("a = " + a);
			System.out.println("b = " + b); // �ٱ�Ŭ������ �����̺� ���
			System.out.println("c = " + c);
		}
		
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		Outer02 ot = new Outer02();
		Outer02.Inner02 oi = new Outer02.Inner02(); //static Ŭ�����̱� ������ �Ϲ���øŬ������ �޸� �ٷ� new�� ��ü���� ����
	}

}
