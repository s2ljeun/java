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
		System.out.print(sub+"������ �Է� : ");
		int score = sc.nextInt();
		if (score<0 || score>100) {
			System.out.println(sub+"������ 0������ 100�� ���� ���� �Է��ϼž� �մϴ�.");
			input(sub);
		}
		return score;
	}
	
	public Student isStudent(String name) {
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
	}
	
	@Override
	public ArrayList<Student> view(int i) {
		rank();
		if (i==0) Collections.sort(list);
		else Collections.sort(list, getComparator(i));
		return list;
	}
	
	protected Comparator<Student> getComparator(int select){
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (select==1) return o2.getKor() - o1.getKor();
				else if (select==2) return o2.getEng() - o1.getEng(); 
				else return o2.getTot() - o1.getTot();
			}
		};
		return comparator;
	}
	
	@Override
	public String delete(String name) {
		Student delete = isStudent(name);
		if (delete == null) {
			return name+"���� ����� �л��� �ƴմϴ�.";
		}else {
			list.remove(delete);
			return name+"�л��� �����Ͽ����ϴ�.";
		}
	}

	@Override
	public void edit() {
		System.out.print("������ �л��� �̸��� �Է� : ");
		String name = in.next();
		Student edit = isStudent(name);
		if (edit == null) {
			System.out.println(name+"���� ����� �л��� �ƴմϴ�.");
		}else {
			int kor = input("������ ����");
			int eng = input("������ ����");
			edit.setKor(kor);
			edit.setEng(eng);
			edit.setTot();
			System.out.println(name+"�л��� �����Ͽ����ϴ�.");
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

}
