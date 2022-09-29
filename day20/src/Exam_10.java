import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_10 {
	public static void main(String[] args) {
		String str = "���缮@����@������@������@����ȿ";
		
		// ���ڿ� ������
		// 3. Scanner �̿�
		// ����� ������(str)�� ���� �ڷ������� �Ǿ� �ְ�, �� �������� ������ �̹� �ȴٰ� �Ѵٸ�...
		Scanner sc = new Scanner(str).useDelimiter("\\s*@\\s*"); // ��ȣ���� ���� \\s* ��� �ϸ� @�� �߽����� @�տ� ������ 0�� �̻�, �ڿ� ������ 0�� �̻� -> '@�߽� �յڷ� �������� ���� �����ּ���'
		while(true) {
			try { // �� �̻� ���� ������ �� ��Ÿ���� ������ �߹Ƿ� try catch ���� �߰�
				System.out.println(sc.next());
			} catch(NoSuchElementException e) {
				break;
			}
		}
		
		// 2. StringTokenizer() / OLD but '����Ŭ����'�̴�. ������ ������� ���� �޾ƿͼ� ����ؾ� �� �� �ִ�. + List vector
		StringTokenizer st = new StringTokenizer(str, "@");
		while(st.hasMoreTokens()) { // �ݺ��� ���� �Ͱ� �Ȱ��� (?)
			String name = (String)st.nextToken();
			System.out.println(name);
		}
		
		
		// 1. split()
		String[] name = str.split("@"); // String �迭�� �����, ��ȣ �ȿ��� ���� �ֱ�
		for(int i=0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		
	}
}
