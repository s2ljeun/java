final class A03{}

public class Exam_03 {
	public static void main(String[] args) {
		String str = "Hello, java!!";
		String str2 = "Hello, python!!";
		String str3 = str + str2;//str.concat(str2);
		System.out.println(str3);
		
		//StringBuffer sb = new StringBuffer(str3);
		//StringŬ������ ���� �������� ���ϴµ� �� ������ �ϰ� �����ִ� Ŭ����
		StringBuilder sb = new StringBuilder(str3);
		//StringBuiler�� ���Ͻ����忡 ���
		sb.delete(7, 11);
		sb.insert(7, "JAVA");
		str3 = new String(sb);
		System.out.println("������ : " + str3);
		/*
		String str = "hello, java!!";
		System.out.println(str.toUpperCase());
		String str2 = "HELLO, JAVA!!";
		System.out.println(str2.toLowerCase());
		/*
		
		/*
		String addr = "                ���� ���ϱ�               ";
		System.out.println(addr.trim().equals("���� ���ϱ�"));
		//trim() : ���ڿ� �հ� ���� ���ʿ��� ������ ����
		
		/*
		int price = 1000000;
		String p = String.valueOf(price);//���ڿ��� �ٲپ� �ִ� �޼ҵ�

		/*
		String str = "Hello, JAVA!! Hello, python!!";
		//String java = str.substring(7);//index��ġ���� ������...
		String java = str.substring(7, 11);//7��°�ڸ����� 10��°�ڸ�����
		System.out.println(java);
		*/

		//		String str = "Hello, JAVA";
////		String java = str.substring(7); // index��ġ���� ������
//		String java = str.substring(7,11); // ����index ��ġ���� ���� ��ġ����
//		System.out.print(java);
		
		
//		byte[] by = str.getBytes(); //���ڿ���  byte�迭�� �ٲ� �� ���
//		for (int i=0; i<by.length; ++i) {
//			System.out.println(by[i]);
//		}
//		String str2 = new String(by); //����Ʈ �迭������ ���ڿ��� ����
//		System.out.print(str2);

//		char ch = str.charAt(0); //str���ڿ��� index �ش��ϴ� ���ڸ� char���� ��ȯ
//		System.out.println(ch);
//		System.out.println(str.length()); // ���ڿ��� ���� ��ȯ
//		
//		for(int i=0; i<str.length(); ++i) {
//			System.out.println(str.charAt(i));
//		}
		
		
//		String p = "1000000";
//		double p1 = Double.parseDouble(p); // ���ڿ��� double�� �ٲ� �� ���
//		int p1 = Integer.parseInt(p); // ���ڿ��� int�� �ٲ� �� ���
//		System.out.println("p1 = " + p1*1.1);
//		String a = new String("aaa");

//		String b = "aaa"; // �� ������ε� ���� �� ������ new�� �����Ƿ� ���� �ƴ� ����ο� ����.
//		String c = "aaa";
//		System.out.println(b==c); // b�� ����Ű�� �ּҰ��� c�� ����Ű�� �ּҰ��� ������ -> ����� �ּҰ� �����Ƿ� true
//		System.out.println(a.equals(b)); // a�� data�� b�� data�� ���Ͽ� ������ true Ʋ���� false
//
//		b = "bbb";
	}

}
