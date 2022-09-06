class A08{
	String name;
	String addr;
	int a, b, c, d, e;
	A08(){
		a = 10;
		b = 20;
		c = 30;
		d = 40;
		e = 50;
		name = "홍길동";
		addr = "서울 강북구";
	}
	A08(String name){
		this();
		this.name = name;
	}
	A08(String name, String addr){
		this(name);//default 생성자 호출, 반드시 생성자의 첫번째 줄에 있어야 한다
		//this.name = name;//멤버필드명과 매개변수명이 같을때, 멤버필드라고 알려주기위해 this를 붙힌다
		//멤버필드나 멤버메소드를 사용할때는 this가 원래는 붙혀야 하는데 이를 생략해서 쓸 수 있다.
		this.addr = addr;
	}
	void disp() {
		System.out.println(this.name+"님의 주소는 " + this.addr);
	}
	void disp2() {
		disp();
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		A08 bp = new A08();
		A08 ap = new A08("홍길동", "서울 강북구"); // ap와 A08()은 생성자: 객체를 생성한다 / new연산자 = 동적메모리할당연산자로 힙에 저장
		//ap.name = "홍길동"; // 스택에 ap가 저장, 힙에 멤버필드값이 저장
		//ap.addr = "서울 강북구";
		ap = new A08("강호동", "서울 강남구");
		//ap.A08("aaa", "aaaa");
		ap.disp();
	}
}	

