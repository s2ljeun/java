class Member02{
	private String name;
	private String tel;
	public Member02(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public void disp() {
		System.out.println(name+"���� ��ȭ��ȣ�� " + tel +"�� �Դϴ�.");
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		Member02 mb = new Member02("ȫ�浿", "123-1234");
		mb.disp();
	}
}
