/*
 * 10���� ���� �Է¹޾� �� �հ� ����� �˷��ִ� ���α׷�
 * ��, 10���� ���� ��� �����ϰ� �հ� ���(�Ҽ��� 2�ڸ�����)�� ��½�Ų��.
 */
import java.util.*;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num[] = new int[10]; // a�迭�� ���� 10��
		int sum = 0;

		for(int i=0; i<num.length; ++i) {
			System.out.print(i+1 + "��° ���� �Է��ϼ���: ");
			num[i] = in.nextInt();
			sum+= num[i]; // sum�� �迭 num�� ���� �迭���̸�ŭ ���ϱ�
		}
		
		
		for(int i=0; i<num.length; ++i) {
			System.out.print(num[i] + "\t"); // ��� �� ����
		}
		System.out.println();
		System.out.printf("��: %d ���: %.2f", sum, (float)sum/num.length); // sum/10.0
	}

}
