import java.util.*;

class Member{
	String name;
	String tel;
	Member(String name, String tel){ //������
		this.name = name;
		this.tel = tel;
	}
	void disp() {
		System.out.println(name+"���� ��ȭ��ȣ : " + tel);
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ο����� �Է� : ");
		int inwon = in.nextInt();
		
		Member mb[] = new Member[inwon];
		//Ŭ���� �迭 : ���� ������ ����, ������ ��ü���� ���� ������ ���ش�
		for(int i=0; i<inwon; ++i) {
			System.out.print("�̸��� �Է� : ");
			String name = in.next();
			System.out.print("��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			mb[i] = new Member(name, tel);//�迭�� �� ��Һ� ��ü�� ���� �����Ѵ�
		}
		
		for(int i=0; i<inwon; ++i) {
			mb[i].disp();
		}
	}
}














