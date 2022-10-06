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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		System.out.print("전화번호를 입력 : ");
		String tel = in.next();
		Member insert = new Member();
		insert.setName(name);
		insert.setTel(tel);
		int res = dao.insertMember(insert);
		if (res>0) {
			System.out.println(name+"님을 추가하였습니다.");
		}else {
			System.out.println(name+"님을 추가하는데 실패하였습니다.");
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
		System.out.print("삭제할 회원의 이름을 입력 : ");
		String name = in.next();
		int res = dao.deleteMember(name);
		if (res>0) {
			System.out.println(name+"님을 삭제하였습니다.");
		}else {
			System.out.println(name+"님은 저희 회원이 아닙니다.");
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);

	}

}
