/*
 * 로또 프로그램을 만들어 보자
 * 컴퓨터가 1~45의 수 6개를 중복되지 않은 수를 선택
 * 사용자는 1~45의 수 6개를 직접 입력하도록 한다(중복되지 않게)
 * 컴퓨터가 선택학 수와 사용자가 선택한 수를 비교하여 맞춘개수를 알려준다.
 */
import java.util.*;
public class Exam_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] lottery = new int[6];
		int[] select = new int[6];

		for(int i=0; i<lottery.length; i++) { // 컴퓨터의 수 6개 뽑기
			lottery[i] = (int)(Math.random() * 45) +1; // 1~45의 수
			
			for(int j=0; j<i; ++j) { // 중복체크
				if (lottery[i] == lottery[j]) { // 중복된다면
					i-- ; // 이전 자리로 가고
					break; // 안쪽 for문 빠져나가지
				}
			}

		}
		
		for(int i=0; i<lottery.length; i++) {
			do {
				System.out.print(i+1 + "번째 수를 입력해주세요: ");
				select[i] = in.nextInt();
			}while(select[i] < 1 || select[i] > 45); //1보다 작거나 45보다 크면 다시 입력시킨다.
			
			for(int j=0; j<i; ++j) { // 중복체크
				if (lottery[i] == lottery[j]) { // 중복된다면
					i-- ; // 이전 자리로 가고
					break; // 안쪽 for문 빠져나가지
				}
			}
		}
		
		int co = 0;
		
		for(int i=0; i<lottery.length; i++) { // pc가 고른 수
			for(int j=0; j<lottery.length; j++) { // 내가 고른 수
				if(lottery[i] == select[j]) {
					co++; // 맞춤 카운트를 1개 높이고
					break; // 중복불가하므로 이후는 보지 않는다.
				}
			}
		}
		
		System.out.print("맞춘갯수: " + co);

	}

}
