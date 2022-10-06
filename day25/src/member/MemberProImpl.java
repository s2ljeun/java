package member;
import java.util.*;

public class MemberProImpl implements MemberPro {
	MemberDAO dao;
	Scanner in;
	
	public MemberProImpl() {
		dao = new MemberDAO();
		in = new Scanner(System.in);
	}
	
	@Override
	public void insert() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		System.out.print("��ȭ��ȣ�� �Է� : ");
		String tel = in.next();
		Member insert = new Member();
		insert.setName(name);
		insert.setTel(tel);
		int res = dao.insertMember(insert);
		if (res>0) {
			System.out.println(name+"���� �߰��Ͽ����ϴ�.");
		}else {
			System.out.println(name+"���� �߰��ϴµ� �����Ͽ����ϴ�.");
		}
	}

	@Override
	public void view() {
		List<Member> list = dao.listMember();
		for(Member mb : list) {
			System.out.println(mb.getName() +"\t\t" + mb.getTel());
		}
	}

	@Override
	public void delete() {
		System.out.print("������ ȸ���� �̸��� �Է� : ");
		String name = in.next();
		int res = dao.deleteMember(name);
		if (res>0) {
			System.out.println(name+"���� �����Ͽ����ϴ�.");
		}else {
			System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);

	}

}
