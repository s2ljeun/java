import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = in.next();

		System.out.print("국어점수를 입력하세요: ");
		int kor = in.nextInt();
		
		System.out.print("영어점수를 입력하세요: ");
		int eng = in.nextInt();

		int tot = kor + eng;
		
		System.out.printf("이름: %s, 총점: %d", name, tot);
	}

}
