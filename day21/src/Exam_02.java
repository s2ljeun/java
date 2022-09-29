class MyException extends Exception{ // a. Exception 클래스를 상속받음으로서 예외클래스 만들기
	private String message;

	public MyException(String msg) {
		super(msg);
	}
	
	public String getMessage() { // b. 가능한 오버라이딩
		message = super.getMessage() + "내가 만든 예외 클래스!!"; // Exception으로 super()해준 msg를 Exception의 message에 오버라이드
		return message;
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		try {
			MyException me = new MyException("예외코드: "); // 1. 객체 생성함으로서 "예외코드:" 가 MyException 클래스 생성자의 매개변수(String msg)로 가고
			// 2. 생성자에서 이 msg를 super()해줬으므로 상속받은 부모클래스인 Exception으로 올라가고,
			// 3. getMessage()를 오버라이드 하고 / message = super.getMessage(msg가 들어와있음) + "내가 만든 예외 클래스"를 리턴
			// 4. 따라서 me에는 Exception의 message가 들어있음.
			// 5. throw me로 강제로 예외를 발생 -> catch절로 가서 e.getMessage를 실행
			throw me; // 예외를 강제로 발생
		}catch(MyException e) { // me가 e가 된다
			System.err.println(e.getMessage()); // err은 out이랑 같은데 붉은 글씨로 나오는 것 뿐
		}
	}
}
