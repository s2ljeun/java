/*
 * ���丮�� �� ���ϱ�
 * ���� �Է¹����� �� ������ ������ �ؼ� ����� �˷��ִ� ���α׷�
 */
import java.util.*;
public class Exam_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է�: ");
	
		int su = in.nextInt();
		int facsu = fac(su);

		System.out.printf("%d�� ���丮�� ��: %d", su, facsu);
	}
	
	public static int fac(int su) {
		if(su==1) return 1;
		su = su * fac(su-1);
		return su;
	}
}
