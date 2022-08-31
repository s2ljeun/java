
public class Exam_10 {
	public static void main(String[] args) {
		int sum = 0; // int sum 이라고만 쓰면 쓰레기값
		for(int i=1; i<=100; ++i) {
			sum += i; // sum = sum + i
		}
		
		System.out.print("1부터 100까지의 합: " + sum);
	}

}
