import java.util.Scanner;
import java.io.*;

/*
 * �������� �ܼ��� �Է¹޾� �� ���� ��½����ִ� ���α׷�
*/

public class Exam_14 {
	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(System.in);
		
//		System.out.print("�������� �� ���� �Է��ϼ���.");
//		int num = System.in.read() - 48; // �ѱ��� �Է¹޾����Ƿ� �ƽ�Ű�ڵ� ���� ���´�. 0 -> 48
		

		 // 2�ܺ��� 9�ܱ��� ����ϱ�
				for(int i=2; i<=9; ++i) {
			for(int j=1; j<=9 ;++j) {
				System.out.printf("%d * %d = %d\n", i, j, j * i);
			}
		}

	}

}