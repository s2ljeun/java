import java.util.*;
class Student{
	private String name; //��ü���� ���� / ��������(s.kor=)���ΰ��� �Ժη� �ٲٴ� ���� ���� setter, getter�� ��������(s.setKor=)�� ����Ͽ� ���� ��ȣ
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
		System.out.println(name+"���� ������ " + tot +"���̰�, ������ " + rank +"�� �Դϴ�.");
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ο����� �Է� : ");
		int inwon = in.nextInt();
		Student[] st = new Student[inwon];
		
		//�Է�
		for(int i=0; i<inwon; ++i) {
			System.out.print("�̸��� �Է� : ");
			String name = in.next();
			int kor = input("����");
			int eng = input("����");
			st[i] = new Student(name, kor, eng);
		}
		
		//�������
		for(int i=0; i<inwon; ++i) {
			st[i].clearRank();
			for(int j=0; j<inwon; ++j) {
				if (st[i].getTot() < st[j].getTot()) {
					st[i].plusRank();
				}
			}
		}
		
		//���
		for(int i=0; i<inwon; ++i) {
			st[i].disp();
		}
	}
	public static int input(String sub) {
		Scanner in = new Scanner(System.in);
		System.out.print(sub+"������ �Է� : ");
		int score = in.nextInt();
		if (score<0 || score>100) {
			System.out.println(sub+"������ 0������ 100�� ���� ���� �Է��ϼž� �մϴ�.");
			input(sub);
		}
		
		return score;
	}
}





