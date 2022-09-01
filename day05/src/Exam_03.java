/*
 * 10개의 수를 입력받아 그 합과 평균을 알려주는 프로그램
 * 단, 10개의 수를 모두 나열하고 합과 평균(소수점 2자리까지)을 출력시킨다.
 */
import java.util.*;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num[] = new int[10]; // a배열의 값은 10개
		int sum = 0;

		for(int i=0; i<num.length; ++i) {
			System.out.print(i+1 + "번째 수를 입력하세요: ");
			num[i] = in.nextInt();
			sum+= num[i]; // sum에 배열 num의 값을 배열길이만큼 더하기
		}
		
		
		for(int i=0; i<num.length; ++i) {
			System.out.print(num[i] + "\t"); // 모든 수 나열
		}
		System.out.println();
		System.out.printf("합: %d 평균: %.2f", sum, (float)sum/num.length); // sum/10.0
	}

}
