package member;
import java.io.*;
public interface MemberPro {
	public void insert();
	public void view();
	public void delete();
	public void edit();
	public void exit();
	public void save() throws IOException;
	public void load() throws IOException;
	// �θ� ���������� ������ �ڽ��� ���������� ���� �� ����.
	// �θ��� ���������� �ݵ�� �ڽ��� ������ �ϴ� �� �ƴϴ�. -> ���� ���� ����.
}
