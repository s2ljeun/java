import java.io.*;

public class Exam_08 {
	public static void main(String[] args) throws IOException {
		File dir = new File("G:\\jieun\\study\\day20\\src");
		File file = new File(dir, "data3.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("Hello, Java!!"); // write도 있지만 print와 println을 가장 많이 사용.
		pw.print(20);
		pw.print(20.232);
		pw.close();
	}
}
