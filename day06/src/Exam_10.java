import java.util.Scanner;

/*
 * 홀수를 입력하면
 * 5를 입력했을 때
		A
	B	I	H
C	J	M	L	G
	D	K	F
		E
 */
public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int su;
		do {
			System.out.print("수를 입력 : ");
			su = in.nextInt();
		}while(su <= 0 || su%2==0);
		
		char[][] arr = new char[su][su];
		char co = 'A';
		int i = 0;
		int start = su / 2, end = su / 2;
		while(true) {
			for(int j=start; j<=end; ++j) {
				arr[i][j] = co;
				co++;
			}
			i++;
			if (i==su) break;
			if (i <= su/2) {
				start--;	end++;
			}else {
				start++;	end--;
			}
		}
		
		for(i=0; i<su; ++i) {
			for(int j=0; j<su; ++j) {
				System.out.printf("%c\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
