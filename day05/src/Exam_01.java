/*
 * 5����� ���������� �Է¹޾� 5�� ������ ��� �����ϰ� ���� �˷��ִ� ���α׷�
 */

import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		int kor[] = new int[5];
		for(int i=0; i<5; ++i) {
			System.out.print(i+1+"��° �л� ��������:");
			kor[i] = in.nextInt();
			sum += kor[i];
		}
		for(int j=0; j<5; ++j) {
			System.out.print(kor[j] + "\t");
		}
		System.out.println("��: " + sum);
	}

}
