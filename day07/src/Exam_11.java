// ☆
import java.util.*;

class Room{
	int roomSu;
	boolean roomMg[];
	
	Room(int roomSu){
		this.roomSu = roomSu;
		roomMg = new boolean[roomSu];
	}
	void input() {	//입실
		int roomNum = roomNum("입실");
		if (roomMg[roomNum-1]) {
			System.out.println(roomNum+"호실은 사용중입니다.");
		}else {
			roomMg[roomNum-1] = true;
			System.out.println(roomNum+"호실에 입실하셨습니다.");
		}
	}
	void output() {	//퇴실
		int roomNum = roomNum("퇴실");
		if (roomMg[roomNum-1]) {
			roomMg[roomNum-1] = false;
			System.out.println(roomNum+"호실에서 퇴실하셨습니다.");
		}else {
			System.out.println(roomNum+"호실은 빈방입니다.");
		}
	}
	void view()	{	//보기
		for(int i=0; i<roomSu; ++i) {
			if (roomMg[i]) {
				System.out.println(i+1+"호실은 사용중");
			}else {
				System.out.println(i+1+"호실은 빈방");
			}
		}
	}
	void exit()	{	//종료
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
	int roomNum(String mode) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print(mode+"하실 방의 번호 : ");
			int roomNum = in.nextInt();
			if (roomNum>0 && roomNum<=roomSu) return roomNum;
			System.out.println("방의 번호는 1번방부터 " + roomSu+"번까지만 입력하셔야 합니다.");
		}
	}
}

public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("방의 갯수를 입력 : ");
		int su = in.nextInt();
		
		Room room = new Room(su);	//객체를 생성
		while(true) {
			System.out.print("1.입실 2.퇴실 3.보기 4.종료 : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	room.input(); break;
			case 2 :	room.output(); break;
			case 3 :	room.view(); break;	
			case 4 :	room.exit(); break;
			default:	System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}











