/*
 * 방의 갯수를 입력받아 방을 만들고, 그 방을 관리하는 프로그램
 * 방의 갯수: 3
 * 1.입실 2.퇴실 3.보기 4.종료 : 1
 * 입실하실 방의 번호: 1
 * 1호실에 입실하셨습니다
 * 1.입실 2.퇴실 3.보기 4.종료 : 1
 * 입실하실 방의 번호: 1
 * 1호실은 사용중 입니다.
 * 1.입실 2.퇴실 3.보기 4.종료 : 2
 * 퇴실하실 방의 번호: 2
 * 2호실은 빈방입니다.
 * 1.입실 2.퇴실 3.보기 4.종료: 3
 * 1호실 - 사용중
 * 2호실 - 빈방
 * 3호실 - 빈방
 * 1.입실 2.퇴실 3.보이 4.종료: 2
 * 퇴실하실 방의 번호: 1
 * 1호실에서 퇴실하셨습니다.
 * 1.입실 2.퇴실 3.보기 4.종료: 4
 * 프로그램을 종료합니다
 */
//import java.util.*;
//public class Exam_05 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//
//		System.out.print("방의 갯수: ");
//		int roomSu = in.nextInt(); // 방 갯수
//		String room[] = new String[roomSu]; // 방 상태
//		
//		for(int i=0; i<roomSu; i++) { // 방 초기값 설정
//			room[i] = "빈방"; // room[0] = "빈방" ...
//		}
//		
//		while(true) {
//			System.out.print("1.입실 2.퇴실 3.보기 4.종료: ");
//			int select = in.nextInt(); // 선택지
//
//			switch(select) { // 선택지에 대하여
//			case 1: // 1번 고르면
//				System.out.println("입실하실 방의 번호: ");
//				int choice = in.nextInt(); // 방 번호를 고르면
//				if(room[choice-1] == "사용중") { // 사용중이면
//					System.out.println(choice + "호실은 사용중입니다.");
//				}else if(room[choice-1] == "빈방") { // 빈방이면
//					room[choice-1] = "사용중"; // 사용중으로 변경
//					System.out.println(choice + "호실에 입실하셨습니다.");
//				}
//				break;
//
//			case 2:
//				System.out.print("퇴실하실 방의 번호: ");
//				int choice_2 = in.nextInt();
//				if(room[choice_2-1] == "빈방") { // 빈방이면
//					System.out.println(choice_2 + "호실은 빈방입니다.");
//				}else { // 사용중이면
//					room[choice_2-1] = "빈방"; // 빈방으로 변경
//					System.out.println(choice_2 + "호실에서 퇴실하셨습니다.");
//				}
//				break;
//			case 3:
//				for(int i = 0; i<roomSu; ++i) {
//					System.out.println(i+1 + "호실: " + room[i]);
//				}
//				break;
//			case 4:
//				System.out.println("프로그램을 종료합니다.");
//				System.exit(0);
//				
//			default :
//				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//			}
//			
//		}

import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("방의 갯수를 입력 : ");
		int roomSu = in.nextInt();
		boolean[] room = new boolean[roomSu];
		//false는 빈방, true는 사용중
		
		while(true) {
			System.out.print("1.입실  2.퇴실  3.보기  4.종료 : ");
			int select = in.nextInt();
			int roomNum;
			switch(select) {
			case 1 :
				do {
					System.out.print("입실하실 방의 번호 : ");
					roomNum = in.nextInt();
				}while(roomNum<1 || roomNum>roomSu);
				if (room[roomNum-1]) {
					System.out.println(roomNum+"호실은 사용중입니다.");
				}else {
					room[roomNum-1] = true;
					System.out.println(roomNum+"호실에 입실하셨습니다.");
				}
				break;
			case 2 :
				do {
					System.out.print("퇴실하실 방의 번호 : ");
					roomNum = in.nextInt();
				}while(roomNum<1 || roomNum>roomSu);
				if (room[roomNum-1]) {
					room[roomNum-1] = false;
					System.out.println(roomNum+"호실에서 퇴실하셨습니다.");
				}else {
					System.out.println(roomNum+"호실은 빈방입니다.");
				}
				break;
			case 3 :
				for(int i=0; i<roomSu; ++i) {
					if (room[i]) {
						System.out.printf("%d호실 - 사용중", i+1);
					}else {
						System.out.printf("%d호실 = 빈방", i+1);
					}
				}
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default :
				System.out.println("잘못입력하셨습니다. 다시입력해주세요");
			}
		}
	}

		

	}

