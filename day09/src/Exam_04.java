/*
 * �ο����� �Է¹ް� �̸�, ��ȭ��ȣ, �ּҸ� �Է¹޾� ��½����ִ� ���α׷� / Member04 Ŭ������ ��ӹ޾�
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
	public void setTel(String tel) {//setter �޼ҵ�
		this.tel = tel;
	}
	public String getTel() {		//getter �޼ҵ�
		return tel;
	}
	public void disp() {
		System.out.println(name+"���� ��ȭ��ȣ�� " + tel +"�� �Դϴ�.");
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
		System.out.println(getName() + "���� ��ȭ��ȣ�� " + getTel() 
									+ "���̰�, �ּҴ� " + addr + "�Դϴ�.");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ο����� �Է� : ");
		int inwon = in.nextInt();
		
		Member004[] mb = new Member004[inwon];
		for(int i=0; i<inwon; ++i) {
			System.out.print("�̸��� �Է� : ");
			String name = in.next();
			System.out.print("��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			System.out.print("�ּҸ� �Է� : ");
			String addr = in.next();
			mb[i] = new Member004(name, tel, addr);
		}
		
		for(int i=0; i<inwon; ++i) {
			mb[i].disp();
		}
	}
}









