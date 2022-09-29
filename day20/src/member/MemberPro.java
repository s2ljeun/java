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
	// 부모에 예외전가가 없으면 자식은 예외전가를 만들 수 없다.
	// 부모의 예외전가는 반드시 자식이 만들어야 하는 건 아니다. -> 보통 따라 적음.
}
