import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("국어점수를 입력: ");
		int kor = in.nextInt();
		
		System.out.println(kor>=90? "합격": "불합격"); // 삼항연산자
		
		System.out.print("이름을 입력: ");
		String name = in.next();
		
		System.out.print("이름: " + name);
	}
}
