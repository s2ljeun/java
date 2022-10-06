import java.sql.*;

public class Exam_03 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Referenced Libraries에서 해당 클래스를 찾기
		}catch(ClassNotFoundException e) { // 찾는 클래스가 없을 경우
			System.err.println("드라이버 검색 실패!!");
		}
		
		Connection con = null; // 드라이버 클래스 연결
		PreparedStatement ps = null; // (동적)쿼리문 전송용 객체 선언
		ResultSet rs = null; //쿼리문이 select일 때 그 결과를 받기 위한 클래스
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata02", "bigdata02"); // 오라클db 접근 위치, 아이디, 비밀번호
			String sql = "select * from testMember";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			//select일 때는 실행메소드가 executeQuery이다 -> ResultSet 타입으로 반환됨
			
			System.out.println("번호\t이름\t전번\t이메일\n");
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				//String name = rs.getString(2);
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				System.out.println(no+"\t"+name+"\t"+tel+"\t"+email);
			}
			
		}catch(SQLException e) { // 통합 exception
			e.printStackTrace();
		}
		
	}
}
