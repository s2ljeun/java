// 재귀호출

public class Exam_05 {
	public static void main(String[] args) {
		int su = plus(5);
		System.out.println("1~5까지의 합 : " + su);
	}
	
	public static int plus(int a) {
		if (a == 1) return 1;
		int sum = a + plus(a-1);
		return sum;
	}
}
