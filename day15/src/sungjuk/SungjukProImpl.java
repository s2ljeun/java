package sungjuk;

import java.util.*;

public class SungjukProImpl implements SungjukPro {
	ArrayList<Student> list;
	Scanner in;
	
	public SungjukProImpl(){
		list = new ArrayList<>();
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
		for(Student s : list) {
			if (s.getName().equals(name)) {
				return s;
			}
		}
		return null;
	}
	
	@Override
	public void insert(Student st) {
		list.add(st);
	}

	protected void rank() {
		for (Student rank : list) {
			rank.clearRank();
			for(Student rank2 : list) {
				if (rank.getTot() < rank2.getTot()) {
					rank.plusRank();
				}
			}
		}
		/*
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
		*/
	}
	
	@Override
	public ArrayList<Student> view() {
		rank();
		return list;
	}
	
	protected Comparator<Student> getComparator(int select){
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (select==2) return o2.getKor() - o2.getKor();
				else if (select==3) return o2.getEng() - o2.getEng(); 
				else return o2.getTot() - o1.getTot();
			}
		};
		return comparator;
	}
	
	@Override
	public void delete() {
		System.out.print("삭제할 학생의 이름을 입력 : ");
		String name = in.next();
		Student delete = isStudent(name);
		if (delete == null) {
			System.out.println(name+"님은 저희반 학생이 아닙니다.");
		}else {
			list.remove(delete);
			System.out.println(name+"학생을 삭제하였습니다.");
		}
	}

	@Override
	public void edit() {
		System.out.print("수정할 학생의 이름을 입력 : ");
		String name = in.next();
		Student edit = isStudent(name);
		if (edit == null) {
			System.out.println(name+"님은 저희반 학생이 아닙니다.");
		}else {
			int kor = input("수정할 국어");
			int eng = input("수정할 영어");
			edit.setKor(kor);
			edit.setEng(eng);
			edit.setTot();
			System.out.println(name+"학생을 수정하였습니다.");
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
