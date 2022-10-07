package library;

import java.util.*;
import javax.swing.*;

public class MemberProImpl implements MemberPro {
	MemberDAO dao;
	Scanner in;
	
	public MemberProImpl() {
		dao = new MemberDAO();
		in = new Scanner(System.in);
	}

	@Override
	public int insert(Member mb) {
		Member insert = mb; // insert = ¹Þ¾Æ¿Â ¸â¹ö°´Ã¼
		insert.setName(mb.getName());
		insert.setId(mb.getId());
		insert.setPw(mb.getPw());
		insert.setTel(mb.getTel());
		int res = dao.insertMember(insert); // daoÀÇ  insertMember¸Þ¼Òµå¿¡ insert(¿Ï¼ºµÈ Member°´Ã¼)³Ö±â
		return res;
	}
	
	@Override
	public int search(Member mb) {
		Member search = mb; // search = ¹Þ¾Æ¿Â ¸â¹ö°´Ã¼ //id, pw
		search.setId(mb.getId());
		search.setPw(mb.getPw());
		int res = dao.searchMember(search);
		return res;
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}

}
