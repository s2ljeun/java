class A01 { //extends Object�� ������
	
}

public class Exam_01 {
	public static void main(String[] args) {
		A01 ap = new A01();
		System.out.println("ap.getClass= " + ap.getClass());
		System.out.println("ap.toString= " + ap.toString());
		System.out.println("ap = "+ap);
		
		String name = "ȫ�浿";
		System.out.println(name.toString()); //String�� ����� ���� toString�� ������ ���̴�.
		
		String a = new String("aaa"); // a.toString = b.toString but ���� �ּҰ��� �ٸ�
		String b = new String("aaa");
		if (a.equals(b)) { // ���ڿ��� �񱳴� equals�� ���ؼ� ���Ѵ� / a==b �ϸ� �ٸ� ���ڿ��� ����.
			System.out.println("���� ���ڿ�");
		}else {
			System.out.println("�ٸ� ���ڿ�");
		}
	}

}
