final class A03{}

public class Exam_03 {
	public static void main(String[] args) {
		String str = "Hello, java!!";
		String str2 = "Hello, python!!";
		String str3 = str + str2;//str.concat(str2);
		System.out.println(str3);
		
		//StringBuffer sb = new StringBuffer(str3);
		//String클래스의 값을 수정하지 못하는데 그 수정을 하게 도와주는 클래스
		StringBuilder sb = new StringBuilder(str3);
		//StringBuiler는 단일스레드에 사용
		sb.delete(7, 11);
		sb.insert(7, "JAVA");
		str3 = new String(sb);
		System.out.println("수정후 : " + str3);
		/*
		String str = "hello, java!!";
		System.out.println(str.toUpperCase());
		String str2 = "HELLO, JAVA!!";
		System.out.println(str2.toLowerCase());
		/*
		
		/*
		String addr = "                서울 강북구               ";
		System.out.println(addr.trim().equals("서울 강북구"));
		//trim() : 문자열 앞과 뒤의 불필요한 공백을 제거
		
		/*
		int price = 1000000;
		String p = String.valueOf(price);//문자열로 바꾸어 주는 메소드

		/*
		String str = "Hello, JAVA!! Hello, python!!";
		//String java = str.substring(7);//index위치부터 끝까지...
		String java = str.substring(7, 11);//7번째자리부터 10번째자리까지
		System.out.println(java);
		*/

		//		String str = "Hello, JAVA";
////		String java = str.substring(7); // index위치부터 끝까지
//		String java = str.substring(7,11); // 전자index 위치부터 후자 위치까지
//		System.out.print(java);
		
		
//		byte[] by = str.getBytes(); //문자열을  byte배열로 바꿀 때 사용
//		for (int i=0; i<by.length; ++i) {
//			System.out.println(by[i]);
//		}
//		String str2 = new String(by); //바이트 배열값으로 문자열을 생성
//		System.out.print(str2);

//		char ch = str.charAt(0); //str문자열에 index 해당하는 문자를 char으로 반환
//		System.out.println(ch);
//		System.out.println(str.length()); // 문자열의 길이 반환
//		
//		for(int i=0; i<str.length(); ++i) {
//			System.out.println(str.charAt(i));
//		}
		
		
//		String p = "1000000";
//		double p1 = Double.parseDouble(p); // 문자열을 double로 바꿀 때 사용
//		int p1 = Integer.parseInt(p); // 문자열을 int로 바꿀 때 사용
//		System.out.println("p1 = " + p1*1.1);
//		String a = new String("aaa");

//		String b = "aaa"; // 이 방식으로도 만들 수 있으나 new가 없으므로 힙이 아닌 상수부에 들어간다.
//		String c = "aaa";
//		System.out.println(b==c); // b가 가리키는 주소값과 c가 가리키는 주소값이 같은가 -> 상수부 주소가 같으므로 true
//		System.out.println(a.equals(b)); // a의 data와 b의 data를 비교하여 같으면 true 틀리면 false
//
//		b = "bbb";
	}

}
