import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ŭ���� Scanner�� �ǹ� - Ű����(System.in)�� �Էµ� �ڷḦ in���� ó���ϰڴ�.
		
		// Scanner kk = new Scanner(System.in);
		// Ű���忡 �Էµ� �ڷḦ kk�� ó���ϰڴ�.

		System.out.print("�̸��� �Է�: ");
		String name = in.next(); // ���ڿ��� ó��. ����, ��, �ٰ��� ������
		System.out.print("���������� �Է�: ");
		int kor = in.nextInt();
		System.out.print("����� �Է�: ");
		double avg = in.nextDouble();
		
		System.out.println("�Է��Ͻ� �̸�: " + name);
		System.out.println("��������: " + kor + "��");
		System.out.println("���: " + avg);
	}
}