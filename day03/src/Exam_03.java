/*
 * 임의의 수 2개를 입력받아 큰 수를 출력시켜주는 프로그램
 */

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요: ");
		int a = in.nextInt();
		
		System.out.print("두번째 수를 입력하세요: ");
		int b = in.nextInt();
		
		if (a > b) {
			System.out.printf("더 큰 수는 %d입니다.", a);
		}else if (a < b) {
			System.out.printf("더 큰 수는 %d입니다.", b);
		}else {
			System.out.print("두 수가 같습니다.");
		}
	}

}
