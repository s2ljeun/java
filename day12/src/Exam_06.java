import java.util.*;
import java.text.*;

public class Exam_06 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 0, 1);
		System.out.println("cal = " + cal);
		System.out.println("�⵵ : " + cal.get(Calendar.YEAR));
		System.out.println("�� : " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("���� : " + cal.get(Calendar.DAY_OF_WEEK));
		//cal.set(Calendar.MONTH, 1);
		//cal.set(Calendar.YEAR, 2020);
		
		System.out.println("�̴��� ������ �� : " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		/*
		Date date = new Date();
		System.out.println("date = " + date);
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		//y - year, 2���� 4���� �Ἥ ��Ÿ��
		//M - ��, m - ��
		//d - ��������, D - �������
		//H - 0~23��, h - 1~12
		//s - ��, S - �и�������(1/1000��)
		System.out.println("����ð� : " + sdf.format(date));
		System.out.println("���� �� : " + date.getHours());
		*/
	}
}











