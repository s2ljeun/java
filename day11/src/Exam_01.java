import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		//HashSet�� ������ ���, HashSet�� 16���� �����͸� �⺻, Hashtable�� 11���� �⺻
		//loadfactor���� �Ѵ� 0.75f�̸�
		
		ht.put("���缮", "���׸�");
		//key, value ������ �����͸� �ֱ�
		//�̶� key���� �ߺ��� �ȵȴ�. �ߺ����� �Է��ϸ� ������ �ȴ�.
		ht.put("������", "����");
		ht.put("����ȿ", "���");
		ht.put("������", "�߱�����");
		ht.put("�迬��", "�豸����");
		
		if(ht.containsKey("���缮1")) {
			System.out.println("���缮1�� ������ " + ht.get("���缮1"));
		}
		
		Enumeration enu = ht.keys();
		//ht.keySet() - SetŸ������ Key���� ��ȯ
		//ht.elements() - value�� ���� �� ���
		while(enu.hasMoreElements()) { //it.hasNext()��ɰ� ����
			Object obj = enu.nextElement(); //it.next()��ɰ� ����
			String key = (String)obj;
			System.out.println(key + "���� ������ " + ht.get(key));
			
		}
		
		//ũ��: ht.size()
		System.out.println("�������� ũ��: " + ht.size());
		//�����: ��ü ht.clear(), ��� ht.remove(key)
		//������ ������: ht.get(key)
		System.out.println("���������� ������ " + ht.get("������"));
	}

}
