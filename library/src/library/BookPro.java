package library;
import java.util.*;

public interface BookPro {
	public int insert(Book bk);
	public int delete(int num);
	public int check(Book bk);
	public List<Book> search(String title);
	public ArrayList<Book> view();
}
