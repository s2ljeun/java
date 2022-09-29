import java.io.*;

public class Exam_01 {
	public static void main(String[] args) {
		File f1 = new File("G:\\jieun\\study\\day20\\src\\data1.txt");
		File f2 = new File("G:\\jieun\\study\\day20\\src", "data1.txt");
		File dir = new File("G:" + File.separator + "jieun" + File.separator + "study"
							+ File.separator + "day20" + File.separator + "src");
		File f3 = new File(dir, "data1.txt");

		//f1, f2, f3은 모두 하나의 파일을 가리키는 객체입니다.
		// File객체가 가리키는 곳은 추상경로명이다. - 파일이 존재할 필요가 없다.
		
		System.out.println("File.separator = " + File.separator);
		// 폴더구별자, window : \\, linux: /
		// os별로 다르므로 java에서는 File.separator로 써라
		System.out.println("File.separatorChar = " + File.separatorChar);
		// char형으로 받고싶으면 char 붙이면 된다
		System.out.println("File.pathSeparator = " + File.pathSeparator);
		// 패스구별자, window: ;, linux: :
		// 마찬가지로 os별로 다르므로...
		System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
	}
}
