import java.util.*;

// 10������ ���� �Է¹޾� 2������ ǥ���ϴ� ���α׷�
public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("10������ �Է�: ");
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
//		System.out.print("���� �Է� : ");
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
//		System.out.printf("%d�� 2������ %s�Դϴ�.\n", su, binary);
//	}
//}
