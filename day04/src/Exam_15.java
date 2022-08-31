import java.util.Scanner;

/*
 * 가위바위보 게임 만들기
 * 컴퓨터가 가위바위보 중 하나를 선택
 * 사용자는 키보드로 선택을 해서 결과를 알려주는 프로그램
 * 1.가위 2.바위 3.보 4.종료:
 */
public class Exam_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("가위, 바위, 보!");
		
		while(true) {
			System.out.println("1.가위 2.바위 3.보 4.종료");
			int comsu = (int)(Math.random()*3)+1; // pc의 선택 가위, 바위, 보
			int select = in.nextInt();
					
			switch(select) {
			case 1:
				if (comsu == 1) System.out.println("비겼습니다.");
				else if (comsu == 2) System.out.println("졌습니다.");
				else System.out.println("이겼습니다.");
				break;
			case 2:
				if (comsu == 2) System.out.println("비겼습니다.");
				else if (comsu == 3) System.out.println("졌습니다.");
				else System.out.println("이겼습니다.");
				break;
			case 3:
				if (comsu == 3) System.out.println("비겼습니다.");
				else if (comsu == 1) System.out.println("졌습니다.");
				else System.out.println("이겼습니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 프로그램을 종료시킬 때 사용하는 명령어
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}

			}
		}
	}