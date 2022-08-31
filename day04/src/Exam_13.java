/*
 * 1~100 사이의 수를 컴퓨터가 선택을 한다
 * 사용자는 그 수를 맞추는 게임
 * 예를 들어 컴퓨터가 75를 선택했다고 가정을 하자
 * 수를 입력: 50
 * up
 * 수를 입력: 80
 * down
 * 수를 입력: 75
 * 4번만에 맞추셨습니다
 */
import java.util.*;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int correct = (int)(Math.random()*100)+1; // 1~100
		System.out.print(correct);
		int num;
		int i = 0;

		do {
			System.out.print("수를 입력: ");
			num = in.nextInt();
			++i;
			if (num>correct) {
				System.out.println("down");
			} else System.out.println("up");

		}while(num!=correct); {
			System.out.printf("%d번 만에 맞추셨습니다.",i);
		}
		
//		//강사님 풀이
//		int comsu = (int)(Math.random()*100)+1; // 1~100
//		int co = 0;
//
//		while(true) {
//			System.out.print("수를 입력: ");
//			int su = in.nextInt();
//			co++;
//			if (su == comsu) break;
//			else if (su < comsu) System.out.print("up");
//			else System.out.print("down");
//		}
//		System.out.println(co + "번 만에 맞추셨습니다.");
		
		
	}
}
