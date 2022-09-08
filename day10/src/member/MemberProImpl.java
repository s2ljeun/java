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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		System.out.print("전화번호를 입력 : ");
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
		System.out.print("삭제할 회원의 이름을 입력 : ");
		String name = in.next();
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member delete = (Member)obj;
			if (name.equals(delete.getName())) {
				hs.remove(delete);
				System.out.println(name+"님을 삭제하였습니다.");
				return;
			}
		}
		System.out.println(name+"님은 저희 회원이 아닙니다.");
	}

	@Override
	public void edit() {
		System.out.print("수정할 회원의 이름을 입력 : ");
		String name = in.next();
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member edit = (Member)obj;
			if (name.equals(edit.getName())) {
				System.out.println(name+"님의 현재 전화번호는 " + edit.getTel()+"번 입니다.");
				System.out.print("수정하실 번호를 입력 : ");
				String tel = in.next();
				edit.setTel(tel);
				System.out.println(name+"님의 전화번호를 수정하였습니다.");
				return;
			}
		}
		System.out.println(name+"님은 저희 회원이 아닙니다.");

	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);

	}

}
