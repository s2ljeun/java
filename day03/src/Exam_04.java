import java.util.Scanner;

/*
 * 임의의 수 3개를 입력받아 큰 수대로 나열하기 a >= b >= c 형식
*/

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요.");
		int a = in.nextInt();

		System.out.print("두번째 수를 입력하세요.");
		int b = in.nextInt();

		System.out.print("세번째 수를 입력하세요.");
		int c = in.nextInt();
		
		// 제일 큰 수를 a에 넣기

		if (b>a && b>=c) {
			int imsi = a;
			a = b;
			b = imsi;
			
		}else if (c>a && c>b) { // 이미 위의 if에서 b>=c기 때문에 등호 넣을 필요 없다.
			int imsi = a;
			a = c;
			c = imsi;
		}
		
		// 두번째 큰 수를 b에 넣기
		
		if (c>b) {
			int imsi = b;
			b = c;
			c = imsi;
		}
		
		System.out.printf("%d >= %d >= %d", a, b, c);
	}
}
