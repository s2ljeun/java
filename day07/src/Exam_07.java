import java.util.Scanner;

/*
 * 2������ ���ϱ�
 * 2^3 = 8
 */
public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է�: ");

		int su = in.nextInt();
		int sq_su = squared(su);
		
		System.out.printf("2�� %d���� %d", su, sq_su);
	}
	
	public static int squared(int n) {
		if (n==0) return 1;
		return 2 * squared(n-1);
	}
}
