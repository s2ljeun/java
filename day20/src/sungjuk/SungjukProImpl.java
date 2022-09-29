package sungjuk;

import java.io.*;
import java.util.*;

public class SungjukProImpl implements SungjukPro {
	ArrayList<Student> hs;
	Scanner in;
	File dir, data;
	
	public SungjukProImpl(){
		hs = new ArrayList<>();
		in = new Scanner(System.in);
		dir = new File("G:\\jieun\\study\\day20\\src\\sungjuk");
		data = new File(dir, "data.txt");
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
			System.out.print("�̸��� �Է� : ");
			name = in.next();
		}while(isStudent(name) != null);
		int kor = input("����");
		int eng = input("����");
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

	@Override
	public void delete() {
		System.out.print("������ �л��� �̸��� �Է� : ");
		String name = in.next();
		Student delete = isStudent(name);
		if (delete == null) {
			System.out.println(name+"���� ����� �л��� �ƴմϴ�.");
		}else {
			hs.remove(delete);
			System.out.println(name+"�л��� �����Ͽ����ϴ�.");
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

	@Override
	public void save() throws IOException {
		FileWriter fw = new FileWriter(data);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		for(Student st : hs) {
			pw.println(st.getName()+"             @            "+st.getKor()+"@"+st.getEng());
			pw.flush(); // ���۸޸��� ������ ���Ͽ� �ۼ�
		}
		pw.close();// �ۼ��Ϸ�
	}
	// ���� for�� ���ƴ�..

	@Override
	public void load() throws IOException {
		hs.clear(); // ���� �ڷ� ��� �����
		
		FileReader fr = new FileReader(data);
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String str = br.readLine();
			if (str == null) break; // readLine()�� ���� ������ break
			Scanner sc = new Scanner(str).useDelimiter("\\s*@\\s*");
			//���� \\s* ��� �ϸ� @�� �߽����� @�տ� ������ 0���̻�, �ڿ� ������ 0���̻�
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			Student st = new Student(name, kor, eng);
			hs.add(st);
		}
		System.out.println("���� ���ε� ��!!");
		
	}

}
