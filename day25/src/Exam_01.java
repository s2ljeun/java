import java.sql.*;

public class Exam_01 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //이런 드라이브가 있으면 jvm에 올려줘
			System.out.println("드라이버 설치 성공!!");
		}catch(ClassNotFoundException e) {
			System.err.println("드라이버 설치 실패!!");
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata02", "bigdata02");
			System.out.println("오라클 연결 성공!!");
		}catch(SQLException e) {
			System.err.println("오라클 연결 실패!!");
		}
	}
}
