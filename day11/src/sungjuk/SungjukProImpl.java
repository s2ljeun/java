package sungjuk;
import java.util.*;

public class SungjukProImpl implements SungjukPro{
	Scanner in;
	Hashtable ht;

	public SungjukProImpl() {
		in = new Scanner(System.in);
		ht = new Hashtable();
	}
	
	protected int input(String sub) {
		System.out.print(sub+"������ �Է� : ");
		int score = in.nextInt();
		if (score<0 || score>100) {
			System.out.println(sub+"������ 0������ 100�� ���̰��� �Է�!!");
			return input(sub);
		}else {
			return score;
		}
	}
	
	@Override
	public void insert() {
		while(true) {
			System.out.print("�̸��� �Է� : ");
			String name = in.next();
			if (ht.containsKey(name)) {
				System.out.println(name+"���� �����մϴ�. �ٽ� �Է��� �ּ���!!");
			}else {
				int kor = input("����");
				int eng = input("����");
				Student insert = new Student(name, kor, eng);
				ht.put(name, insert);
				return;
			}
		}
		
	}
	
	protected void rank() {
		for(Enumeration i = ht.keys(); i.hasMoreElements(); ) {
			Object objI = i.nextElement();
			String keyI = (String)objI;
			Student rankI = (Student)ht.get(keyI);
			rankI.clearRank();
			for(Enumeration j = ht.keys(); j.hasMoreElements(); ) {
				Object objJ = j.nextElement();
				String keyJ = (String)objJ;
				Student rankJ = (Student)ht.get(keyJ);
				if (rankI.getTot() < rankJ.getTot()) {
					rankI.plusRank();
				}
			}
		}
	}
	
	@Override
	public void view() {
		rank();
		Enumeration enu = ht.keys();
		while(enu.hasMoreElements()) {
			Object obj = enu.nextElement();
			String key = (String)obj;
			Student view = (Student)ht.get(key);
			view.disp();
		}
	}

	@Override
	public void delete() {
		System.out.print("������ �л��� �̸��� �Է� : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name+"���� �����Ͽ����ϴ�.");
		}else {
			System.out.println(name+"���� ���� �л��� �ƴմϴ�.");
		}
	}

	@Override
	public void edit() {
		System.out.print("������ �л��� �̸��� �Է� : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			Student edit = (Student)ht.get(name);
			System.out.println(name+"���� ���� ���������� " + edit.getKor() +"�� �Դϴ�.");
			int kor = input("������ ����");
			System.out.println(name+"���� ���� ���������� " + edit.getEng() +"�� �Դϴ�.");
			int eng = input("������ ����");
			edit.setKor(kor);
			edit.setKor(eng);
			edit.setTot();
			System.out.println(name+"���� ������ �����Ͽ����ϴ�.");
		}else {
			System.out.println(name+"���� ���� �л��� �ƴմϴ�.");
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

}
