//내 거 hs로 되어있었는데 강사님 파일은 arraylist로 바뀌어있었음 day10!!! 
package sungjuk;

import java.io.IOException;
import java.util.*;

public class SungjukMain {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		SungjukPro pro = new SungjukProImpl();
		while(true) {
			System.out.print("1.입력  2.출력  3.삭제  4.수정 5.저장 6.불러오기 7.종료 : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	pro.insert(); break;
			case 2 :	pro.view(); break;
			case 3 :	pro.delete(); break;
			case 4 :	pro.edit(); break;
			case 7 :	pro.exit(); break;
			case 5 :	pro.save(); break;
			case 6 :	pro.load(); break;
			default :	System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
