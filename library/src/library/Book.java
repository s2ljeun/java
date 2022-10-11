package library;

public class Book {
	private int no;
	private String title;
	private String author;
	private String pub;
	private boolean ch;
	
	public Book(String title, String author, String pub) {
		this.title = title;
		this.author = author;
		this.pub = pub;
	}
	
	public Book(int no, String title, String author, String pub, boolean ch) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.pub = pub;
		this.ch = ch;
	}
	
	public Book(int no, boolean ch) {
		this.no = no;
		this.ch = ch;
	}
	
	public Book(int no) {
		this.no = no;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public boolean isChekOut() {
		return ch;
	}
	public void setChekOut(boolean ch) {
		this.ch = ch;
	}

}
