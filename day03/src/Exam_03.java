/*
 * ������ �� 2���� �Է¹޾� ū ���� ��½����ִ� ���α׷�
 */

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ���: ");
		int a = in.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���: ");
		int b = in.nextInt();
		
		if (a > b) {
			System.out.printf("�� ū ���� %d�Դϴ�.", a);
		}else if (a < b) {
			System.out.printf("�� ū ���� %d�Դϴ�.", b);
		}else {
			System.out.print("�� ���� �����ϴ�.");
		}
	}

}