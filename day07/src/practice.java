import java.io.*;
import java.util.Scanner;

class Lotto{
	int com[];
	int you[];

	Lotto(){
		com = new int[6];
		you = new int[6];
		setComsu();
	}
	
	void setComsu() {
		for(int i=0; i<6; ++i) {
			com[i] = (int)(Math.random *45) + 1;
			for(int j=0; j<i; ++j) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	void viewComsu() {
		System.out.print("컴퓨터 수: ");
		for(int i=0; i<5; ++i) {
			System.out.print(com[i] + ", ");
		}
		System.out.println(com[5]);
	}
	
	void auto() {
		for (int i=0; i<6; ++i) {
			you[i] = (int)(Math.random()*45) +1;
			for(int j=0; j<i; ++j) {
				if (you[i] == you[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	void select() {
		Scanner in = new Scanner(System.in);
		for(int i=0; i<6; ++i) {
			do {
				System.out.print(i+1+"번째 수를 입력: ");
				you[i] = in.nextInt();
			}while(you[i]<1 || you[i]>45);
			
			for(int j=0; j<i; ++j) {
				if(you[i] == you[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	void exit() {
		viewComsu();
		System.exit(0);
	}
	
	void countNum() {
		int count = 0;
		for(int i=0; i<6; ++i) {
			for(int j=0; j<6; ++j) {
				if (com[i] == you[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("맞춘갯수: " + count);
	}
}

public class practice {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		while(true) {
			int select = inputNum();
			switch(select) {
			case 1: lotto.auto(); break;
			case 2: lotto.select(); break;
			case 3: lotto.exit();
			}
			lotto.countNum();
		}
	}
	
	public static int inputNum() throws IOException{
		while(true) {
			System.out.print("1.자동 2.수동 3.종료: ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			if (select>=1 && select<=3) return select;
			System.out.println("잘못입력.");
		}
	}
}
