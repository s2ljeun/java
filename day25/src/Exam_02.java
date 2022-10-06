import java.sql.*;

public class Exam_02 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Referenced Libraries에서 해당 클래스를 찾기
		}catch(ClassNotFoundException e) { // 찾는 클래스가 없을 경우
			System.err.println("드라이버 검색 실패!!");
		}
		
		Connection con = null; // 드라이버 클래스 연결
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata02", "bigdata02"); // 오라클db 접근 위치, 아이디, 비밀번호
		}catch(SQLException e) { // 통합 exception
			System.out.println(e.getMessage());
		}
		
		PreparedStatement ps = null; // (동적)쿼리문 전송
		try {
			String sql = "insert into testMember values(test_seq.nextval, ?,?,?)"; // 동적 쿼리 - 미완성 상태로 보낸다
			ps = con.prepareStatement(sql);
			ps.setString(1, "유재석");
			ps.setString(2, "123-1234");
			ps.setString(3, "you@it.ac");
			int res = ps.executeUpdate();
			//insert, delete, update의 결과는 숫자로 나온다. 따라서 실행 메소드는 executeUpdate()이며,
			//결과는 int형으로 받는다. oracle db cmd창에서 '1' 행이 변경되었습니다... 등 결과는 int만 나온다.

			if (res>0) { // 결과가 1 이상이면 (성공했으면)
				System.out.println("유재석님을 추가하였습니다.");
			}else {
				System.out.println("유재석님을 추가하지 못했습니다.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
	}
