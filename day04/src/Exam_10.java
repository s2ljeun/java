/*☆
 * 분을 입력받아 시간과 분으로 알려주는 프로그램
 * 분을 입력: 100
 * 1시간 40분입니다.
 * 분을 입력: 40
 * 0시간 40분입니다.
 * 분을 입력: -10
 * 음수는 넣을 수 없습니다.
 * 분을 입력: 0
 * 프로그램을 종료합니다.
 */
import java.util.*;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("분을 입력: ");
			int minute = in.nextInt();

			if(minute == 0) break;
			else if(minute < 0) System.out.println("음수는 넣을 수 없습니다.");
			else System.out.printf("%d시간 %d분입니다.\n", minute/60, minute%60);
		}

		System.out.print("프로그램을 종료합니다."); // break로 빠져나오게 되면 실행
	}
}