class A08{
	String name;
	String addr;
	int a, b, c, d, e;
	A08(){
		a = 10;
		b = 20;
		c = 30;
		d = 40;
		e = 50;
		name = "ȫ�浿";
		addr = "���� ���ϱ�";
	}
	A08(String name){
		this();
		this.name = name;
	}
	A08(String name, String addr){
		this(name);//default ������ ȣ��, �ݵ�� �������� ù��° �ٿ� �־�� �Ѵ�
		//this.name = name;//����ʵ��� �Ű��������� ������, ����ʵ��� �˷��ֱ����� this�� ������
		//����ʵ峪 ����޼ҵ带 ����Ҷ��� this�� ������ ������ �ϴµ� �̸� �����ؼ� �� �� �ִ�.
		this.addr = addr;
	}
	void disp() {
		System.out.println(this.name+"���� �ּҴ� " + this.addr);
	}
	void disp2() {
		disp();
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		A08 bp = new A08();
		A08 ap = new A08("ȫ�浿", "���� ���ϱ�"); // ap�� A08()�� ������: ��ü�� �����Ѵ� / new������ = �����޸��Ҵ翬���ڷ� ���� ����
		//ap.name = "ȫ�浿"; // ���ÿ� ap�� ����, ���� ����ʵ尪�� ����
		//ap.addr = "���� ���ϱ�";
		ap = new A08("��ȣ��", "���� ������");
		//ap.A08("aaa", "aaaa");
		ap.disp();
	}
}	

