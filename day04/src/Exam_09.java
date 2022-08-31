import java.util.Scanner;

/*☆
 * 임의의 수를 입력받는다. 음수나 0이 들어올때 까지 값을 입력받고,
 * 음수나 0이 들어오면 음수나 0을 제외한 합과 평균값(소수점 2자리)을 알려주는 프로그램 * while
 */
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		
		while(true) {
			System.out.print("수를 입력해주세요: ");
			int num = in.nextInt();

			if (num <= 0) {
				System.out.printf("총합: %d 평균: %.2f", sum, (float)sum/i);
				break;
			}
			sum += num; // 입력 값 더하기
			++i;
		}
	}
	
}
