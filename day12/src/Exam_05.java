import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		String data = new String("유재석,김종국,하하,지석진,송지효");
		StringTokenizer st = new StringTokenizer(data, ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		/*
		String[] member = data.split(",");
		for(int i=0; i<member.length; ++i) {
			System.out.println(member[i]);
		}
		/*
		 String input = "1 fish 2 fish red           fish blue            fish";
	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();
	     */
	}
}
