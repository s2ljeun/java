/*��
 * ���� �Է¹޾� �ð��� ������ �˷��ִ� ���α׷�
 * ���� �Է�: 100
 * 1�ð� 40���Դϴ�.
 * ���� �Է�: 40
 * 0�ð� 40���Դϴ�.
 * ���� �Է�: -10
 * ������ ���� �� �����ϴ�.
 * ���� �Է�: 0
 * ���α׷��� �����մϴ�.
 */
import java.util.*;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է�: ");
			int minute = in.nextInt();

			if(minute == 0) break;
			else if(minute < 0) System.out.println("������ ���� �� �����ϴ�.");
			else System.out.printf("%d�ð� %d���Դϴ�.\n", minute/60, minute%60);
		}

		System.out.print("���α׷��� �����մϴ�."); // break�� ���������� �Ǹ� ����
	}
}