/*
 * 3사람의 이름과 전화번호를 입력받고 출력시켜주는 프로그램
 * 1번째 사람 이름 aaa 1번째 사람 저화번호:1234 / bbb 2222 / ccc 4567
 * aaa님의 전화번호는 1234
 * 
 */
import java.util.*;
public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name[] = new String[3];
		String phone[] = new String[3];
		
		for(int i=0; i<name.length; ++i) { // 이름과 번호 입력받아 저장 , name 배열의 크기만큼 반복
			System.out.print(i+1 + "번째 사람 이름");
			name[i] = in.next();
			System.out.print(i+1 + "번째 사람 전화번호");
			phone[i] = in.next();
		}
		for(int i=0; i<name.length; ++i) { // 출력, name 배열의 크기만큼 반복
			System.out.println(name[i] + "님의 전화번호: " + phone[i]);
		}
	}

}
