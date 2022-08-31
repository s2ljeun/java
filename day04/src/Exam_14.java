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
				multi = (multi+plus-1) - su; // 앞의 범위를 늘리기 위해  multi값이 su가 되어야하는데? 그러면 뒤의 값도 올라가니까 -su를??
				plus = su + 1; // plus는 최종 su값에 +1 해주는 역할이므로 su+1 ???ㅋㅋ
			} else if (select == 2) { 		// 유저가 2. down을 선택하면
				multi = su - plus;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요!!");
			}
			
		}
		
		System.out.printf("정답을 맞추어서 프로그램을 종료합니다.");
	}

}
