import java.util.*;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("년도를 입력: ");
		int year = in.nextInt();
		System.out.print("월을 입력: ");
		int month = in.nextInt();
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month-1, 1);
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + month);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.print("일\t월\t화\t수\t목\t금\t토\n");
		
		for(int i=1; i<week; ++i) { //처음 날짜 이전 공백 찍기
			System.out.print("\t");
		}
		
		for(int i=1; i<lastDay+1; i++) {
			System.out.print(i+"\t");
			week++;
			if(week>7) {
				System.out.println();
				week = 1;
			}
		}
	}

}
