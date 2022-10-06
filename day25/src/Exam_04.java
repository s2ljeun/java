import java.util.Scanner;
import java.sql.*;

// db를 이용해서 만들어주세요
// create table java_member
// (name varchar2(20),
// tel varchar2(15));
// 1.입력 2.출력 3.삭제 4.종료 :

public class Exam_04 {
	public static void main(String[] args) throws SQLException {
		Connection con = null; // 드라이버 클래스 연결
		PreparedStatement ps = null; // (동적)쿼리문 전송용 객체 선언
		ResultSet rs = null; //쿼리문이 select일 때 그 결과를 받기 위한 클래스
		Scanner in = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Referenced Libraries에서 해당 클래스를 찾기
		}catch(ClassNotFoundException e) { // 찾는 클래스가 없을 경우
			System.err.println("드라이버 검색 실패!!");
		}
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata02", "bigdata02"); // 오라클db 접근 위치, 아이디, 비밀번호
		
		while(true) {
			System.out.print("1.입력 2.출력 3.삭제 4.종료: ");
			switch(in.nextInt()) {
			case 1: {
				System.out.print("이름: ");
				String name = in.next();
				System.out.print("전화번호: ");
				String tel = in.next();
				
				String sql = "insert into java_member values(?,?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, tel);
				
				int res = ps.executeUpdate();
				
				if (res>0) { // 결과가 1 이상이면 (성공했으면)
					System.out.println(name + "님을 추가하였습니다.");
				}else {
					System.out.println(name + "님을 추가하지 못했습니다.");
				}
				break;
			}
			case 2: {
				String sql = "select * from java_member";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				
				System.out.println("이름\t전화번호\n");
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
				System.out.print("이름: ");
				String name = in.next();
				
				String sql = "delete from java_member where name=?";
				ps = con.prepareStatement(sql);
				ps.setString(1, name);
				
				int res = ps.executeUpdate();
				if (res>0) { // 결과가 1 이상이면 (성공했으면)
					System.out.println(name + "님을 삭제하였습니다.");
				}else {
					System.out.println(name + "님을 삭제하지 못했습니다.");
				}
				break;
			}
			case 4: System.exit(0);		
			default: System.out.println("다시 입력해주세요.");
			}
		}
	}
}
