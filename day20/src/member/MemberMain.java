package member;
import java.util.*;
import java.io.*;
public class MemberMain {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		MemberPro pro = new MemberProImpl();
		while(true) {
			System.out.print("1.�Է�  2.���  3.����  4.����  5.����  6.�ε�  7.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	pro.insert(); break;
			case 2 :	pro.view(); break;
			case 3 :	pro.delete(); break;
			case 4 :	pro.edit(); break;
			case 7 :	pro.exit(); break;
			case 5 : 	pro.save(); break;
			case 6 : 	pro.load(); break;
			default :	System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}
