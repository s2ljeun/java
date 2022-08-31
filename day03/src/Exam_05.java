import java.util.Scanner;

/*
 * 임의의 수를 하나 입력받아 그 수가 3의 배수인지, 5의 배수인지, 3과 5의 배수인지, 3과 5의 배수가 아닌지를 알려주는 프로그램
*/
public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int num = in.nextInt();
		
		if (num%3 == 0) { // 조건문은 위에서부터 걸러져서 내려간다고 생각해야 하므로 공배수 조건을 상단에 써야한다.
			if (num%5 == 0) {
				System.out.print("입력하신 숫자는 3과 5의 공배수입니다");
			} else {
				System.out.print("입력하신 숫자는 3의 배수입니다");
			}			
		} else if (num%5 == 0) {
			System.out.print("입력하신 숫자는 5의 배수입니다.");
		} else {
			System.out.print("입력하신 숫자는 3과 5의 배수가 아닙니다.");
		}
	}
}
