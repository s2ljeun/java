//SQL> insert into testMember values
//(test_seq.nextval, 'aaa','123-1234','aaa@aa.aa');
package library;

import java.sql.*;
import java.util.*;

public class MemberDAO { //Data Access Object, CRUD�� ó���ϴ� Ŭ����
	private Connection con;
	private PreparedStatement ps; //(����)������ ���ۿ� ��ü ����
	private ResultSet rs; //�������� select�� �� �� ����� �ޱ� ���� Ŭ����
	
	String url, user, pass;
	
	public MemberDAO() { //������
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //db Ŭ���� ã��
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		user = "bigdata02";
		pass = "bigdata02";
	}
	
	//��� �߰�
	public int insertMember(Member mb) { //db���� �������� int�� ���
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "insert into libMember values(member_seq.nextval, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			//�� ����
			ps.setString(1, mb.getName());
			ps.setString(2, mb.getId());
			ps.setString(3, mb.getPw());
			ps.setString(4, mb.getTel());
			
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
	
	//��� ã��
	public int searchMember(Member mb) {
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "select * from libMember where id=? and pw=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, mb.getId());
			ps.setString(2, mb.getPw());

			rs = ps.executeQuery(); // ResultSet Ÿ������ ��ȯ
			if(rs.next()) { // id, pw ��� ��ġ�ϴ� ����� �����ϸ�
				int res = 1;
				return res;
			}
		}catch(SQLException e) {
			System.err.println("search �޼ҵ� ���� �� ���� �߻�!!");
			e.printStackTrace();
		}finally { //db�ݱ�
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
				if (rs != null) rs.close();
			}catch(SQLException e) {}
		}
		return 0;
	}
	
	//��� ã�� - id
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
			System.err.println("search �޼ҵ� ���� �� ���� �߻�!!");
			e.printStackTrace();
		}finally { //db�ݱ�
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
				if (rs != null) rs.close();
			}catch(SQLException e) {}
		}
		return null;
	}
	
	

}
