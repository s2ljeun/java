import java.util.*;

/*
 * 1.�Է� 2.��� 3.���� 4.���� 5.����:
 * �Է½� �̸��� ��ȭ��ȣ�� �Է¹޾� �����Ѵ�
 * ��½� �Էµ� ��� �ڷḦ ��½����ؤ���
 * ������ �̸��� �� �� ���ش��ϴ°��� ��ȭ��ȣ�� �����Ѥ�
 * �������̸��� �Է¹޾� �ش��ϴ� ȸ���� ����
 * ����� ���α׷��� �����ī
 */
public class Exam_06 {
	Scanner in = new Scanner(System.in);
	HashSet hs = new HashSet();
	Iterator it = hs.iterator();
	
	int select = in.nextInt();
	String name;
	int tel;
	
	switch(select) {
	case 1: {
		System.out.print("�̸��� �Է�: ");
		name = in.next();
		hs.add(name);
		System.out.print("��ȣ�� �Է�: ");
		tel = in.nextInt();
		hs.add(tel);
		break;
	}
	case 2: {
		while(it.hasNext()) {
			System.out.println("�̸�: " + name + "��ȣ: " + tel);
		}
		break;
	}
	case 3:
	case 4:
	case 5:
	}

}
