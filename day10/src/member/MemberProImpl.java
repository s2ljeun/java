package member;
import java.util.*;

public class MemberProImpl implements MemberPro {
	HashSet hs;
	Scanner in;
	
	public MemberProImpl() {
		hs = new HashSet();
		in = new Scanner(System.in);
	}
	
	@Override
	public void insert() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		System.out.print("��ȭ��ȣ�� �Է� : ");
		String tel = in.next();
		Member insert = new Member(name, tel);
		hs.add(insert);
	}

	@Override
	public void view() {
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member view = (Member)obj;
			view.disp();
		}
	}

	@Override
	public void delete() {
		System.out.print("������ ȸ���� �̸��� �Է� : ");
		String name = in.next();
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member delete = (Member)obj;
			if (name.equals(delete.getName())) {
				hs.remove(delete);
				System.out.println(name+"���� �����Ͽ����ϴ�.");
				return;
			}
		}
		System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
	}

	@Override
	public void edit() {
		System.out.print("������ ȸ���� �̸��� �Է� : ");
		String name = in.next();
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member edit = (Member)obj;
			if (name.equals(edit.getName())) {
				System.out.println(name+"���� ���� ��ȭ��ȣ�� " + edit.getTel()+"�� �Դϴ�.");
				System.out.print("�����Ͻ� ��ȣ�� �Է� : ");
				String tel = in.next();
				edit.setTel(tel);
				System.out.println(name+"���� ��ȭ��ȣ�� �����Ͽ����ϴ�.");
				return;
			}
		}
		System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");

	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);

	}

}
