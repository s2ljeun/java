import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		//HashSet과 생성자 비슷, HashSet은 16개의 데이터를 기본, Hashtable은 11개를 기본
		//loadfactor값은 둘다 0.75f이며
		
		ht.put("유재석", "개그맨");
		//key, value 값으로 데이터를 넣기
		//이때 key값은 중복이 안된다. 중복으로 입력하면 수정이 된다.
		ht.put("김종국", "가수");
		ht.put("송지효", "배우");
		ht.put("류현진", "야구선수");
		ht.put("김연경", "배구선수");
		
		if(ht.containsKey("유재석1")) {
			System.out.println("유재석1의 직업은 " + ht.get("유재석1"));
		}
		
		Enumeration enu = ht.keys();
		//ht.keySet() - Set타입으로 Key값을 반환
		//ht.elements() - value값 꺼낼 때 사용
		while(enu.hasMoreElements()) { //it.hasNext()기능과 같다
			Object obj = enu.nextElement(); //it.next()기능과 같다
			String key = (String)obj;
			System.out.println(key + "님의 직업은 " + ht.get(key));
			
		}
		
		//크기: ht.size()
		System.out.println("데이터의 크기: " + ht.size());
		//지우기: 전체 ht.clear(), 요소 ht.remove(key)
		//데이터 꺼내기: ht.get(key)
		System.out.println("김종국님의 직업은 " + ht.get("김종국"));
	}

}
