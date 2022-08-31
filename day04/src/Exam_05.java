/*☆
 *    1    
 *   123   
 *  12345  
 * 1234567 
 *123456789
 * 1234567
 *  12345
 *   123
 *    1
1 4/1/0
2 3/2/1
3 2/3/2
3 1/4/3
5 0/5/4
6 1/4/3
7 2/3/2
8 3/2/1
9 4/1/0
 */


public class Exam_05 {
	public static void main(String[] args) {
		
		int co = 0;

		for(int i=1; i<=9; ++i) {
			if (i<=5) {
				++co;
			} else {
				--co;
			}
			for(int k=1; k<=6-co; ++k) { // 공백 찍기 6-co개만큼
				System.out.print(" ");
			}
			for(int j=1; j<=co+(co-1); ++j) { // 숫자 찍기 co개에 co-1개만큼 더 출력
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}