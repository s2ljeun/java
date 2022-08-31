/*
 ¡Ù
1
12
123
1234
12345
1234
123
12
1
 */

public class Exam_19 {
	public static void main(String[] args) {
		
		int co = 0;
		
		for(int i=1; i<=9; ++i) {
			if(i<=5) { // i = 1, 2, 3, 4, 5
				++co;
			}else { // i = 6, 7, 8, 9
				--co;
			}
			
			for(int j=1; j<=co; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
