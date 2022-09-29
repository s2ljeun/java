package sungjuk_copy;

import java.io.*;

public interface SungjukPro {
	public void insert();
	public void view();
	public void delete();
	public void edit();
	public void exit();
	public void save() throws IOException;
	public void load() throws IOException, ClassNotFoundException;
}
