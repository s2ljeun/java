//libMember, libBook
//member_seq, book_seq
package library;

public class Member { // DTO: Data Transfer Object
	private int no;
	private String name;
	private String id;
	private String pw;
	private String tel;
	
	public Member(String name, String id, String pw, String tel) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
	}
	
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
