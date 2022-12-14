/*☆
 * up-down게임 반대
 * 사용자가 1~100사이의 수를 선택하고 컴퓨터가 맞추는 게임
 * 예를 들어 사용자가 75를 선택
 * 1~100 사이의 수 랜덤: 50 1.up 2.down 3.정답: 1
 * 51~100 사이의 수 랜덤: 80 1. up 2. down 3. 정답: 2
 * 51~79 사이의 수 랜덤:
 */
import java.util.*;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("1~100 사이의 수를 하나 생각하고 Enter키를 누르세요!!");
		in.nextLine(); // 공백을 구별자로 사용하는 in.next()와 달리 enter키가 들어올 때까지 기다린다.
		int multi = 100, plus = 1;
		
		while(true) {
			int su = (int)(Math.random() * multi) + plus; // 초기 1 ~ 100
			System.out.println("당신이 생각한 수가 : " + su + "입니까?");
			System.out.println("1.up 2.down 3.정답");
			int select = in.nextInt();
			
			/*
			 * 범위 조절이 중요한데
			 * 1~100이 나오려면		1)random*100하면 0~99 2) +1하면 1~100
			 * 51~100이 나오려면	2)random*10*5하면0~45 2) +51하면 51~95 ???
			 * 56~100이 나오려면	random*45 + 56
			 */
			
			if (select == 3) { 				// 유저가 3을 선택하면
				break;
			} else if (select == 1) { 		// 유저가 1. up을 선택하면
				multi = (multi+plus-1) - su;
				// up을 부르면 앞의 범위를 늘려야 함 / 50? 1.up -> 51~100이므로 가짓수가 50개라는 뜻, 100개에서 부른 수 50을 빼서 random에 곱해야 함.
				// 따라서 multi = 100+1 -1(100개에서) - 50 = 50
				plus = su + 1;
				// random * multi를 하면 0~49(multi) 범위가 나오므로, + su +1을 하면 51~100으로 올바른 범위가 됨.
				
				// ex)두번째 시도, 61? 1.up -> 51~100에서 62~100이 되어야 하므로 앞의 수가 바뀌어야 한다. 남은 가짓수가 39개라는 뜻, 100개에서 62를 빼서 random에 곱해야 함
				// multi = 50+51-1(백) - su(61) = 39
				// 이를 곱하면 다음 범위가 0~38이 되므로 +plus에 부른 수 61+1을 더하면 62~100으로 올바른 범위가 됨.
			} else if (select == 2) { 		// 유저가 2. down을 선택하면
				multi = su - plus;
				// 62~100, 69? 2.down -> 62~68이 되어야 하므로 뒤의 범위가 움직여야 한다. Math.random*multi(=68)이면 되므로 부른 수 69- plus(61)=8
				// 0~7의 범위(=현재 범위의 가짓수)에서 plus61+1을 더하면 62~69로 알맞은 범위가 된다.
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요!!");
			}
			
		}
		
		System.out.printf("정답을 맞추어서 프로그램을 종료합니다.");
	}

}
