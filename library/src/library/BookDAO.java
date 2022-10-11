package library;

import java.sql.*;
import java.util.*;

public class BookDAO { //Data Access Object, CRUD�� ó���ϴ� Ŭ����
	private Connection con;
	private PreparedStatement ps; //(����)������ ���ۿ� ��ü ����
	private ResultSet rs; //�������� select�� �� �� ����� �ޱ� ���� Ŭ����
	
	String url, user, pass;
	
	public BookDAO() { //������
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //db Ŭ���� ã��
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		user = "bigdata02";
		pass = "bigdata02";
	}
	
	//���� �߰�
	public int insertBook(Book bk) { //db���� �������� int�� ���
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "insert into libBook values(book_seq.nextval, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			//�� ����
			ps.setString(1, bk.getTitle());
			ps.setString(2, bk.getAuthor());
			ps.setString(3, bk.getPub());
			ps.setBoolean(4, false);
			
			int res = ps.executeUpdate();
			return res; //������ ����
		}catch(SQLException e) {
			System.err.println("insert �޼ҵ� ���� �� ���� �߻�!!");
			e.printStackTrace();
		}finally { //db�ݱ�
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch(SQLException e) {}
		}
		return 0;
	}
	
	//���� ã�� - ����
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
			System.err.println("list �޼ҵ� ���� �� ���� �߻�!!");
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
	
	//���� ã�� - ������ȣ
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
				System.err.println("list �޼ҵ� ���� �� ���� �߻�!!");
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
	
	//���� ����
		public int deleteBook(int num) {
			try {
				con = DriverManager.getConnection(url, user, pass);
				String sql = "delete from libBook where no = ?";
				ps = con.prepareStatement(sql);
				//�� ����
				ps.setInt(1, num);
				
				int res = ps.executeUpdate();
				return res;
			}catch(SQLException e) {
				System.err.println("delete �޼ҵ� ���� �� ���� �߻�!!");
				e.printStackTrace();
			}finally {
				try {
					if (ps != null) ps.close();
					if (con != null) con.close();
				}catch(SQLException e) {}
			}
			return 0;
		}
		
	//���� �뿩, �ݳ�
	public int checkBook(Book bk) {
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "update libBook set ch = ? where no = ?";
			ps = con.prepareStatement(sql);
			//�� ����
			ps.setBoolean(1, !bk.isChekOut()); // �ݴ밪
			ps.setInt(2, bk.getNo());
			int res = ps.executeUpdate();
			return res; //������ ����
		}catch(SQLException e) {
			System.err.println("checkBook �޼ҵ� ���� �� ���� �߻�!!");
			e.printStackTrace();
		}finally { //db�ݱ�
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch(SQLException e) {}
		}
		return 0;
	}

	
	}
