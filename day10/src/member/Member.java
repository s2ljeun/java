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
		System.out.printf("%s님의 전화번호는 %s번 입니다.\n", name, tel);
	}
	
	public int compareTo(Member o) {
		return name.compareTo(o.getName()); //오름차순
		//o.getName().compareTo(name) - 내림차순
	}
}









