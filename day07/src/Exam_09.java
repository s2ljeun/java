import java.util.*;

class Member{
	String name;
	String tel;
	Member(String name, String tel){ //생성자
		this.name = name;
		this.tel = tel;
	}
	void disp() {
		System.out.println(name+"님의 전화번호 : " + tel);
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("인원수를 입력 : ");
		int inwon = in.nextInt();
		
		Member mb[] = new Member[inwon];
		//클래스 배열 : 먼저 갯수를 선언, 각각의 객체별로 따로 생성을 해준다
		for(int i=0; i<inwon; ++i) {
			System.out.print("이름을 입력 : ");
			String name = in.next();
			System.out.print("전화번호를 입력 : ");
			String tel = in.next();
			mb[i] = new Member(name, tel);//배열의 각 요소별 객체를 따로 생성한다
		}
		
		for(int i=0; i<inwon; ++i) {
			mb[i].disp();
		}
	}
}














