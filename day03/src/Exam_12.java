import java.util.Scanner;

/*
 *10���� ���� �Է¹޾� Ȧ���� �հ� ¦���� ���� ���� ��½��� �ּ���
*/
public class Exam_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 1; i <= 10; ++i) {
			System.out.printf("%d��° ���� �Է����ּ���.", i);
			int num = in.nextInt();
			if (num%2!=0) { // Ȧ����
				oddSum += num; // sum_h�� ���ϱ�
			} else { // ¦����
				evenSum += num; // sum_j�� ���ϱ�
			}	
		}
		
		System.out.printf("Ȧ���� ������ %d, ¦���� ������ %d�Դϴ�.", oddSum, evenSum);
	}

}
