import java.util.*;
//2������ ���� �Է¹޾� 10������ ǥ���ϴ� ���α׷�
public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�������� �Է� : ");
		String binary = in.next();
		int i = 0;			//binary�� ��ġ
		int res = 0;
		while(true) {
			if (i==binary.length()) break;
			char ch = binary.charAt(i);
			if (ch == '1') {
				int res1 = 0;
				for(int k=0; k<binary.length()-i; ++k) {
					if (k==0) res1 = 1;
					else res1 *= 2;
				}
				res += res1;
			}
			i++;
		}
		System.out.printf("2���� %s�� 10���� �� : %d\n", binary, res);
	}
}











