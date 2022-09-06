import java.io.*;
import java.util.*;

class Lotto{
	int com[];
	int you[];
	Lotto(){
		com = new int[6];
		you = new int[6];
		setComsu();
	}
	void setComsu() {//��ǻ�ͼ��� ����
		for(int i=0; i<6; ++i) {
			com[i] = (int)(Math.random()*45) + 1;
			for(int j=0; j<i; ++j) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	void viewComsu() {//��ǻ�͸� ���
		System.out.print("��ǻ�� �� : ");
		for(int i=0; i<5; ++i) {
			System.out.print(com[i] + ", ");
		}
		System.out.println(com[5]);
	}
	void auto() {	//�ڵ��Է�
		for(int i=0; i<6; ++i) {
			you[i] = (int)(Math.random()*45) + 1;
			for(int j=0; j<i; ++j) {
				if (you[i] == you[j]) {
					i--;
					break;
				}
			}
		}
	}
	void select() {	//�����Է�
		Scanner in = new Scanner(System.in);
		for(int i=0; i<6; ++i) {
			do {
				System.out.print(i+1+"��° ���� �Է� : ");
				you[i] = in.nextInt();
			}while(you[i]<1 || you[i]>45);
			for(int j=0; j<i; ++j) {
				if (you[i] == you[j]) {
					i--;
					break;
				}
			}
		}
	}
	void exit() {	//����� ����
		viewComsu();
		System.exit(0);
	}
	void countNum() {//��ǻ�Ϳ� ����� ���� ���Ͽ� � ���߾����� �˷��ִ� �޼ҵ�
		int count = 0;
		for(int i=0; i<6; ++i) {
			for(int j=0; j<6; ++j) {
				if (com[i] == you[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("���᰹�� : " + count);
	}
}
public class Exam_12 {
	public static void main(String[] args) throws IOException {
		Lotto lotto = new Lotto();
		while(true) {
			int select = inputNum();
			switch(select) {
			case 1 :	lotto.auto(); break;
			case 2 :	lotto.select(); break;
			case 3 :	lotto.exit(); 
			}
			lotto.countNum();
		}
	}
	public static int inputNum() throws IOException {
		while(true) {
			System.out.print("1.�ڵ�  2.����  3.���� : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			if (select>=1 && select<=3) return select;
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
		}
	}
}
