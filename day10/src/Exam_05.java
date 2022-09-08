import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		HashSet hs2 = new HashSet(1000000); //초기용량 설정
		HashSet hs3 = new HashSet(1000000, 0.999f); //부하갯수 설정 (0.75 -> 0.999)
		
		hs.add("유재석"); //데이터 넣기
		hs.add("김종국");
		hs.add("지석진");
		hs.add("하하");
		hs.add("양세찬");
		hs.add("송지효");
		hs.add("전소민");

		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String name = (String)obj;
			System.out.println("name = " + name);
		}
		// 자바에서 반복자 인터페이스
		// Iterator
		//	- hasNext(): 데이터가 존재하면 true 안하면 false
		//	- next(): 다음데이터로 이동
		
//		String[] obj = new String[hs.size()]; // 배열 생성 후
//		hs.toArray(obj); // hs가 가진 값을 배열로 넘긴다
//		
//		for(int i=0; i<obj.length; ++i) {
//			System.out.println(obj[i]);
//		}
		
//		System.out.println("런닝맨 멤버 수: " + hs.size());
//		
//		hs.clear();
//		if (hs.isEmpty()) { // hs가 비어있니? size()가 0이니?
//			System.out.print("데이터가 없습니다");
//		}
////		System.out.print("클리어 후 멤버 수:" + hs.size());
	}
}
