package library;

import java.util.*;
import javax.swing.*;

public class MemberProImpl implements MemberPro {
	MemberDAO dao;
	Scanner in;
	
	public MemberProImpl() {
		dao = new MemberDAO();
	}

	@Override
	public int insert(Member mb) {
		Member insert = mb; // insert = �޾ƿ� �����ü
		insert.setName(mb.getName());
		insert.setId(mb.getId());
		insert.setPw(mb.getPw());
		insert.setTel(mb.getTel());
		int res = dao.insertMember(insert); // dao��  insertMember�޼ҵ忡 insert(�ϼ��� Member��ü)�ֱ�
		return res;
	}
	
	@Override
	public int search(Member mb) {
		Member search = mb; // search = �޾ƿ� �����ü //id, pw
		search.setId(mb.getId());
		search.setPw(mb.getPw());
		int res = dao.searchMember(search);
		return res;
	}

	@Override
	public Member view(String id) {
		Member view = dao.searchMember(id);
		return view;
	}
	

}
