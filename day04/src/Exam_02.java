import java.util.Scanner;

/*
 * ������� ���� �����
 * 30�б����� 2000���̰�, ���� 10�д� 500���� �������� �ִ�
 * ���� �Է¹޾� ��������� ������ �˷��ִ� ���α׷��� �ۼ��ϼ���.
 */

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�����ð��� �Է��ϼ���: ");
		int minute = in.nextInt();
		int fee = 0;
		
		if(minute <= 30) {
			fee = 2000;
		} else { // minute > 30
			int add = 0;
			add = (minute - 30)/10; // �ʰ��ð�
			fee = 2000 + (500 * add);
		}
		
/*
 * int fee = 2000;
 * if(min>30){
 * min -= 30; // 1~10 => 10, 11~20 => 20
 * fee += ((min/10) + (min%10==0? 0 : 1)) * 500; //�������� �ֳ� ���� ���η� ..?
 * }
 */
		
		
		System.out.printf("��������� %d���Դϴ�.", fee);
	}

}
