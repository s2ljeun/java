import java.util.*;

public class Exam_02 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); //�� ������ Ÿ�� ���� generic <String>
		
		al.add("���缮");
		al.add("������");
		al.add("������");
		al.add(1, "����");
		al.trimToSize(); // al�� ����ִ� �����͸�ŭ ũ�⸦ �ٿ� �޸� ����(�⺻ 10������ �� �°�)
		al.remove(2);
		
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			String name = (String)obj;
			System.out.println(name);
		}
		
		for(int i=0; i<al.size(); ++i) {
			Object obj = al.get(i);
			String name = (String)obj;
			System.out.println(name);
		}
	}
}
