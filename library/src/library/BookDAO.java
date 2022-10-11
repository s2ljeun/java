package library;

import java.sql.*;
import java.util.*;

public class BookDAO { //Data Access Object, CRUD를 처리하는 클래스
	private Connection con;
	private PreparedStatement ps; //(동적)쿼리문 전송용 객체 선언
	private ResultSet rs; //쿼리문이 select일 때 그 결과를 받기 위한 클래스
	
	String url, user, pass;
	
	public BookDAO() { //생성자
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //db 클래스 찾기
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		user = "bigdata02";
		pass = "bigdata02";
	}
	
	//도서 추가
	public int insertBook(Book bk) { //db에서 실행결과는 int로 출력
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "insert into libBook values(book_seq.nextval, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			//값 세팅
			ps.setString(1, bk.getTitle());
			ps.setString(2, bk.getAuthor());
			ps.setString(3, bk.getPub());
			ps.setBoolean(4, false);
			
			int res = ps.executeUpdate();
			return res; //실행결과 리턴
		}catch(SQLException e) {
			System.err.println("insert 메소드 실행 중 오류 발생!!");
			e.printStackTrace();
		}finally { //db닫기
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch(SQLException e) {}
		}
		return 0;
	}
	
	//도서 찾기 - 제목
	public List<Book> searchBook(String searchWord){
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "select * from libBook where title like ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "%" + searchWord + "%");
			rs = ps.executeQuery();
			List<Book> list = new ArrayList<>();
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String pub = rs.getString("pub");
				Boolean ch = rs.getBoolean("ch");
				Book bk = new Book(no, title, author, pub, ch);
				list.add(bk);
			}
			return list;
		}catch(SQLException e) {
			System.err.println("list 메소드 실행 중 오류 발생!!");
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) rs.close();
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch(SQLException e) {}
		}
		return null;
	}
	
	//도서 찾기 - 도서번호
		public Book searchBook(int num){
			try {
				con = DriverManager.getConnection(url, user, pass);
				String sql = "select * from libBook where no = ?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, num);
				rs = ps.executeQuery();

				while(rs.next()) {
				int no = rs.getInt("no");
				Boolean ch = rs.getBoolean("ch");
				Book bk = new Book(no, ch);
				return bk;
				}
				
			}catch(SQLException e) {
				System.err.println("list 메소드 실행 중 오류 발생!!");
				e.printStackTrace();
			}finally {
				try {
					if (rs != null) rs.close();
					if (ps != null) ps.close();
					if (con != null) con.close();
				}catch(SQLException e) {}
			}
			return null;
		}
	
	//도서 삭제
		public int deleteBook(int num) {
			try {
				con = DriverManager.getConnection(url, user, pass);
				String sql = "delete from libBook where no = ?";
				ps = con.prepareStatement(sql);
				//값 세팅
				ps.setInt(1, num);
				
				int res = ps.executeUpdate();
				return res;
			}catch(SQLException e) {
				System.err.println("delete 메소드 실행 중 오류 발생!!");
				e.printStackTrace();
			}finally {
				try {
					if (ps != null) ps.close();
					if (con != null) con.close();
				}catch(SQLException e) {}
			}
			return 0;
		}
		
	//도서 대여, 반납
	public int checkBook(Book bk) {
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "update libBook set ch = ? where no = ?";
			ps = con.prepareStatement(sql);
			//값 세팅
			ps.setBoolean(1, !bk.isChekOut()); // 반대값
			ps.setInt(2, bk.getNo());
			int res = ps.executeUpdate();
			return res; //실행결과 리턴
		}catch(SQLException e) {
			System.err.println("checkBook 메소드 실행 중 오류 발생!!");
			e.printStackTrace();
		}finally { //db닫기
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch(SQLException e) {}
		}
		return 0;
	}

	
	}
