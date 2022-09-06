package inner;
class Outer01{
	private int a;
	private static int b;
	Inner01 inner = new Inner01(); // 객체 하나 생성해서 내부클래스에 접근하기 쉽게
	static {
		b = 20;
	}
	public Outer01() {
		a = 10;
	}
	public void disp() { //멤버메소드
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	// 멤버로서 클래스를 사용할 수 있다 - 중첩클래스
	class Inner01{ // 외부클래스이름$내부클래스이름
		private int c; //이 멤버는 Outer01 클래스에서 사용할 수 없다.
		public Inner01() {
			c = 30;
		}
		public void disp_in() {
			//바깥의 클래스 멤버를 사용할 수 있다
			System.out.println("a = " + a); // 바깥클래스의 프라이빗 멤버
			System.out.println("b = " + b); // 바깥클래스의 프라이빗 멤버
			System.out.println("c = " + c);
		}
		
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		Outer01 ot = new Outer01(); //바깥 클래스 객체 생성
		Outer01.Inner01 oi = ot.new Inner01();  //Outer01$Inner01.class outer클래스에 먼저 접근해야 new 생성 가능.
		ot.inner.disp_in();
	}

}
