import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try { // 지역변수 주의
			System.out.print("국어점수를 입력 : ");
			int kor = in.nextInt();
			System.out.println("국어점수 : " + kor);
		}catch(InputMismatchException e) { // 이 예외가 발생할 시 try절 실행 멈추고 e(내가 지정한 객체명!!!)로 받아서 처리하겠다.
			System.err.println("국어점수는 숫자만 입력해 주세요");
		}catch(ArithmeticException e) { // catch 여러개 - 나올 수 있는 예외는 다 적어줘도 된다.
			System.out.print("0으로 나눌 수 없습니다.");
		}finally { //try절이 끝나면 무조건 불려들어가서 멀티스레드로 실행 - 현재 프로그램에 영향을 주고 싶지 않은데 무언가 실행해야할 때 > db닫는 등에서 자주 사용
			// try절이 끝나는 시점: 1. try절이 모두 실행되어 끝났을때, 2. 예외가 발생했을 때
			System.out.println("finally절이 실행되고 있습니다.");
		}
	}
}
