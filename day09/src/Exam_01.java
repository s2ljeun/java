class A01 { //extends Object가 생략됨
	
}

public class Exam_01 {
	public static void main(String[] args) {
		A01 ap = new A01();
		System.out.println("ap.getClass= " + ap.getClass());
		System.out.println("ap.toString= " + ap.toString());
		System.out.println("ap = "+ap);
		
		String name = "홍길동";
		System.out.println(name.toString()); //String을 출력할 때는 toString이 생략된 것이다.
		
		String a = new String("aaa"); // a.toString = b.toString but 각자 주소값이 다름
		String b = new String("aaa");
		if (a.equals(b)) { // 문자열의 비교는 equals를 통해서 비교한다 / a==b 하면 다른 문자열로 나옴.
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}
	}

}
