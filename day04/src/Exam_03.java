/*☆
 *     1
 *    12
 *   123
 *  1234
 * 12345
 */

public class Exam_03 {
	public static void main(String[] args) {
		for(int i=1; i<=5; ++i) {
			for(int j=1; j<=6-i; ++j) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; ++k) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		
//		for(int i=1; i<=5; ++i) {
//			for(int k=1; k<=5-i; ++k) {
//				System.out.print(" "); // 5-i개 만큼 공백
//			}
//			for(int j=1; j<=i; ++j) { // i개 만큼 숫자(j)
//				System.out.print(j);
//			}
//			System.out.println(); // 개행
//		}
	}
}
