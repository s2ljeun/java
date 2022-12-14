
public class Exam_07 {
	public static void main(String [] args) {
		// 단항연산자 - 논리부정연산자
		boolean c = true;
		System.out.println(!(!c)); // true
		
		// 논리연산자
		int a = 10;
		int b = 13;
		System.out.println(a==b & ++a>b); //1 10==13 && 11>13 a==b가 거짓이므로 뒤는 실행하지 않는다.
		System.out.println(a==b & ++a>b); //2 11==13 && 12>13
		System.out.println(a==b & ++a>b); //3 12==13 && 13>13
		System.out.println(a==b & ++a>b); //4 13==13 && 14>13
		
		// 배정대입연산자
		byte d = 10;
		//d = (byte)(a+5);
		d += 5; // d = d + 5
		
		// 나열연산자
		int e, f, g;
		
		//삼항연산자
		int h = 10;
		System.out.println(h==10 ? "a는 10입니다." : "a는 10이 아닙니다.");
		
		String i = "안녕";
		System.out.println(i=="안녕" ? "야호" : "메롱");
		
	}
}
