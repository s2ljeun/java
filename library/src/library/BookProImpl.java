package library;

import java.util.*;

public class BookProImpl implements BookPro{
	BookDAO dao;	
	
	public BookProImpl() {
		dao = new BookDAO();
	}

	@Override
	public int insert(Book bk) {
		Book insert = bk; //¹Þ¾Æ¿Â ºÏ °´Ã¼
		insert.setTitle(bk.getTitle());
		insert.setAuthor(bk.getAuthor());
		insert.setPub(bk.getPub());
		int res = dao.insertBook(bk);
		return res;
	}

	@Override
	public List<Book> search(String searchWord) {
		List<Book> list = dao.searchBook(searchWord);
		return list;
	}

	@Override
	public ArrayList<Book> view() {
		ArrayList<Book> list = new ArrayList<>();
		for(Book bk : list) {
			list.add(bk);
		}
		return list;
		
	}

	@Override
	public int delete(int num) {
		int res = dao.deleteBook(num);
		return res;
	}

	@Override
	public int check(Book bk) {
		int res = dao.checkBook(bk);
		return res;
	}


}
