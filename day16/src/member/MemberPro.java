package member;

import java.util.ArrayList;

public interface MemberPro {
	public void insert(Member mb);
	public ArrayList<Member> view();
	public boolean delete(String name);
	public void edit();
	public void exit();
}
