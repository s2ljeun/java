import java.sql.*;

public class Exam_03 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Referenced Libraries���� �ش� Ŭ������ ã��
		}catch(ClassNotFoundException e) { // ã�� Ŭ������ ���� ���
			System.err.println("����̹� �˻� ����!!");
		}
		
		Connection con = null; // ����̹� Ŭ���� ����
		PreparedStatement ps = null; // (����)������ ���ۿ� ��ü ����
		ResultSet rs = null; //�������� select�� �� �� ����� �ޱ� ���� Ŭ����
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata02", "bigdata02"); // ����Ŭdb ���� ��ġ, ���̵�, ��й�ȣ
			String sql = "select * from testMember";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			//select�� ���� ����޼ҵ尡 executeQuery�̴� -> ResultSet Ÿ������ ��ȯ��
			
			System.out.println("��ȣ\t�̸�\t����\t�̸���\n");
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				//String name = rs.getString(2);
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				System.out.println(no+"\t"+name+"\t"+tel+"\t"+email);
			}
			
		}catch(SQLException e) { // ���� exception
			e.printStackTrace();
		}
		
	}
}
