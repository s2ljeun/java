
public class Exam_15 {
	public static void main(String[] args) {

		// 2단부터 9단까지 출력하기 가로로
		for(int i=1; i<=9; ++i) {
			for(int j=2; j<=9; ++j) {
				System.out.printf("%d X %d = %d\t", j, i, j*i);
			}
			System.out.println(); // 줄개행
		}

	}

}
