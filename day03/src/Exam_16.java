/*
12345
23456
34567
45678
56789
 */

public class Exam_16 {
	public static void main(String[] args) {
		for(int i=1;i<=5;++i) { // �� 5�� �ݺ�
			for(int j=i;j<=i+4;++j) { // 1,2,3,4,5�� �����ؼ�(j=i) ���� 4�� ���� ������ ���
				System.out.print(j);
			}
			System.out.println();
		}

	}

}