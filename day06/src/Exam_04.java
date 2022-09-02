/*
 1	 2	 3	 4	 5	
16	17	18	19	 6	
15	24	25	20	 7	
14	23	22	21	 8	
13	12	11	10	 9	
 */

public class Exam_04 {
	public static void main(String[] args) { // 아래 for문에서 공통점을 찾아 단축하기
		int arr[][] = new int[5][5];
		
		int co = 0;
		int k = 4;
		for(int j=0; j<3; ++j){
			for(int i=j; i<=k; ++i){arr[j][i] = ++co;}
			for(int i=j+1; i<=k; ++i){arr[i][k] = ++co;}
			for(int i=k-1; i>=j; --i){arr[k][i] = ++co;}
			for(int i=k-1; i>=j+1; --i){arr[i][j] = ++co;}
			k--;
		}
		
		for(int i=0; i<=4; ++i) {
			for(int j=0; j<=4; ++j) {
				System.out.printf("%2d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
/*
for(int i=0; i<=4; ++i){arr[0][i] = ++co;}	//1,2,3,4,5
for(int i=1; i<=4; ++i){arr[i][4] = ++co;}	//6,7,8,9
for(int i=3; i>=0; --i){arr[4][i] = ++co;}	//10,11,12,13
for(int i=3; i>=1; --i){arr[i][0] = ++co;}	//14,15,16

for(int i=1; i<=3; ++i){arr[1][i] = ++co;}	//17,18,19
for(int i=2; i<=3; ++i){arr[i][3] = ++co;}	//20,21
for(int i=2; i>=1; --i){arr[3][i] = ++co;}	//22,23
for(int i=2; i>=2; --i){arr[i][1] = ++co;}	//24

for(int i=2; i<=2; ++i){arr[2][i] = ++co;}	//25
for(int i=3; i<=2; ++i){arr[i][2] = ++co;}
for(int i=1; i>=2; --i){arr[2][i] = ++co;}
for(int i=1; i>=3; --i){arr[i][2] = ++co;}
*/
