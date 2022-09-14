import java.util.*;
import java.text.*;

public class Exam_06 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 0, 1);
		System.out.println("cal = " + cal);
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("요일 : " + cal.get(Calendar.DAY_OF_WEEK));
		//cal.set(Calendar.MONTH, 1);
		//cal.set(Calendar.YEAR, 2020);
		
		System.out.println("이달의 마지막 날 : " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		/*
		Date date = new Date();
		System.out.println("date = " + date);
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		//y - year, 2개나 4개를 써서 나타냄
		//M - 월, m - 분
		//d - 월기준일, D - 년기준일
		//H - 0~23시, h - 1~12
		//s - 초, S - 밀리세컨드(1/1000초)
		System.out.println("현재시간 : " + sdf.format(date));
		System.out.println("현재 시 : " + date.getHours());
		*/
	}
}











