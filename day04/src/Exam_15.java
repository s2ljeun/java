import java.util.Scanner;

/*
 * ���������� ���� �����
 * ��ǻ�Ͱ� ���������� �� �ϳ��� ����
 * ����ڴ� Ű����� ������ �ؼ� ����� �˷��ִ� ���α׷�
 * 1.���� 2.���� 3.�� 4.����:
 */
public class Exam_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("����, ����, ��!");
		
		while(true) {
			System.out.println("1.���� 2.���� 3.�� 4.����");
			int comsu = (int)(Math.random()*3)+1; // pc�� ���� ����, ����, ��
			int select = in.nextInt();
					
			switch(select) {
			case 1:
				if (comsu == 1) System.out.println("�����ϴ�.");
				else if (comsu == 2) System.out.println("�����ϴ�.");
				else System.out.println("�̰���ϴ�.");
				break;
			case 2:
				if (comsu == 2) System.out.println("�����ϴ�.");
				else if (comsu == 3) System.out.println("�����ϴ�.");
				else System.out.println("�̰���ϴ�.");
				break;
			case 3:
				if (comsu == 3) System.out.println("�����ϴ�.");
				else if (comsu == 1) System.out.println("�����ϴ�.");
				else System.out.println("�̰���ϴ�.");
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0); // ���α׷��� �����ų �� ����ϴ� ��ɾ�
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}

			}
		}
	}