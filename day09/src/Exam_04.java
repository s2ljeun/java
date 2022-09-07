/*
 * 인원수를 입력받고 이름, 전화번호, 주소를 입력받아 출력시켜주는 프로그램 / Member04 클래스를 상속받아
 */
import java.util.*;
class Member04{
	private String name;
	private String tel;
	public Member04(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setTel(String tel) {//setter 메소드
		this.tel = tel;
	}
	public String getTel() {		//getter 메소드
		return tel;
	}
	public void disp() {
		System.out.println(name+"님의 전화번호는 " + tel +"번 입니다.");
	}
}

class Member004 extends Member04{
	private String addr;
	public Member004(String name, String tel, String addr) {
		super(name, tel);
		this.addr = addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return addr;
	}
	public void disp() {
		System.out.println(getName() + "님의 전화번호는 " + getTel() 
									+ "번이고, 주소는 " + addr + "입니다.");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("인원수를 입력 : ");
		int inwon = in.nextInt();
		
		Member004[] mb = new Member004[inwon];
		for(int i=0; i<inwon; ++i) {
			System.out.print("이름을 입력 : ");
			String name = in.next();
			System.out.print("전화번호를 입력 : ");
			String tel = in.next();
			System.out.print("주소를 입력 : ");
			String addr = in.next();
			mb[i] = new Member004(name, tel, addr);
		}
		
		for(int i=0; i<inwon; ++i) {
			mb[i].disp();
		}
	}
}









