import java.io.*;

public class Exam_09{
	public static void main(String[] args) throws IOException {
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data3.txt");
	
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			if (str == null) break; // readLine()에서의 EoF값은 null이다.
			System.out.println(str);
		}
	
	}

}
