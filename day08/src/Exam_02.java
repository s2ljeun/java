class Member02{
	private String name;
	private String tel;
	public Member02(String name, String tel) {
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
public class Exam_02 {
	public static void main(String[] args) {
		Member02 mb = new Member02("홍길동", "123-1234");
		mb.disp();
	}
}
