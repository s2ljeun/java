package inner;
class Outer04{
	public void aaa() {
		System.out.println("aaa메소드입니다.");
	}
	public void bbb() {
		System.out.println("ddd메소드입니다.");
	}
	public void ccc() {
		System.out.println("ccc메소드입니다.");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		// 객체 생성시 메소드를 오버라이드해서 생성할 수 있는데, 이때 생성되는 객체는
		// Outer04클래스의 객체가 아니라 새로운 클래스(Outer04$1.class)를 만들어서
		// 새로운 클래스의 객체가 되는 것이다.
		Outer04 ot = new Outer04() { //객체 만들 때 구문을 선언하고
			public void bbb() { // 오버라이드 가능
				System.out.println("bbb메소드입니다.");
			} // 원판이 가진 메소드만 고쳐서 실행가능. (새로만든 메소드를 원판메소드 안에 넣으면 실행은 가능)
		};
		ot.aaa();
		ot.bbb();
		ot.ccc();
	}

}
