package baseball;

import java.util.Scanner;

public class BaseballMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		BaseballPro pro = new BaseballProImpl();
		while(true) {
			System.out.print("1.�Է�  2.Ʈ���̵�  3.����  4.����  5.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	pro.insert(); break;
			case 3 :	pro.view(); break;
			case 4 :	pro.delete(); break;
			case 2 :	pro.trade(); break;
			case 5 :	pro.exit(); break;
			default :	System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}
