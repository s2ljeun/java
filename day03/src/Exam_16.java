/*
12345
23456
34567
45678
56789
 */

public class Exam_16 {
	public static void main(String[] args) {
		for(int i=1;i<=5;++i) { // 총 5번 반복
			for(int j=i;j<=i+4;++j) { // 1,2,3,4,5로 시작해서(j=i) 각각 4를 더한 값까지 출력
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
