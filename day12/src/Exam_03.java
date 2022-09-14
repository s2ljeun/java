import java.util.*;
//2진수의 수를 입력받아 10진수로 표현하는 프로그램
public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("이진수를 입력 : ");
		String binary = in.next();
		int i = 0;			//binary의 위치
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
		System.out.printf("2진수 %s의 10진수 값 : %d\n", binary, res);
	}
}











