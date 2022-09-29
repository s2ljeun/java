import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try { // �������� ����
			System.out.print("���������� �Է� : ");
			int kor = in.nextInt();
			System.out.println("�������� : " + kor);
		}catch(InputMismatchException e) { // �� ���ܰ� �߻��� �� try�� ���� ���߰� e(���� ������ ��ü��!!!)�� �޾Ƽ� ó���ϰڴ�.
			System.err.println("���������� ���ڸ� �Է��� �ּ���");
		}catch(ArithmeticException e) { // catch ������ - ���� �� �ִ� ���ܴ� �� �����൵ �ȴ�.
			System.out.print("0���� ���� �� �����ϴ�.");
		}finally { //try���� ������ ������ �ҷ����� ��Ƽ������� ���� - ���� ���α׷��� ������ �ְ� ���� ������ ���� �����ؾ��� �� > db�ݴ� ��� ���� ���
			// try���� ������ ����: 1. try���� ��� ����Ǿ� ��������, 2. ���ܰ� �߻����� ��
			System.out.println("finally���� ����ǰ� �ֽ��ϴ�.");
		}
	}
}
