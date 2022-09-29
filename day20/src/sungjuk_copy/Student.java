package sungjuk_copy;

import java.io.Serializable;

public class Student implements Serializable {
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
