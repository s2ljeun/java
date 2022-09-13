import java.util.*;

public class Exam_02 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); //들어갈 데이터 타입 선언 generic <String>
		
		al.add("유재석");
		al.add("지석진");
		al.add("김종국");
		al.add(1, "하하");
		al.trimToSize(); // al의 들어있는 데이터만큼 크기를 줄여 메모리 절약(기본 10개에서 딱 맞게)
		al.remove(2);
		
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			String name = (String)obj;
			System.out.println(name);
		}
		
		for(int i=0; i<al.size(); ++i) {
			Object obj = al.get(i);
			String name = (String)obj;
			System.out.println(name);
		}
	}
}
