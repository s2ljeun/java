/*��
***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****
i=1 *=5/1/5
i=2 *=4/3/4
i=3 *=3/5/3
i=4 *=2/7/2
i=5 *=1/9/1
 */
public class Exam_06 {
	public static void main(String[] args) {
		int co = 6;
		for(int i=1; i<=9; ++i) {
			if(i<=5) {
				--co;
			} else {
				++co;
			}
			for(int j=1; j<=co; ++j) {
				System.out.print("*");
			}
			for(int k=1; k<=(6-co)+(6-co)-1; ++k) {
				System.out.print(" ");
			}
			for(int j=1; j<=co; ++j) {
				System.out.print("*");
			}	
			System.out.println();
			}
		}
//		for(int i=1; i<=9; ++i) {
//			int co = 6;
//			if(i<=5) { // i = 1, 2, 3, 4, 5
//				--co;
//			} else { // i = 6, 7, 8, 9
//				++co;
//			}
//
//			for(int j=1; j<=6-i; ++j) { // * ����
//				System.out.print("*");
//			}
//			for(int k=1; k<=(i*2)-1; ++k) { // ���� ���
//				System.out.print(" ");
//			}
//			for(int u=1; u<=6-i; ++u) { // * ����
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
