import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���⸦ ����: 1.Į 2.���� 3.�ָ� 4.����: ");
		int select = in.nextInt();
		
		switch(select) { // byte, short, char, int, String�� ����
		// ���������� ��� �����ϰ� �ǹǷ� ���̽��� �ش��ϸ� break�� ������������ ���ش�.
		case 1 : System.out.print("Į�� �����ϼ̽��ϴ�."); break;
		case 2 : System.out.print("������ �����ϼ̽��ϴ�."); break;
		case 3 : System.out.print("�ָ��� �����ϼ̽��ϴ�."); break;
		case 2+2 : System.out.print("������ �����ϼ̽��ϴ�."); break;
		default : System.out.print("�߸� �����ϼ̽��ϴ�.");
		}
		
		// case�� ����� ���� �����ϴ�. ������ ������ ����� ����� �ȴ�.
		
		/*
		if (select == 1) {
			System.out.print("Į�� �����ϼ̽��ϴ�.");
		} else if (select == 2) {
			System.out.print("������ �����ϼ̽��ϴ�.");
		} else if (select == 3) {
			System.out.print("�ָ��� �����ϼ̽��ϴ�.");
		} else if (select == 4) {
			System.out.print("������ �����ϼ̽��ϴ�.");
		} else {
			System.out.print("�߸� �����ϼ̽��ϴ�.");
		}
		*/
	}

}
