/*☆
 *    1    
 *   123   
 *  12345  
 * 1234567 
 *123456789
 */
public class Exam_04 {
	public static void main(String[] args) {
		for(int i=1; i<=5; ++i) {
			for(int j=1; j<=5-i; ++j) { // 공백 출력
				System.out.print(" ");
			}
			for(int k=1; k<=i+(i-1); ++k) { // 숫자 출력
				System.out.print(k);
			}
			System.out.println();
		}
		
			
			
		
//		for(int i=1; i<=5; ++i) {
//			for(int k=1; k<=5-i; ++k) {
//				System.out.print(" "); // 5-i개 만큼 공백
//			}
//			for(int j=1; j<=i+(i-1); ++j) { // i개에 i-1만큼 더 출력
//				System.out.print(j);
//			}
//			System.out.println(); // 개행
//		}
	}
}