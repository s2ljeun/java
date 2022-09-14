package member;

public class Member implements Comparable<Member> {
	private String name;
	private String tel;
	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTel() {
		return tel;
	}
	public void disp() {
		System.out.printf("%s���� ��ȭ��ȣ�� %s�� �Դϴ�.\n", name, tel);
	}
	
	public int compareTo(Member o) {
		return name.compareTo(o.getName()); //��������
		//o.getName().compareTo(name) - ��������
	}
}









