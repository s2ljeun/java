package member;
import java.util.*;

public class MemberProImpl implements MemberPro {
	ArrayList<Member> list;
	
	public MemberProImpl() {
		list = new ArrayList<>();
	}
	
	@Override
	public void insert(Member mb) {
		list.add(mb);
	}

	@Override
	public ArrayList<Member> view() {
		Collections.sort(list);
		return list;
	}

	@Override
	public boolean delete(String name) {
		for(Member delete : list) {
			if (name.trim().equals(delete.getName())) {
				list.remove(delete);
				return true;
			}
		}
		return false;
	}
	
	public Member isMember(String name) {
		for(Member m : list) {
			if (m.getName().equals(name)) {
				return m;
			}
		}
		return null;
	}

	@Override
	public void edit() {
		
	}

	@Override
	public void exit() {

	}

}
