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

	@Override
	public void edit() {
		
	}

	@Override
	public void exit() {

	}

}
