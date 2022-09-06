import java.util.*;
class Student{
	private String name; //객체지향 언어에서 / 직접접근(s.kor=)으로값을 함부로 바꾸는 것을 막고 setter, getter로 간접접근(s.setKor=)만 허용하여 값을 보호
	private int kor;
	private int eng;
	private int tot;
	private int rank;
	
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		setTot();
	}
	
	public String getName() {
		return name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}	
	public void setTot() {
		tot = kor + eng;
	}
	public int getTot() {
		return tot;
	}
	public int getRank() {
		return rank;
	}
	
	public void clearRank() {
		rank = 1;
	}
	public void plusRank() {
		rank++;
	}
	public void disp() {
		System.out.println(name+"님의 총점은 " + tot +"점이고, 순위는 " + rank +"등 입니다.");
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("인원수를 입력 : ");
		int inwon = in.nextInt();
		Student[] st = new Student[inwon];
		
		//입력
		for(int i=0; i<inwon; ++i) {
			System.out.print("이름을 입력 : ");
			String name = in.next();
			int kor = input("국어");
			int eng = input("영어");
			st[i] = new Student(name, kor, eng);
		}
		
		//순위계산
		for(int i=0; i<inwon; ++i) {
			st[i].clearRank();
			for(int j=0; j<inwon; ++j) {
				if (st[i].getTot() < st[j].getTot()) {
					st[i].plusRank();
				}
			}
		}
		
		//출력
		for(int i=0; i<inwon; ++i) {
			st[i].disp();
		}
	}
	public static int input(String sub) {
		Scanner in = new Scanner(System.in);
		System.out.print(sub+"점수를 입력 : ");
		int score = in.nextInt();
		if (score<0 || score>100) {
			System.out.println(sub+"점수는 0점에서 100점 사이 값만 입력하셔야 합니다.");
			input(sub);
		}
		
		return score;
	}
}





