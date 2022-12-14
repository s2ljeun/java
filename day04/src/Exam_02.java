import java.util.Scanner;

/*
 * 주차요금 계산기 만들기
 * 30분까지는 2000원이고, 이후 10분당 500원인 주차장이 있다
 * 분을 입력받아 주차요금이 얼마인지 알려주는 프로그램을 작성하세요.
 */

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("주차시간을 입력하세요: ");
		int minute = in.nextInt();
		int fee = 0;
		
		if(minute <= 30) {
			fee = 2000;
		} else { // minute > 30
			int add = 0;
			add = (minute - 30)/10; // 초과시간
			fee = 2000 + (500 * add);
		}
		
/*
 * int fee = 2000;
 * if(min>30){
 * min -= 30; // 1~10 => 10, 11~20 => 20
 * fee += ((min/10) + (min%10==0? 0 : 1)) * 500; //나머지가 있나 없나 여부로 ..?
 * }
 */
		
		
		System.out.printf("주차요금은 %d원입니다.", fee);
	}

}
