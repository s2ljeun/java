import java.util.*;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�⵵�� �Է�: ");
		int year = in.nextInt();
		System.out.print("���� �Է�: ");
		int month = in.nextInt();
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month-1, 1);
		System.out.println("�⵵: " + cal.get(Calendar.YEAR));
		System.out.println("��: " + month);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.print("��\t��\tȭ\t��\t��\t��\t��\n");
		
		for(int i=1; i<week; ++i) { //ó�� ��¥ ���� ���� ���
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
