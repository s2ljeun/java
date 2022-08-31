import java.util.Scanner;

/*
 *10개의 수를 입력받아 홀수의 합과 짝수의 합을 각각 출력시켜 주세요
*/
public class Exam_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 1; i <= 10; ++i) {
			System.out.printf("%d번째 수를 입력해주세요.", i);
			int num = in.nextInt();
			if (num%2!=0) { // 홀수면
				oddSum += num; // sum_h에 더하기
			} else { // 짝수면
				evenSum += num; // sum_j에 더하기
			}	
		}
		
		System.out.printf("홀수의 총합은 %d, 짝수의 총합은 %d입니다.", oddSum, evenSum);
	}

}
