/*
���� �Է� : 3

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
			System.out.print("���� �Է� : ");
			su = in.nextInt();
		}while(su <= 0 || su%2==0);
		
		int[][] arr = new int[su][su];
		int co = 1;
		int i = 0; int j = su/2;	//1�� ����
		while(true) {
			arr[i][j] = co;
			int oldI = i; int oldJ = j;
			i--; j++;				//2�� ����
			if (i<0)	i = su-1;	//3�� ����
			if (j==su)	j = 0;		//4�� ����
			if (arr[i][j] != 0) {	//5�� ����
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
