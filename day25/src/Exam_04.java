import java.util.Scanner;
import java.sql.*;

// db�� �̿��ؼ� ������ּ���
// create table java_member
// (name varchar2(20),
// tel varchar2(15));
// 1.�Է� 2.��� 3.���� 4.���� :

public class Exam_04 {
	public static void main(String[] args) throws SQLException {
		Connection con = null; // ����̹� Ŭ���� ����
		PreparedStatement ps = null; // (����)������ ���ۿ� ��ü ����
		ResultSet rs = null; //�������� select�� �� �� ����� �ޱ� ���� Ŭ����
		Scanner in = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Referenced Libraries���� �ش� Ŭ������ ã��
		}catch(ClassNotFoundException e) { // ã�� Ŭ������ ���� ���
			System.err.println("����̹� �˻� ����!!");
		}
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata02", "bigdata02"); // ����Ŭdb ���� ��ġ, ���̵�, ��й�ȣ
		
		while(true) {
			System.out.print("1.�Է� 2.��� 3.���� 4.����: ");
			switch(in.nextInt()) {
			case 1: {
				System.out.print("�̸�: ");
				String name = in.next();
				System.out.print("��ȭ��ȣ: ");
				String tel = in.next();
				
				String sql = "insert into java_member values(?,?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, tel);
				
				int res = ps.executeUpdate();
				
				if (res>0) { // ����� 1 �̻��̸� (����������)
					System.out.println(name + "���� �߰��Ͽ����ϴ�.");
				}else {
					System.out.println(name + "���� �߰����� ���߽��ϴ�.");
				}
				break;
			}
			case 2: {
				String sql = "select * from java_member";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				
				System.out.println("�̸�\t��ȭ��ȣ\n");
				System.out.println("-------------");
				while(rs.next()) {
					String name = rs.getString("name");
					String tel = rs.getString("tel");
					System.out.println(name+"\t"+tel);
				}
				System.out.println();
				break;
			}
			case 3: {
				System.out.print("�̸�: ");
				String name = in.next();
				
				String sql = "delete from java_member where name=?";
				ps = con.prepareStatement(sql);
				ps.setString(1, name);
				
				int res = ps.executeUpdate();
				if (res>0) { // ����� 1 �̻��̸� (����������)
					System.out.println(name + "���� �����Ͽ����ϴ�.");
				}else {
					System.out.println(name + "���� �������� ���߽��ϴ�.");
				}
				break;
			}
			case 4: System.exit(0);		
			default: System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}
}
