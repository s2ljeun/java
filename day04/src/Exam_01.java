import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���������� �Է�: ");
		int kor = in.nextInt();
		
		System.out.println(kor>=90? "�հ�": "���հ�"); // ���׿�����
		
		System.out.print("�̸��� �Է�: ");
		String name = in.next();
		
		System.out.print("�̸�: " + name);
	}
}
