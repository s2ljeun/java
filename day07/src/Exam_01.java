import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		intro();
		int su1 = input(); //메소드 호출
		int su2 = input();
		int hap = sum(su1, su2);
		output(su1, su2, hap);
	}
	
	// 반환형이 없고, 매개변수도 없는 메소드
	public static void intro() {
		System.out.println("두개의 수를 입력하면 그 합을 알려주는 프로그램");
	}
	
	// 반환형은 없고, 매개변수는 있는 메소드
	public static void output(int a, int b, int c) {
		System.out.printf("%d + %d = %d\n", a, b, c);
	}
	
	// 반환형이 있고, 매개변수도 있는 메소드
	public static int sum(int a, int b) { // int a, int b가 매개변수
		return a + b;
		
	}
	
	// 반환형은 있고, 매개변수가 없는 메소드
	public static int input() { // 메소드, 반환형은 int / main에서 호출하는 메소드들은 public static 붙인다
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력: ");
		int su = in.nextInt();
		return su;
	}
}
