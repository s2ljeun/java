import java.util.Scanner;

/*��
 * ������ ���� �Է¹޴´�. ������ 0�� ���ö� ���� ���� �Է¹ް�,
 * ������ 0�� ������ ������ 0�� ������ �հ� ��հ�(�Ҽ��� 2�ڸ�)�� �˷��ִ� ���α׷� * while
 */
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int i = 0;
		int sum = 0;
		
		while(true) {
			System.out.print("���� �Է��ϼ���: ");
			int num = in.nextInt();
			if (num <= 0) break;
			sum += num;
			i++;
		}
		
		System.out.printf("��� ���� ���� %d, ��հ��� %.2f�Դϴ�.", sum, sum/(float)i); // float ����ȯ �ʼ�
	}
	
}