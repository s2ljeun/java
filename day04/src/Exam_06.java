/*☆
***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****
i=1 *=5/1/5 co=5
i=2 *=4/3/4 co=4
i=3 *=3/5/3 co=3
i=4 *=2/7/2 co=2
i=5 *=1/9/1 co=1

공백 찍기
별의수/공백의수
5/1 -> 공백의 수는 (6-별의수5)+0 // 0은 (6-별의수5)-1
4/3 -> 공백의 수는 (6-별의수4)+1 // 1은 (6-별의수4)-1
3/5 -> 공백의 수는 (6-별의수3)+2 // 2는 (6-별의수3)-1
2/7	-> 공백의 수는 (6-별의수2)+3 // 3은 (6-별의수2)-1
1/9 -> 공백의 수는 (6-별의수1)+4 // 4는 (6-별의수1)-1
따라서 도출되는 공식: (6-co)+(6-co)-1

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
			for(int j=1; j<=co; ++j){ // 숫자 찍기
				System.out.print("*");
			}
			
			for(int k=1; k<=(6-co)+(6-co)-1; ++k) { // 공백 찍기
				System.out.print(" ");
			}
			
			for(int j=1; j<=co; ++j){ // 숫자 찍기
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
	}
}
