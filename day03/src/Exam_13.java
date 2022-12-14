import java.util.Scanner;

/*
 * 2개의 수를 입력받아 최대공약수를 구하는 프로그램을 작성하세요
 */

public class Exam_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요: ");
		int num1 = in.nextInt();
		
		System.out.print("두번째 수를 입력하세요: ");
		int num2 = in.nextInt();
		
		if (num1 > num2) {
			int imsi = num1;
			num1 = num2;
			num2 = imsi;
		}
		int gcd = 1;
		if (num1 % num2==0) { // 만약 작은값으로 나누어 떨어진다면
			gcd = num1; // 최대공약수는 작은값
		}
		for(int i=2; i<=num2/2; ++i) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("%d와 %d의 최대공약수는 %d입니다.", num1, num2, gcd);
	}

}
