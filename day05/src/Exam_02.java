/*
 * 3����� �̸��� ��ȭ��ȣ�� �Է¹ް� ��½����ִ� ���α׷�
 * 1��° ��� �̸� aaa 1��° ��� ��ȭ��ȣ:1234 / bbb 2222 / ccc 4567
 * aaa���� ��ȭ��ȣ�� 1234
 * 
 */
import java.util.*;
public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name[] = new String[3];
		String phone[] = new String[3];
		
		for(int i=0; i<name.length; ++i) { // �̸��� ��ȣ �Է¹޾� ���� , name �迭�� ũ�⸸ŭ �ݺ�
			System.out.print(i+1 + "��° ��� �̸�");
			name[i] = in.next();
			System.out.print(i+1 + "��° ��� ��ȭ��ȣ");
			phone[i] = in.next();
		}
		for(int i=0; i<name.length; ++i) { // ���, name �迭�� ũ�⸸ŭ �ݺ�
			System.out.println(name[i] + "���� ��ȭ��ȣ: " + phone[i]);
		}
	}

}
