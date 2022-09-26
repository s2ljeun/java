package sungjuk;

import java.util.ArrayList;

public interface SungjukPro {
	public void insert(Student st);
	public ArrayList<Student> view(int i);
	public String delete(String name);
	public Student isStudent(String name);
	public void edit();
	public void exit();
}
