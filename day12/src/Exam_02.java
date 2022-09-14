import java.util.*;

// 10진수의 수를 입력받아 2진수로 표현하는 프로그램
public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("10진수를 입력: ");
		int su = in.nextInt();
		StringBuffer e = new StringBuffer();

		while(true) {
			int share = su/2;
			int remain = su%2;
			
			e.insert(0, remain);
			su = share;
			if(share<1) break;
		}
		System.out.println(e + "(2)");
		
		
	}
}

//public class Exam_02 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("수를 입력 : ");
//		int su = in.nextInt();
//		int su1 = su;
//		String binary = "";
//		while(true) {
//			if (su1 == 0) break;
//			binary = su1 % 2 + binary;
//			su1 /= 2;
//			System.out.println("su = " + su1);
//		}
//		
//		System.out.printf("%d의 2진수는 %s입니다.\n", su, binary);
//	}
//}
