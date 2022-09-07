import java.util.Scanner;

class Student{
	private String name;
	private int kor;
	private int eng;
	protected int tot;
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

class Student2 extends Student{
	private int math;
	public Student2(String name, int kor, int eng, int math) {
		super(name, kor, eng);
		this.math = math;
		setTot();
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	
	public void setTot() {
		tot = getKor() + getEng() + math;
	}
}


public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("인원수를 입력 : ");
		int inwon = in.nextInt();
		Student2[] st = new Student2[inwon];
		
		//입력
		for(int i=0; i<inwon; ++i) {
			System.out.print("이름을 입력 : ");
			String name = in.next();
			int kor = input("국어");
			int eng = input("영어");
			int math = input("수학");
			st[i] = new Student2(name, kor, eng, math);
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
		Scanner sc = new Scanner(System.in);
		System.out.print(sub+"점수를 입력 : ");
		int score = sc.nextInt();
		if (score<0 || score>100) {
			System.out.println(sub+"점수는 0점에서 100점 사이 값만 입력하셔야 합니다.");
			input(sub);
		}
		return score;
	}
}










