package inner;
class Outer04{
	public void aaa() {
		System.out.println("aaa�޼ҵ��Դϴ�.");
	}
	public void bbb() {
		System.out.println("ddd�޼ҵ��Դϴ�.");
	}
	public void ccc() {
		System.out.println("ccc�޼ҵ��Դϴ�.");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		// ��ü ������ �޼ҵ带 �������̵��ؼ� ������ �� �ִµ�, �̶� �����Ǵ� ��ü��
		// Outer04Ŭ������ ��ü�� �ƴ϶� ���ο� Ŭ����(Outer04$1.class)�� ����
		// ���ο� Ŭ������ ��ü�� �Ǵ� ���̴�.
		Outer04 ot = new Outer04() { //��ü ���� �� ������ �����ϰ�
			public void bbb() { // �������̵� ����
				System.out.println("bbb�޼ҵ��Դϴ�.");
			} // ������ ���� �޼ҵ常 ���ļ� ���డ��. (���θ��� �޼ҵ带 ���Ǹ޼ҵ� �ȿ� ������ ������ ����)
		};
		ot.aaa();
		ot.bbb();
		ot.ccc();
	}

}
