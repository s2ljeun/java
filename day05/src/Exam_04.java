import java.util.Scanner;

/*��
 * �ο����� �Է¹ް� �� �ο������ �̸��� ����, ���������� �Է¹��� ��,
 * �̸��� ����, ������ �˷��ִ� ���α׷�
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("�ο����� �Է��ϼ���: ");
		int inwon = in.nextInt();

		String name[] = new String[inwon]; // �Է¹��� ���ڰ� �迭ũ��
		int kor[] = new int[inwon];
		int eng[] = new int[inwon];
		int sum[] = new int[inwon];
		int rank[] = new int[inwon];
		
		for(int i=0; i<inwon; i++) {
			System.out.print(i+1 + "��° �̸�: ");
			name[i] = in.next();

			System.out.print(i+1 + "��° ��������: ");
			kor[i] = in.nextInt();
			
			System.out.print(i+1 + "��° ��������: ");
			eng[i] = in.nextInt();
			
			sum[i] = kor[i] + eng[i]; // ����
			
			rank[i] = 1; // ������ ���ϱ� ���� �⺻�� 1��

		}
		
		//���� ���ϱ� �˰���
		for(int i=0; i<inwon; ++i) {		//i = ��
			for(int j=0; j<name.length; ++j) {	//j = �ٸ����
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int i=0; i<inwon; i++) {
			System.out.printf("%s���� ������ %d���̰�, ������ %d���Դϴ�. \n", name[i], sum[i], rank[i]);
		}
		
	}

}
