interface A01{ // ���߻���� ���� ó�� ����
	//����ʵ� - ����� ��� ���� + �ڵ����� public static final > ���� �ٲ� �� �����Ƿ� ���߻�ӿ� Ȱ��
	public static final int A = 1;
	public static int b = 2;
	public final int c = 3;
	int d = 4; // public static final ������
	
	//����޼ҵ� - �߻�޼ҵ常 ����
	public abstract void disp();
	void disp2(); // public abstract void ����
	
	//��øŬ���� (static�� �� �� �ִ�)
	static class Inner01{}
	class Inner02{} // static ����
	
	//�����ڴ� ����
}

public class Exam_01 {
	public static void main(String[] args) {
		System.out.println("a = " + A01.A); // static�̹Ƿ� ��ü ������ �ʰ� Ŭ���� �̸����� ���� ����
//		A01.A = 100; // final�̹Ƿ� ���� �Ұ�
		System.out.println("b = " + A01.b);
//		A01.b = 100; // interface �ȿ����� final�̶�� ���� �ʾƵ� final,
		System.out.println("c = " + A01.c); // interface �ȿ����� static ���� �ʾƵ� static
	}

}
