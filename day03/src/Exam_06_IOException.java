import java.util.Scanner;
import java.io.*; // throws IOEcxeption를 위한 import

/*
 * 임의의 수 2개와 산술연산자를 입력받아 그 연산자 대로 실행하는 프로그램
 */

public class Exam_06_IOException {
	public static void main(String[] args) throws IOException { // System.in.read()를 위해서
		Scanner in = new Scanner(System.in);

		System.out.print("첫번째 수를 입력하세요: ");
		int a = in.nextInt();
		
		System.out.print("두번째 수를 입력하세요: ");
		int b = in.nextInt();

		System.out.print("산술연산자를 입력하세요: "); // String으로 받으면 구분 불가
		char op = (char)System.in.read(); // 키보드(System.in)로 들어오는 것 중에 한 글자 읽겠다(read()), 입력값은 자동형변환 - int가 되므로 강제형변환
		
		if (op=='+') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a+b);
		} else if (op=='-') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a-b);
		}else if (op=='*') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a*b);
		}else if (op=='/') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a/b);
		}else if (op=='%') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a%b);
		}else {
			System.out.print("입력하신 연산자는 산술 연산자가 아닙니다.");
		}
	}
}
