//SQL> insert into testMember values
//(test_seq.nextval, 'aaa','123-1234','aaa@aa.aa');
package library;

import java.sql.*;
import java.util.*;

public class MemberDAO { //Data Access Object, CRUD를 처리하는 클래스
	private Connection con;
	private PreparedStatement ps; //(동적)쿼리문 전송용 객체 선언
	private ResultSet rs; //쿼리문이 select일 때 그 결과를 받기 위한 클래스
	
	String url, user, pass;
	
	public MemberDAO() { //생성자
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //db 클래스 찾기
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		user = "bigdata02";
		pass = "bigdata02";
	}
	
	//멤버 추가
	public int insertMember(Member mb) { //db에서 실행결과는 int로 출력
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "insert into libMember values(member_seq.nextval, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			//값 세팅
			ps.setString(1, mb.getName());
			ps.setString(2, mb.getId());
			ps.setString(3, mb.getPw());
			ps.setString(4, mb.getTel());
			
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
	
	//멤버 찾기
	public int searchMember(Member mb) {
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "select * from libMember where id=? and pw=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, mb.getId());
			ps.setString(2, mb.getPw());

			rs = ps.executeQuery(); // ResultSet 타입으로 반환
			if(rs.next()) { // id, pw 모두 일치하는 결과가 존재하면
				int res = 1;
				return res;
			}
		}catch(SQLException e) {
			System.err.println("search 메소드 실행 중 오류 발생!!");
			e.printStackTrace();
		}finally { //db닫기
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
				if (rs != null) rs.close();
			}catch(SQLException e) {}
		}
		return 0;
	}
	
	//멤버 찾기 - id
	public Member searchMember(String str) {
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "select * from libMember where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, str);

			rs = ps.executeQuery();
			if(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String pw = rs.getString("pw");
				String tel = rs.getString("tel");
				Member mb = new Member(id, name, pw, tel);
				return mb;
			}
		}catch(SQLException e) {
			System.err.println("search 메소드 실행 중 오류 발생!!");
			e.printStackTrace();
		}finally { //db닫기
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
				if (rs != null) rs.close();
			}catch(SQLException e) {}
		}
		return null;
	}
	
	

}
