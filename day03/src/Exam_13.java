import java.util.Scanner;

/*
 * 2���� ���� �Է¹޾� �ִ������� ���ϴ� ���α׷��� �ۼ��ϼ���
 */

public class Exam_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ���: ");
		int num1 = in.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���: ");
		int num2 = in.nextInt();
		
		if (num1 > num2) {
			int imsi = num1;
			num1 = num2;
			num2 = imsi;
		}
		int gcd = 1;
		if (num1 % num2==0) { // ���� ���������� ������ �������ٸ�
			gcd = num1; // �ִ������� ������
		}
		for(int i=2; i<=num2/2; ++i) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("%d�� %d�� �ִ������� %d�Դϴ�.", num1, num2, gcd);
	}

}