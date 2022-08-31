import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("무기를 선택: 1.칼 2.권총 3.주먹 4.소총: ");
		int select = in.nextInt();
		
		switch(select) { // byte, short, char, int, String만 가능
		// 순차적으로 모두 실행하게 되므로 케이스에 해당하면 break로 빠져나가도록 해준다.
		case 1 : System.out.print("칼을 선택하셨습니다."); break;
		case 2 : System.out.print("권총을 선택하셨습니다."); break;
		case 3 : System.out.print("주먹을 선택하셨습니다."); break;
		case 2+2 : System.out.print("소총을 선택하셨습니다."); break;
		default : System.out.print("잘못 선택하셨습니다.");
		}
		
		// case는 상수만 설정 가능하다. 연산이 들어가더라도 결과가 상수면 된다.
		
		/*
		if (select == 1) {
			System.out.print("칼을 선택하셨습니다.");
		} else if (select == 2) {
			System.out.print("권총을 선택하셨습니다.");
		} else if (select == 3) {
			System.out.print("주먹을 선택하셨습니다.");
		} else if (select == 4) {
			System.out.print("소총을 선택하셨습니다.");
		} else {
			System.out.print("잘못 선택하셨습니다.");
		}
		*/
	}

}
