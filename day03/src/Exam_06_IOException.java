import java.util.Scanner;
import java.io.*; // throws IOEcxeption�� ���� import

/*
 * ������ �� 2���� ��������ڸ� �Է¹޾� �� ������ ��� �����ϴ� ���α׷�
 */

public class Exam_06_IOException {
	public static void main(String[] args) throws IOException { // System.in.read()�� ���ؼ�
		Scanner in = new Scanner(System.in);

		System.out.print("ù��° ���� �Է��ϼ���: ");
		int a = in.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���: ");
		int b = in.nextInt();

		System.out.print("��������ڸ� �Է��ϼ���: "); // String���� ������ ���� �Ұ�
		char op = (char)System.in.read(); // Ű����(System.in)�� ������ �� �߿� �� ���� �аڴ�(read()), �Է°��� �ڵ�����ȯ - int�� �ǹǷ� ��������ȯ
		
		if (op=='+') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a+b);
		} else if (op=='-') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a-b);
		}else if (op=='*') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a*b);
		}else if (op=='/') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a/b);
		}else if (op=='%') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a%b);
		}else {
			System.out.print("�Է��Ͻ� �����ڴ� ��� �����ڰ� �ƴմϴ�.");
		}
	}
}