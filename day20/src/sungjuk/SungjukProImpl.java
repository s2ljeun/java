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

	@Override
	public void delete() {
		System.out.print("삭제할 학생의 이름을 입력 : ");
		String name = in.next();
		Student delete = isStudent(name);
		if (delete == null) {
			System.out.println(name+"님은 저희반 학생이 아닙니다.");
		}else {
			hs.remove(delete);
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

	@Override
	public void save() throws IOException {
		FileWriter fw = new FileWriter(data);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		for(Student st : hs) {
			pw.println(st.getName()+"             @            "+st.getKor()+"@"+st.getEng());
			pw.flush(); // 버퍼메모리의 내용을 파일에 작성
		}
		pw.close();// 작성완료
	}
	// 변형 for문 놓쳤다..

	@Override
	public void load() throws IOException {
		hs.clear(); // 기존 자료 모두 지우기
		
		FileReader fr = new FileReader(data);
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String str = br.readLine();
			if (str == null) break; // readLine()할 것이 없으면 break
			Scanner sc = new Scanner(str).useDelimiter("\\s*@\\s*");
			//패턴 \\s* 라고 하면 @를 중심으로 @앞에 공백이 0개이상, 뒤에 공백이 0개이상
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			Student st = new Student(name, kor, eng);
			hs.add(st);
		}
		System.out.println("파일 업로드 끝!!");
		
	}

}
