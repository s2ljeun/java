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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		
		if (ht.containsKey(name)) {
			System.out.println(name+"님은 이미 존재합니다. 다시 입력해 주세요!!");
			insert();
		}else {
			System.out.print("전화번호를 입력 : ");
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
		System.out.print("삭제할 회원의 이름: ");
		String name = in.next();
		if(ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name + "님을 삭제하였습니다." );
		} else {
			System.out.println(name + "님은 저희 회원이 아닙니다.");
		}
	}

	@Override
	public void edit() {
		System.out.print("수정할 회원의 이름: ");
		String name = in.next();
		if(ht.containsKey(name)) {
			Member edit = (Member)ht.get(name);
			System.out.println(name + "님의 현재 전화번호는" + edit.getTel() + "번 입니다." );
			System.out.print("수정하실 번호를 입력: ");
			edit.setTel(in.next());
			System.out.println(name + "님의 전화번호를 수정하였습니다.");
		} else {
			System.out.println(name + "님은 저희 회원이 아닙니다.");
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);

	}

}
