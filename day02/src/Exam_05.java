import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = in.next();

		System.out.print("���������� �Է��ϼ���: ");
		int kor = in.nextInt();
		
		System.out.print("���������� �Է��ϼ���: ");
		int eng = in.nextInt();

		int tot = kor + eng;
		
		System.out.printf("�̸�: %s, ����: %d", name, tot);
	}

}
