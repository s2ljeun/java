/*
수를 입력 : 3

 8	 1	 6	
 3	 5	 7	
 4	 9	 2	

 */
import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int su;
		do {
			System.out.print("수를 입력 : ");
			su = in.nextInt();
		}while(su <= 0 || su%2==0);
		
		int[][] arr = new int[su][su];
		int co = 1;
		int i = 0; int j = su/2;	//1번 조건
		while(true) {
			arr[i][j] = co;
			int oldI = i; int oldJ = j;
			i--; j++;				//2번 조건
			if (i<0)	i = su-1;	//3번 조건
			if (j==su)	j = 0;		//4번 조건
			if (arr[i][j] != 0) {	//5번 조건
				i = oldI;
				j = oldJ;
				i++;
			}
			++co;
			if (co>(su*su)) break;
		}
		
		for(i=0; i<su; ++i) {
			for(j=0; j<su; ++j) {
				System.out.printf("%2d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
