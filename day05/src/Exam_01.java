/*
 * 5사람의 국어점수를 입력받아 5명 점수를 모두 나열하고 합을 알려주는 프로그램
 */

import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		int kor[] = new int[5];
		for(int i=0; i<5; ++i) {
			System.out.print(i+1+"번째 학생 국어점수:");
			kor[i] = in.nextInt();
			sum += kor[i];
		}
		for(int j=0; j<5; ++j) {
			System.out.print(kor[j] + "\t");
		}
		System.out.println("합: " + sum);
	}

}
