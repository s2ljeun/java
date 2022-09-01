/*
 * ���� ������ �Է¹޾� ���� �����, �� ���� �����ϴ� ���α׷�
 * ���� ����: 3
 * 1.�Խ� 2.��� 3.���� 4.���� : 1
 * �Խ��Ͻ� ���� ��ȣ: 1
 * 1ȣ�ǿ� �Խ��ϼ̽��ϴ�
 * 1.�Խ� 2.��� 3.���� 4.���� : 1
 * �Խ��Ͻ� ���� ��ȣ: 1
 * 1ȣ���� ����� �Դϴ�.
 * 1.�Խ� 2.��� 3.���� 4.���� : 2
 * ����Ͻ� ���� ��ȣ: 2
 * 2ȣ���� ����Դϴ�.
 * 1.�Խ� 2.��� 3.���� 4.����: 3
 * 1ȣ�� - �����
 * 2ȣ�� - ���
 * 3ȣ�� - ���
 * 1.�Խ� 2.��� 3.���� 4.����: 2
 * ����Ͻ� ���� ��ȣ: 1
 * 1ȣ�ǿ��� ����ϼ̽��ϴ�.
 * 1.�Խ� 2.��� 3.���� 4.����: 4
 * ���α׷��� �����մϴ�
 */
//import java.util.*;
//public class Exam_05 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//
//		System.out.print("���� ����: ");
//		int roomSu = in.nextInt(); // �� ����
//		String room[] = new String[roomSu]; // �� ����
//		
//		for(int i=0; i<roomSu; i++) { // �� �ʱⰪ ����
//			room[i] = "���"; // room[0] = "���" ...
//		}
//		
//		while(true) {
//			System.out.print("1.�Խ� 2.��� 3.���� 4.����: ");
//			int select = in.nextInt(); // ������
//
//			switch(select) { // �������� ���Ͽ�
//			case 1: // 1�� ����
//				System.out.println("�Խ��Ͻ� ���� ��ȣ: ");
//				int choice = in.nextInt(); // �� ��ȣ�� ����
//				if(room[choice-1] == "�����") { // ������̸�
//					System.out.println(choice + "ȣ���� ������Դϴ�.");
//				}else if(room[choice-1] == "���") { // ����̸�
//					room[choice-1] = "�����"; // ��������� ����
//					System.out.println(choice + "ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
//				}
//				break;
//
//			case 2:
//				System.out.print("����Ͻ� ���� ��ȣ: ");
//				int choice_2 = in.nextInt();
//				if(room[choice_2-1] == "���") { // ����̸�
//					System.out.println(choice_2 + "ȣ���� ����Դϴ�.");
//				}else { // ������̸�
//					room[choice_2-1] = "���"; // ������� ����
//					System.out.println(choice_2 + "ȣ�ǿ��� ����ϼ̽��ϴ�.");
//				}
//				break;
//			case 3:
//				for(int i = 0; i<roomSu; ++i) {
//					System.out.println(i+1 + "ȣ��: " + room[i]);
//				}
//				break;
//			case 4:
//				System.out.println("���α׷��� �����մϴ�.");
//				System.exit(0);
//				
//			default :
//				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
//			}
//			
//		}

import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� ������ �Է� : ");
		int roomSu = in.nextInt();
		boolean[] room = new boolean[roomSu];
		//false�� ���, true�� �����
		
		while(true) {
			System.out.print("1.�Խ�  2.���  3.����  4.���� : ");
			int select = in.nextInt();
			int roomNum;
			switch(select) {
			case 1 :
				do {
					System.out.print("�Խ��Ͻ� ���� ��ȣ : ");
					roomNum = in.nextInt();
				}while(roomNum<1 || roomNum>roomSu);
				if (room[roomNum-1]) {
					System.out.println(roomNum+"ȣ���� ������Դϴ�.");
				}else {
					room[roomNum-1] = true;
					System.out.println(roomNum+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
				}
				break;
			case 2 :
				do {
					System.out.print("����Ͻ� ���� ��ȣ : ");
					roomNum = in.nextInt();
				}while(roomNum<1 || roomNum>roomSu);
				if (room[roomNum-1]) {
					room[roomNum-1] = false;
					System.out.println(roomNum+"ȣ�ǿ��� ����ϼ̽��ϴ�.");
				}else {
					System.out.println(roomNum+"ȣ���� ����Դϴ�.");
				}
				break;
			case 3 :
				for(int i=0; i<roomSu; ++i) {
					if (room[i]) {
						System.out.printf("%dȣ�� - �����", i+1);
					}else {
						System.out.printf("%dȣ�� = ���", i+1);
					}
				}
				break;
			case 4 :
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ���");
			}
		}
	}

		

	}

