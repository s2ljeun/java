/*
 * 2개의 수를 입력받아 절댓값이 큰 수를 알려주는 프로그램
 * 입력한 두 개의 수를 보내서 절댓값이 큰 수를 반환해주는 메소드를 만들어서 작성
*/
import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		int su1 = input();
		int su2 = input();
		int bigsu = absBigsu(su1, su2);
		System.out.println("절대값이 큰 수 : " + bigsu);
	}
	
	public static int absBigsu(int a, int b) {
		if (abs(a)>abs(b)) return a;
		else return b;
	}
	public static int abs(int a) {
		if (a<0) return a*-1;
		return a;
	}
	
	
	public static int input() {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int su = in.nextInt();
		return su;
	}
}
