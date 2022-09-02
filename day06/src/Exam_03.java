
public class Exam_03 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5]; // length=5
		
		int co = 1;
		for(int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) { // i=0, j=0,1,2,3,4, co=1,2,3,4,5 / i=1, j=0,1,2,3,4, co=6,7,8,9,10 ...
				arr[i][j] = co;
				++co;
			}
		}
		
		/*
		5	10	15	20	25
		4	9	14	19	24
		3	8	13	18	23
		2	7	12	17	22
		1	6	11	16	21
		 */
		
		for(int i=4; i>=0; --i) {
			for(int j=0; j<=4; ++j) {
				System.out.printf("%2d\t", arr[j][i]);

			}
			System.out.println();
		}

//		/*
//		25	24	23	22	21
//		20	19	18	17	16
//		15	14	13	12	11
//		10	9	8	7	6
//		5	4	3	2	1
//		 */
//		
//		for(int i=4; i>=0; --i) {
//			for(int j=4; j>=0; --j) {
//				System.out.printf("%2d\t", arr[i][j]);
//
//			}
//			System.out.println();
//		}
		
//		/*
//		21	16	11	 6	 1	
//		22	17	12	 7	 2	
//		23	18	13	 8	 3	
//		24	19	14	 9	 4	
//		25	20	15	10	 5	
//		 */
//		
//		for(int i=0; i<5; ++i) {
//			for(int j=4; j>=0; --j) {
//				System.out.printf("%2d\t", arr[j][i]);
//
//			}
//			System.out.println();
//		}
		

//		/*
//		 1	 2	 3	 4	 5	
//		 6	 7	 8	 9	10	
//		11	12	13	14	15	
//		16	17	18	19	20	
//		21	22	23	24	25	
//		 */
//
//		
//		for(int i=0; i<5; ++i) {
//			for(int j=0; j<5; ++j) {
//				System.out.printf("%2d\t", arr[i][j]);
//			}
//			System.out.println();
//		}
		
		
	}

}
