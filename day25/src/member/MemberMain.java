package member;
import java.util.*;

public class MemberMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		MemberPro pro = new MemberProImpl();
		while(true) {
			System.out.print("1.입력  2.출력  3.삭제  4.종료 : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	pro.insert(); break;
			case 2 :	pro.view(); break;
			case 3 :	pro.delete(); break;
			case 4 :	pro.exit(); break;
			default :	System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
