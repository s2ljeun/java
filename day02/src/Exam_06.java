
public class Exam_06 {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		System.out.println("�ȳ��ϼ��� " + name + "��, �ݰ����ϴ�.");
		int a = 10;
		int b = 3;
		System.out.println("�μ��� ��: " + a + b);
		System.out.println("�μ��� ��: " + (a + b)); // �켱���� ����
		
		System.out.println(a/b); // int / int => int �ڵ�����ȯ
		System.out.println(a/(float)b); // int / float => float ���� �ϳ��� ��������ȯ
		System.out.println((float)(a/b)); // float(int / int) => float �̹� ���� ���� ��������ȯ
	}

}