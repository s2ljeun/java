package member;
import java.util.*;

public class MemberMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		MemberPro pro = new MemberProImpl();
		while(true) {
			System.out.print("1.�Է�  2.���  3.����  4.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	pro.insert(); break;
			case 2 :	pro.view(); break;
			case 3 :	pro.delete(); break;
			case 4 :	pro.exit(); break;
			default :	System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}
