/*��
 * up-down���� �ݴ�
 * ����ڰ� 1~100������ ���� �����ϰ� ��ǻ�Ͱ� ���ߴ� ����
 * ���� ��� ����ڰ� 75�� ����
 * 1~100 ������ �� ����: 50 1.up 2.down 3.����: 1
 * 51~100 ������ �� ����: 80 1. up 2. down 3. ����: 2
 * 51~79 ������ �� ����:
 */
import java.util.*;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("1~100 ������ ���� �ϳ� �����ϰ� EnterŰ�� ��������!!");
		in.nextLine(); // ������ �����ڷ� ����ϴ� in.next()�� �޸� enterŰ�� ���� ������ ��ٸ���.
		int multi = 100, plus = 1;
		
		while(true) {
			int su = (int)(Math.random() * multi) + plus; // �ʱ� 1 ~ 100
			System.out.println("����� ������ ���� : " + su + "�Դϱ�?");
			System.out.println("1.up 2.down 3.����");
			int select = in.nextInt();
			
			/*
			 * ���� ������ �߿��ѵ�
			 * 1~100�� ��������		1)random*100�ϸ� 0~99 2) +1�ϸ� 1~100
			 * 51~100�� ��������	2)random*10*5�ϸ�0~45 2) +51�ϸ� 51~95 ???
			 * 56~100�� ��������	random*45 + 56
			 */
			
			if (select == 3) { 				// ������ 3�� �����ϸ�
				break;
			} else if (select == 1) { 		// ������ 1. up�� �����ϸ�
				multi = (multi+plus-1) - su; // ���� ������ �ø��� ����  multi���� su�� �Ǿ���ϴµ�? �׷��� ���� ���� �ö󰡴ϱ� -su��??
				plus = su + 1; // plus�� ���� su���� +1 ���ִ� �����̹Ƿ� su+1 ???����
			} else if (select == 2) { 		// ������ 2. down�� �����ϸ�
				multi = su - plus;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���!!");
			}
			
		}
		
		System.out.printf("������ ���߾ ���α׷��� �����մϴ�.");
	}

}