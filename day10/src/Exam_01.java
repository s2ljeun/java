interface A01{ // 다중상속을 위해 처음 등장
	//멤버필드 - 상수만 사용 가능 + 자동으로 public static final > 수를 바꿀 수 없으므로 다중상속에 활용
	public static final int A = 1;
	public static int b = 2;
	public final int c = 3;
	int d = 4; // public static final 생략됨
	
	//멤버메소드 - 추상메소드만 가능
	public abstract void disp();
	void disp2(); // public abstract void 생략
	
	//중첩클래스 (static만 올 수 있다)
	static class Inner01{}
	class Inner02{} // static 생략
	
	//생성자는 없음
}

public class Exam_01 {
	public static void main(String[] args) {
		System.out.println("a = " + A01.A); // static이므로 객체 만들지 않고 클래스 이름으로 접근 가능
//		A01.A = 100; // final이므로 수정 불가
		System.out.println("b = " + A01.b);
//		A01.b = 100; // interface 안에서는 final이라고 쓰지 않아도 final,
		System.out.println("c = " + A01.c); // interface 안에서는 static 쓰지 않아도 static
	}

}
