package member2;

public class Member {
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
}


