import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		intro();
		int su1 = input(); //�޼ҵ� ȣ��
		int su2 = input();
		int hap = sum(su1, su2);
		output(su1, su2, hap);
	}
	
	// ��ȯ���� ����, �Ű������� ���� �޼ҵ�
	public static void intro() {
		System.out.println("�ΰ��� ���� �Է��ϸ� �� ���� �˷��ִ� ���α׷�");
	}
	
	// ��ȯ���� ����, �Ű������� �ִ� �޼ҵ�
	public static void output(int a, int b, int c) {
		System.out.printf("%d + %d = %d\n", a, b, c);
	}
	
	// ��ȯ���� �ְ�, �Ű������� �ִ� �޼ҵ�
	public static int sum(int a, int b) { // int a, int b�� �Ű�����
		return a + b;
		
	}
	
	// ��ȯ���� �ְ�, �Ű������� ���� �޼ҵ�
	public static int input() { // �޼ҵ�, ��ȯ���� int / main���� ȣ���ϴ� �޼ҵ���� public static ���δ�
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int su = in.nextInt();
		return su;
	}
}
