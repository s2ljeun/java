/*
 * 1~100 ������ ���� ��ǻ�Ͱ� ������ �Ѵ�
 * ����ڴ� �� ���� ���ߴ� ����
 * ���� ��� ��ǻ�Ͱ� 75�� �����ߴٰ� ������ ����
 * ���� �Է�: 50
 * up
 * ���� �Է�: 80
 * down
 * ���� �Է�: 75
 * 4������ ���߼̽��ϴ�
 */
import java.util.*;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int correct = (int)(Math.random()*100)+1; // 1~100
		System.out.print(correct);
		int num;
		int i = 0;

		do {
			System.out.print("���� �Է�: ");
			num = in.nextInt();
			++i;
			if (num>correct) {
				System.out.println("down");
			} else System.out.println("up");

		}while(num!=correct); {
			System.out.printf("%d�� ���� ���߼̽��ϴ�.",i);
		}
		
//		//����� Ǯ��
//		int comsu = (int)(Math.random()*100)+1; // 1~100
//		int co = 0;
//
//		while(true) {
//			System.out.print("���� �Է�: ");
//			int su = in.nextInt();
//			co++;
//			if (su == comsu) break;
//			else if (su < comsu) System.out.print("up");
//			else System.out.print("down");
//		}
//		System.out.println(co + "�� ���� ���߼̽��ϴ�.");
		
		
	}
}
