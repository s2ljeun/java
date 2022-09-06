/*
 * 팩토리얼 수 구하기
 * 값을 입력받으면 그 값까지 곱셈을 해서 결과를 알려주는 프로그램
 */
import java.util.*;
public class Exam_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력: ");
	
		int su = in.nextInt();
		int facsu = fac(su);

		System.out.printf("%d의 팩토리얼 값: %d", su, facsu);
	}
	
	public static int fac(int su) {
		if(su==1) return 1;
		su = su * fac(su-1);
		return su;
	}
}
