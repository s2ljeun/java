import java.sql.*;

public class Exam_02 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Referenced Libraries���� �ش� Ŭ������ ã��
		}catch(ClassNotFoundException e) { // ã�� Ŭ������ ���� ���
			System.err.println("����̹� �˻� ����!!");
		}
		
		Connection con = null; // ����̹� Ŭ���� ����
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata02", "bigdata02"); // ����Ŭdb ���� ��ġ, ���̵�, ��й�ȣ
		}catch(SQLException e) { // ���� exception
			System.out.println(e.getMessage());
		}
		
		PreparedStatement ps = null; // (����)������ ����
		try {
			String sql = "insert into testMember values(test_seq.nextval, ?,?,?)"; // ���� ���� - �̿ϼ� ���·� ������
			ps = con.prepareStatement(sql);
			ps.setString(1, "���缮");
			ps.setString(2, "123-1234");
			ps.setString(3, "you@it.ac");
			int res = ps.executeUpdate();
			//insert, delete, update�� ����� ���ڷ� ���´�. ���� ���� �޼ҵ�� executeUpdate()�̸�,
			//����� int������ �޴´�. oracle db cmdâ���� '1' ���� ����Ǿ����ϴ�... �� ����� int�� ���´�.

			if (res>0) { // ����� 1 �̻��̸� (����������)
				System.out.println("���缮���� �߰��Ͽ����ϴ�.");
			}else {
				System.out.println("���缮���� �߰����� ���߽��ϴ�.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
	}
