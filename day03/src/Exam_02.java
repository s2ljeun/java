/*
 * 임의의 수를 입력받아 그 수가 짝수인지 홀수인지 알려주는 프로그램
 */

import java.util.Scanner; // Scanner import 필요

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("수를 입력하세요: ");
		int num = in.nextInt();
		
		if (num%2 == 0) {
			System.out.print("입력하신 수는 짝수입니다.");
		} else {
			System.out.print("입력하신 수는 홀수입니다.");
		}
	}

}
