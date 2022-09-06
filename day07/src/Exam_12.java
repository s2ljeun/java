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
	void setComsu() {//컴퓨터수를 셋팅
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
	
	void viewComsu() {//컴퓨터를 출력
		System.out.print("컴퓨터 수 : ");
		for(int i=0; i<5; ++i) {
			System.out.print(com[i] + ", ");
		}
		System.out.println(com[5]);
	}
	void auto() {	//자동입력
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
	void select() {	//수동입력
		Scanner in = new Scanner(System.in);
		for(int i=0; i<6; ++i) {
			do {
				System.out.print(i+1+"번째 수를 입력 : ");
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
	void exit() {	//종료시 실행
		viewComsu();
		System.exit(0);
	}
	void countNum() {//컴퓨터와 사용자 수를 비교하여 몇개 맞추었는지 알려주는 메소드
		int count = 0;
		for(int i=0; i<6; ++i) {
			for(int j=0; j<6; ++j) {
				if (com[i] == you[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("맞춘갯수 : " + count);
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
			System.out.print("1.자동  2.수동  3.종료 : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			if (select>=1 && select<=3) return select;
			System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
		}
	}
}
