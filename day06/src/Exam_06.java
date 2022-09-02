
public class Exam_06 {
	public static void main(String[] args) {
		int arr[][] = new int[9][5];
		
		int co = 0;
		int i = 0;
		int j = 0;
		boolean po = true;//true는 오른쪽이동, false는 왼쪽이동
		while(true) {
			if (po) {
				for(j=0; j<=4; ++j) {
					arr[i][j] = ++co;
				}
				j--;
			}else {
				for(j=4; j>=0; --j) {
					arr[i][j] = ++co;
				}
				j++;
			}
			i++;
			if (i>8) break;
			arr[i][j] = ++co;
			i++;
			po = !po;
		}
		for(i=0; i<9; ++i) {
			for(j=0; j<5; ++j) {
				if (arr[i][j] == 0) System.out.print("\t");
				else System.out.printf("%2d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
