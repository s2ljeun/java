
public class Exam_06 {
	public static void main(String[] args) {
		String name = "홍길동";
		System.out.println("안녕하세요 " + name + "님, 반갑습니다.");
		int a = 10;
		int b = 3;
		System.out.println("두수의 합: " + a + b);
		System.out.println("두수의 합: " + (a + b)); // 우선순위 적용
		
		System.out.println(a/b); // int / int => int 자동형변환
		System.out.println(a/(float)b); // int / float => float 둘중 하나만 강제형변환
		System.out.println((float)(a/b)); // float(int / int) => float 이미 나온 값을 강제형변환
	}

}
