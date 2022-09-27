package sungjuk;

import java.util.*;

public class SungjukMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		SungjukPro pro = new SungjukProImpl();
		while(true) {
			System.out.print("1.입력  2.출력");
			int select = in.nextInt();
			switch(select) {
			case 1 :	pro.insert(); break;
			case 2 :	pro.view(); break;
			default :	System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
