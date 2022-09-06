// ��
import java.util.*;

class Room{
	int roomSu;
	boolean roomMg[];
	
	Room(int roomSu){
		this.roomSu = roomSu;
		roomMg = new boolean[roomSu];
	}
	void input() {	//�Խ�
		int roomNum = roomNum("�Խ�");
		if (roomMg[roomNum-1]) {
			System.out.println(roomNum+"ȣ���� ������Դϴ�.");
		}else {
			roomMg[roomNum-1] = true;
			System.out.println(roomNum+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
		}
	}
	void output() {	//���
		int roomNum = roomNum("���");
		if (roomMg[roomNum-1]) {
			roomMg[roomNum-1] = false;
			System.out.println(roomNum+"ȣ�ǿ��� ����ϼ̽��ϴ�.");
		}else {
			System.out.println(roomNum+"ȣ���� ����Դϴ�.");
		}
	}
	void view()	{	//����
		for(int i=0; i<roomSu; ++i) {
			if (roomMg[i]) {
				System.out.println(i+1+"ȣ���� �����");
			}else {
				System.out.println(i+1+"ȣ���� ���");
			}
		}
	}
	void exit()	{	//����
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	
	int roomNum(String mode) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print(mode+"�Ͻ� ���� ��ȣ : ");
			int roomNum = in.nextInt();
			if (roomNum>0 && roomNum<=roomSu) return roomNum;
			System.out.println("���� ��ȣ�� 1������� " + roomSu+"�������� �Է��ϼž� �մϴ�.");
		}
	}
}

public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� ������ �Է� : ");
		int su = in.nextInt();
		
		Room room = new Room(su);	//��ü�� ����
		while(true) {
			System.out.print("1.�Խ� 2.��� 3.���� 4.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	room.input(); break;
			case 2 :	room.output(); break;
			case 3 :	room.view(); break;	
			case 4 :	room.exit(); break;
			default:	System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
}











