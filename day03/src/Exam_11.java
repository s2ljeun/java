import java.util.*;
/*
 * 10���� ���� �Է¹޾� �� �հ� ����� ���ϴ� ���α׷�
 * ��, ����� �Ҽ��� 2�ڸ����� ��Ÿ���� ���ּ���
*/
public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i=1; i<=10; ++i) {
			System.out.printf("%d ��° ���� �Է����ּ���: ", i);
			int num = in.nextInt();
			sum += num;
		}
		
		System.out.printf("������ %d ����� %.2f �Դϴ�.", sum, sum/10.0); //double������ ��������� ���� double�� ���´�.
	}

}