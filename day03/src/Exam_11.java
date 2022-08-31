import java.util.*;
/*
 * 10개의 수를 입력받아 그 합과 평균을 구하는 프로그램
 * 단, 평균은 소수점 2자리까지 나타나게 해주세요
*/
public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i=1; i<=10; ++i) {
			System.out.printf("%d 번째 수를 입력해주세요: ", i);
			int num = in.nextInt();
			sum += num;
		}
		
		System.out.printf("총합은 %d 평균은 %.2f 입니다.", sum, sum/10.0); //double값으로 나누어줘야 답이 double로 나온다.
	}

}
