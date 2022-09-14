import java.util.ArrayList;

public class Exam_01 {
	public static void main(String[] args) {
		/*Wrapper
		String price = "1000000";
		int price2 = Integer.parseInt(price);
		
		Integer a = new Integer(100);
		Integer b = new Integer("100");
		if (a.equals(b)) {
			System.out.println("같은수");
		}
		int c = 100;
		if (a==c) {
			System.out.println("같은수");
		}
		*/
		int c = 100;
		Integer d = new Integer(c);//boxing
		ArrayList<Integer> list = new ArrayList<>();
		list.add(d);
		list.add(c);//Auto-boxing : 기본자료형을 자동으로 객체화시켜 저장
		
		//int e = d.intValue();//unboxing
		int e = d; 
		System.out.println("e = " + e);
		
	}
}









