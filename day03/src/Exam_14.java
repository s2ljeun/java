import java.util.Scanner;
import java.io.*;

/*
 * 구구단의 단수를 입력받아 그 단을 출력시켜주는 프로그램
*/

public class Exam_14 {
	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(System.in);
		
//		System.out.print("구구단의 단 수를 입력하세요.");
//		int num = System.in.read() - 48; // 한글자 입력받았으므로 아스키코드 값이 나온다. 0 -> 48
		

		 // 2단부터 9단까지 출력하기
				for(int i=2; i<=9; ++i) {
			for(int j=1; j<=9 ;++j) {
				System.out.printf("%d * %d = %d\n", i, j, j * i);
			}
		}

	}

}
