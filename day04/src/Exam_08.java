
public class Exam_08 {
	public static void main(String[] args) {
		int sum = 0;

		//while true문
//		while(true) {
//			sum += i;
//			++i;
//			if(i>100) break; // 한줄일 때는 중괄호 생략 가능
//		}
		
		//while문
		int i = 1;
		while(i<=100) {
			sum += i;
			++i;
		}

		//for문
//		for(int i=1; i<=100; ++i) {
//			sum += i;
//		}
		System.out.print(sum);
	}
}
