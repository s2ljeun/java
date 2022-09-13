package member;
import java.util.*;

public class MemberProImpl implements MemberPro {
	Hashtable ht;
	Scanner in;
	
	public MemberProImpl() {
		ht = new Hashtable();
		in = new Scanner(System.in);
	}
	
	@Override
	public void insert() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		
		if (ht.containsKey(name)) {
			System.out.println(name+"���� �̹� �����մϴ�. �ٽ� �Է��� �ּ���!!");
			insert();
		}else {
			System.out.print("��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			Member insert = new Member(name, tel);
			ht.put(name, insert);
		}
	}

	@Override
	public void view() {
		Enumeration enu = ht.keys();
		while(enu.hasMoreElements()) {
			Object obj = enu.nextElement();
			String key = (String)obj;
			Member view = (Member)ht.get(key);
			view.disp();
		}

	}

	@Override
	public void delete() {
		System.out.print("������ ȸ���� �̸�: ");
		String name = in.next();
		if(ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name + "���� �����Ͽ����ϴ�." );
		} else {
			System.out.println(name + "���� ���� ȸ���� �ƴմϴ�.");
		}
	}

	@Override
	public void edit() {
		System.out.print("������ ȸ���� �̸�: ");
		String name = in.next();
		if(ht.containsKey(name)) {
			Member edit = (Member)ht.get(name);
			System.out.println(name + "���� ���� ��ȭ��ȣ��" + edit.getTel() + "�� �Դϴ�." );
			System.out.print("�����Ͻ� ��ȣ�� �Է�: ");
			edit.setTel(in.next());
			System.out.println(name + "���� ��ȭ��ȣ�� �����Ͽ����ϴ�.");
		} else {
			System.out.println(name + "���� ���� ȸ���� �ƴմϴ�.");
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);

	}

}
