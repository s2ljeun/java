import java.util.Scanner;

/*
 * ������ �� 3���� �Է¹޾� ū ����� �����ϱ� a >= b >= c ����
*/

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ���.");
		int a = in.nextInt();

		System.out.print("�ι�° ���� �Է��ϼ���.");
		int b = in.nextInt();

		System.out.print("����° ���� �Է��ϼ���.");
		int c = in.nextInt();
		
		// ���� ū ���� a�� �ֱ�

		if (b>a && b>=c) {
			int imsi = a;
			a = b;
			b = imsi;
			
		}else if (c>a && c>b) { // �̹� ���� if���� b>=c�� ������ ��ȣ ���� �ʿ� ����.
			int imsi = a;
			a = c;
			c = imsi;
		}
		
		// �ι�° ū ���� b�� �ֱ�
		
		if (c>b) {
			int imsi = b;
			b = c;
			c = imsi;
		}
		
		System.out.printf("%d >= %d >= %d", a, b, c);
	}
}