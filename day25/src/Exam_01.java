import java.sql.*;

public class Exam_01 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //�̷� ����̺갡 ������ jvm�� �÷���
			System.out.println("����̹� ��ġ ����!!");
		}catch(ClassNotFoundException e) {
			System.err.println("����̹� ��ġ ����!!");
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata02", "bigdata02");
			System.out.println("����Ŭ ���� ����!!");
		}catch(SQLException e) {
			System.err.println("����Ŭ ���� ����!!");
		}
	}
}
