import java.util.Scanner;

/*
 * ������ ���� �ϳ� �Է¹޾� �� ���� 3�� �������, 5�� �������, 3�� 5�� �������, 3�� 5�� ����� �ƴ����� �˷��ִ� ���α׷�
*/
public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		
		int num = in.nextInt();
		
		if (num%3 == 0) { // ���ǹ��� ���������� �ɷ����� �������ٰ� �����ؾ� �ϹǷ� ����� ������ ��ܿ� ����Ѵ�.
			if (num%5 == 0) {
				System.out.print("�Է��Ͻ� ���ڴ� 3�� 5�� ������Դϴ�");
			} else {
				System.out.print("�Է��Ͻ� ���ڴ� 3�� ����Դϴ�");
			}			
		} else if (num%5 == 0) {
			System.out.print("�Է��Ͻ� ���ڴ� 5�� ����Դϴ�.");
		} else {
			System.out.print("�Է��Ͻ� ���ڴ� 3�� 5�� ����� �ƴմϴ�.");
		}
	}
}