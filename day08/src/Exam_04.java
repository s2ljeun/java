class Bank{
	String name;
	double money;
	static float iyul;
	static {
		iyul = 0.0255f;
	}
	public Bank(String name, double money, float iyul) {
		this.name = name;
		this.money = money;
		Bank.iyul = iyul;
	}
	public void setIyul(float iyul) {
		Bank.iyul = iyul;
	}
	public void disp() {
		System.out.printf("%s님의 잔액은 %.2f원이고 적용되는 이율은 %.2f%%입니다.\n", name, money, iyul*100);
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		System.out.println("현재 우리 은행의 이율 : " + Bank.iyul*100);
		Bank aaa = new Bank("aaa", 1000.0, 0.025f);
		aaa.disp(); // Bank 객체가 윗줄에서 선언되었으므로 호출 가능
		System.out.println("-----------------");
		Bank bbb = new Bank("bbb", 1000.0, 0.03f);
		//aaa.setIyul(0.03f);
		aaa.disp();
		bbb.disp();
		System.out.println("-----------------");
		Bank ccc = new Bank("ccc", 1000.0, 0.031f);
		//aaa.setIyul(0.031f);
		aaa.disp();
		//bbb.setIyul(0.031f);
		bbb.disp();
		ccc.disp();
	}
}















