/*
 * ������ ���� �Է¹޾� �� ���� ¦������ Ȧ������ �˷��ִ� ���α׷�
 */

import java.util.Scanner; // Scanner import �ʿ�

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���: ");
		int num = in.nextInt();
		
		if (num%2 == 0) {
			System.out.print("�Է��Ͻ� ���� ¦���Դϴ�.");
		} else {
			System.out.print("�Է��Ͻ� ���� Ȧ���Դϴ�.");
		}
	}

}
