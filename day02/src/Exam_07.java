
public class Exam_07 {
	public static void main(String [] args) {
		// ���׿����� - ��������������
		boolean c = true;
		System.out.println(!(!c)); // true
		
		// ����������
		int a = 10;
		int b = 13;
		System.out.println(a==b & ++a>b); //1 10==13 && 11>13 a==b�� �����̹Ƿ� �ڴ� �������� �ʴ´�.
		System.out.println(a==b & ++a>b); //2 11==13 && 12>13
		System.out.println(a==b & ++a>b); //3 12==13 && 13>13
		System.out.println(a==b & ++a>b); //4 13==13 && 14>13
		
		// �������Կ�����
		byte d = 10;
		//d = (byte)(a+5);
		d += 5; // d = d + 5
		
		// ����������
		int e, f, g;
		
		//���׿�����
		int h = 10;
		System.out.println(h==10 ? "a�� 10�Դϴ�." : "a�� 10�� �ƴմϴ�.");
		
		String i = "�ȳ�";
		System.out.println(i=="�ȳ�" ? "��ȣ" : "�޷�");
		
	}
}