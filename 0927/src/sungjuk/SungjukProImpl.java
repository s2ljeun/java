package sungjuk;

import java.util.*;

public class SungjukProImpl implements SungjukPro {
	HashSet hs;
	Scanner in;
	
	public SungjukProImpl(){
		hs = new HashSet();
		in = new Scanner(System.in);
	}
	
	protected int input(String sub) {
		Scanner sc = new Scanner(System.in);
		System.out.print(sub+"점수를 입력 : ");
		int score = sc.nextInt();
		if (score<0 || score>100) {
			System.out.println(sub+"점수는 0점에서 100점 사이 값만 입력하셔야 합니다.");
			input(sub);
		}
		return score;
	}
	
	protected Student isStudent(String name) {
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Student s = (Student)obj;
			if (s.getName().equals(name)) {
				return s;
			}
		}
		return null;
	}
	
	@Override
	public void insert() {
		String name;
		do {
			System.out.print("이름을 입력 : ");
			name = in.next();
		}while(isStudent(name) != null);
		int kor = input("국어");
		int eng = input("영어");
		Student insert = new Student(name, kor, eng);
		hs.add(insert);
	}

	protected void rank() {
		Student[] rank = new Student[hs.size()];
		hs.toArray(rank);
		for(int i=0; i<rank.length; ++i) {
			rank[i].clearRank();
			for(int j=0; j<rank.length; ++j) {
				if (rank[i].getTot() < rank[j].getTot()) {
					rank[i].plusRank();
				}
			}
		}
	}
	
	@Override
	public void view() {
		rank();
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Student view = (Student)obj;
			view.disp();
		}
	}

}
