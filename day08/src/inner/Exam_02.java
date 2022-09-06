package inner;

import inner.Outer01.Inner01;

class Outer02{
	private int a;
	private static int b;
	static {
		b = 20;
	}
	public Outer02() {
		a = 10;
	}
	public void disp() { //멤버메소드
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	// 멤버로서 클래스를 사용할 수 있다 - 중첩클래스
	static class Inner02{ // ★ 바깥 클래스와는 따로 독립적으로 사용이 가능
		private int c; //이 멤버는 Outer01 클래스에서 사용할 수 없다.
		public Inner02() {
			c = 30;
		}
		public void disp_in() {
			//바깥의 클래스 멤버 중 static 멤버만 사용할 수 있다
//			System.out.println("a = " + a);
			System.out.println("b = " + b); // 바깥클래스의 프라이빗 멤버
			System.out.println("c = " + c);
		}
		
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		Outer02 ot = new Outer02();
		Outer02.Inner02 oi = new Outer02.Inner02(); //static 클래스이기 때문에 일반중첩클래스와 달리 바로 new로 객체생성 가능
	}

}
