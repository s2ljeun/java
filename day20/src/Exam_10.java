import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_10 {
	public static void main(String[] args) {
		String str = "유재석@하하@김종국@지석진@송지효";
		
		// 문자열 나누기
		// 3. Scanner 이용
		// 저장된 데이터(str)가 여러 자료형으로 되어 있고, 그 데이터의 구성을 이미 안다고 한다면...
		Scanner sc = new Scanner(str).useDelimiter("\\s*@\\s*"); // 괄호에는 패턴 \\s* 라고 하면 @를 중심으로 @앞에 공백이 0개 이상, 뒤에 공백이 0개 이상 -> '@중심 앞뒤로 쓸데없는 공백 지워주세요'
		while(true) {
			try { // 더 이상 읽지 못했을 때 나타나는 오류가 뜨므로 try catch 구문 추가
				System.out.println(sc.next());
			} catch(NoSuchElementException e) {
				break;
			}
		}
		
		// 2. StringTokenizer() / OLD but '유산클래스'이다. 예전에 만들어진 것을 받아와서 사용해야 할 수 있다. + List vector
		StringTokenizer st = new StringTokenizer(str, "@");
		while(st.hasMoreTokens()) { // 반복자 쓰는 것과 똑같음 (?)
			String name = (String)st.nextToken();
			System.out.println(name);
		}
		
		
		// 1. split()
		String[] name = str.split("@"); // String 배열로 만들기, 괄호 안에는 패턴 넣기
		for(int i=0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		
	}
}
