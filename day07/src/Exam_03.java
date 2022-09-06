/*
 * 2개의 수와 1개의 산술연산자를 이용하여 그 연산자대로 실행시켜주는 프로그램
 * 첫번째 수: 10
 * 두번째 수: 20
 * 산술연산자: *
 * 10 * 20 = 200
 * +: add메소드를 이용하여 만들어 주세요
 * -: min메소드를 이용하여 만들고, 큰 값에서 작은 값을 뺀 결과를 알려주세요
 * *: mul메소드를 이용하여 먼들어 주세요
 * 	/: div메소드를 이용하여 만들고, 만약 2번째 값이 0이면 1로 바꾸어서 만들어 주세요.
  *  */
import java.util.*;
import java.io.*;

public class Exam_03 {
	public static void main(String[] args) throws IOException {
		int su1 = input();
		int su2 = input();
		char op = (char)System.in.read();
		
		int tot = 0;
		switch(op) {
		case '+' : tot = add(su1, su2); break;			
		case '-' : tot = min(su1, su2); break;
		case '*' : tot = mul(su1, su2); break;
		case '/' : tot = div(su1, su2); break;
		default : System.out.println("잘못입력하셨습니다."); System.exit(0);
		}
		
		System.out.printf("%d %c %d = %d\n", su1, op, su2, tot);
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int min(int a, int b) {
		if (a>b) return a-b;
		else return b-a;
	}
	public static int div(int a, int b) {
		if (b==0) b = 1;
		return a/b;
	}
	
	public static int input() {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int su = in.nextInt();
		return su;
	}
}
