import java.util.*;

class MyException02 extends Exception{ // 예외클래스 만들기
	private String message;
	
	public MyException02(String msg) {
		super(msg);
	}
	
	public String getMessage() {
		message = super.getMessage() + "0점에서 100점 사이의 점수를 입력하세요.";
		return message;
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.print("국어점수를 입력: ");
			int kor = in.nextInt();
			
			if(kor<0 || kor>100) throw new MyException02("국어: "); // 예외클래스 객체(인스턴스) 생성(설계도를 보고 자동차 만들기)
			
			System.out.print("입력한 점수는 " + kor + "점");
			
		} catch(InputMismatchException e) {
			System.err.println("숫자만 입력해주세요.");
		} catch(MyException02 e) { // 내가 설정한 exception이 발생하면
			 System.err.println(e.getMessage());
		}
	}
}