package inner;
class Outer01{
	private int a;
	private static int b;
	Inner01 inner = new Inner01(); // ��ü �ϳ� �����ؼ� ����Ŭ������ �����ϱ� ����
	static {
		b = 20;
	}
	public Outer01() {
		a = 10;
	}
	public void disp() { //����޼ҵ�
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	// ����μ� Ŭ������ ����� �� �ִ� - ��øŬ����
	class Inner01{ // �ܺ�Ŭ�����̸�$����Ŭ�����̸�
		private int c; //�� ����� Outer01 Ŭ�������� ����� �� ����.
		public Inner01() {
			c = 30;
		}
		public void disp_in() {
			//�ٱ��� Ŭ���� ����� ����� �� �ִ�
			System.out.println("a = " + a); // �ٱ�Ŭ������ �����̺� ���
			System.out.println("b = " + b); // �ٱ�Ŭ������ �����̺� ���
			System.out.println("c = " + c);
		}
		
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		Outer01 ot = new Outer01(); //�ٱ� Ŭ���� ��ü ����
		Outer01.Inner01 oi = ot.new Inner01();  //Outer01$Inner01.class outerŬ������ ���� �����ؾ� new ���� ����.
		ot.inner.disp_in();
	}

}
