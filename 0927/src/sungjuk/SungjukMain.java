package sungjuk;

import java.util.*;

public class SungjukMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		SungjukPro pro = new SungjukProImpl();
		while(true) {
			System.out.print("1.�Է�  2.���");
			int select = in.nextInt();
			switch(select) {
			case 1 :	pro.insert(); break;
			case 2 :	pro.view(); break;
			default :	System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}
