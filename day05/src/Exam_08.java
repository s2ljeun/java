import java.util.Scanner;

/*
 * select sort :: ���� ������ ���������� ���ؼ� ��ġ�� �ٲ� ����
 */

public class Exam_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num[] = new int[6];
		
		for(int i=0; i<num.length; ++i) {
			System.out.print(i+1 +"��° ���� �Է����ּ���.");
			num[i] = in.nextInt();
		}
		
		for(int i=0; i<num.length; ++i) {
			for(int j=i+1; j<num.length; ++j) {
				if(num[i]>num[j]) {
					int imsi;
					imsi = num[i];
					num[i] = num[j];
					num[j] = imsi;
				}
			}
		}
		
		for(int i=0; i<num.length; ++i) {
			System.out.print(num[i]);
		}
	}
}
