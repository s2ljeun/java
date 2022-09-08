import java.util.*;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("문자열을 입력 : ");
		String str = in.nextLine();
		int[] alpha = new int[26];
		
		for(int i=0; i<str.length(); ++i) {
			char ch = str.charAt(i);
			if (ch>='A' && ch<='Z') {
				alpha[ch-'A']++;
			}else if (ch>='a' && ch<='z') {
				alpha[ch-'a']++;
			}
		}
		
		for(int i=0; i<alpha.length; ++i) {
			if (alpha[i] == 0) continue;
			System.out.printf("%c -> %d\n", (char)(65+i), alpha[i]);
		}
	}
}











