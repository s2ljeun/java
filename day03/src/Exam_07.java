import java.util.Scanner;

/*
 * ���������� ���������� �Է¹޾� ��հ��� 90�� �̻��̸� ��, 80~89�� ���̸� ��, 70~79�� ���̸� ��, 60~69�� �ƽø� ��, 59�� �̸��� ���� ��½����ִ� ���α׷�.
 * ��, ������ 0~100�� ���̰��� �ԷµǾ��ٰ� �����Ѵ�.
*/
public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("���������� �Է��ϼ���.");
		int kor = in.nextInt();

		System.out.println("���������� �Է��ϼ���.");
		int eng = in.nextInt();
		
		int avg = (kor + eng) / 2;
		
		switch(avg/10) {
		case 10 : System.out.printf("��� %d��, ��", avg); break;
		case 9 : System.out.printf("��� %d��, ��", avg); break;
		case 8 : System.out.printf("��� %d��, ��", avg); break;
		case 7 : System.out.printf("��� %d��, ��", avg); break;
		case 6 : System.out.printf("��� %d��, ��", avg); break;
		default : System.out.printf("��� %d��, ��", avg);
		}
		
//		if (avg >= 90) {
//			System.out.printf("��� %d��, ��", avg);
//		} else if (avg>= 80) {
//			System.out.printf("��� %d��, ��", avg);
//		} else if (avg>= 70) {
//			System.out.printf("��� %d��, ��", avg);
//		} else if (avg>= 60) {
//			System.out.printf("��� %d��, ��", avg);
//		} else {
//			System.out.printf("��� %d��, ��", avg);
//		}

	}

}
