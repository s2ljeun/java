package member;
import java.sql.*;
import java.util.*;

public class MemberDAO {	//Data Access Object, CRUD를 처리하는 클래스
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	String url, user, pass;
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		user = "bigdata01";
		pass = "bigdata01";
	}

	public int insertMember(Member mb) {
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "insert into java_member values(?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, mb.getName());
			ps.setString(2, mb.getTel());
			int res = ps.executeUpdate();
			return res;
		}catch(SQLException e) {
			System.err.println("insert 메소드 실행 중 오류 발생!!");
			e.printStackTrace();
		}finally {
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch(SQLException e) {}
		}
		return 0;
	}
	
	public int deleteMember(String name) {
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "delete from java_member where name = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
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
	
	public List<Member> listMember(){
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "select * from java_member";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			List<Member> list = new ArrayList<>();
			while(rs.next()) {
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				Member mb = new Member();
				mb.setName(name);
				mb.setTel(tel);
				list.add(mb);
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
}









