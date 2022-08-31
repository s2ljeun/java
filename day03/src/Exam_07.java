import java.util.Scanner;

/*
 * 국어점수와 영어점수를 입력받아 평균값이 90점 이상이면 수, 80~89점 사이면 우, 70~79점 사이면 미, 60~69점 아시면 양, 59점 미만은 가를 출력시켜주는 프로그램.
 * 단, 점수는 0~100점 사이값만 입력되었다고 가정한다.
*/
public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요.");
		int kor = in.nextInt();

		System.out.println("영어점수를 입력하세요.");
		int eng = in.nextInt();
		
		int avg = (kor + eng) / 2;
		
		switch(avg/10) {
		case 10 : System.out.printf("평균 %d점, 수", avg); break;
		case 9 : System.out.printf("평균 %d점, 수", avg); break;
		case 8 : System.out.printf("평균 %d점, 우", avg); break;
		case 7 : System.out.printf("평균 %d점, 미", avg); break;
		case 6 : System.out.printf("평균 %d점, 양", avg); break;
		default : System.out.printf("평균 %d점, 가", avg);
		}
		
//		if (avg >= 90) {
//			System.out.printf("평균 %d점, 수", avg);
//		} else if (avg>= 80) {
//			System.out.printf("평균 %d점, 우", avg);
//		} else if (avg>= 70) {
//			System.out.printf("평균 %d점, 미", avg);
//		} else if (avg>= 60) {
//			System.out.printf("평균 %d점, 양", avg);
//		} else {
//			System.out.printf("평균 %d점, 가", avg);
//		}

	}

}
