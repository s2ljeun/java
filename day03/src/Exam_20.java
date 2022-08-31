/*
 * 12345
 * 1234
 * 123
 * 12
 * 1
 * 12
 * 123
 * 1234
 * 12345 
*/

public class Exam_20 {
	public static void main(String[] args) {
		int co = 6;

		for(int i=1; i<=9; ++i) {
			if (i <= 5) {
				--co;
			}else {
				++co;
			}
			
			for(int j=1; j<=co; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
