import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		HashSet hs2 = new HashSet(1000000); //�ʱ�뷮 ����
		HashSet hs3 = new HashSet(1000000, 0.999f); //���ϰ��� ���� (0.75 -> 0.999)
		
		hs.add("���缮"); //������ �ֱ�
		hs.add("������");
		hs.add("������");
		hs.add("����");
		hs.add("�缼��");
		hs.add("����ȿ");
		hs.add("���ҹ�");

		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String name = (String)obj;
			System.out.println("name = " + name);
		}
		// �ڹٿ��� �ݺ��� �������̽�
		// Iterator
		//	- hasNext(): �����Ͱ� �����ϸ� true ���ϸ� false
		//	- next(): ���������ͷ� �̵�
		
//		String[] obj = new String[hs.size()]; // �迭 ���� ��
//		hs.toArray(obj); // hs�� ���� ���� �迭�� �ѱ��
//		
//		for(int i=0; i<obj.length; ++i) {
//			System.out.println(obj[i]);
//		}
		
//		System.out.println("���׸� ��� ��: " + hs.size());
//		
//		hs.clear();
//		if (hs.isEmpty()) { // hs�� ����ִ�? size()�� 0�̴�?
//			System.out.print("�����Ͱ� �����ϴ�");
//		}
////		System.out.print("Ŭ���� �� ��� ��:" + hs.size());
	}
}
