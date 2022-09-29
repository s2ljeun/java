// gui에서 PromImpl을 호출하는데, 여기서 public/private...신경 안 쓰고
// 데이터를 처리해도 되는 건가??ㅎㅎ;; -> 여기가 데이터 처리하는 곳입니다...정신을좀차리시기를
package sungjuk;

import java.io.*;
import java.util.*;

public class SungjukProImpl implements SungjukPro {
	ArrayList<Student> list;
	Scanner in;
	File dir, data;
	
	public SungjukProImpl(){
		list = new ArrayList<>();
		in = new Scanner(System.in);
		dir = new File("G:\\jieun\\study\\day21\\src\\sungjuk");
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
			return name+"님은 저희반 학생이 아닙니다.";
		}else {
			list.remove(delete);
			return name+"학생을 삭제하였습니다.";
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
	public void save(){
		try {
			FileOutputStream fos = new FileOutputStream(data);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeObject(list);
			oos.close();
		}catch(Exception e) { //아예 예외 처리를 해주면 throws로 예외전가를 안 해줘도 된다... -> 모든 예외들이 exception을 상속받았기 때문에 합쳐서 처리 가능
			e.printStackTrace();
			//System.out.print("예외메세지" + e.getMessage()); < 이렇게 많이 쓴다.
		}
		
	}

	@Override
	public void load() throws IOException, FileNotFoundException, ClassNotFoundException {
		list.clear();
		
		FileInputStream fis = new FileInputStream(data);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		try {
			list = (ArrayList)ois.readObject();
		}catch(ClassNotFoundException e) {}
		
		ois.close();
	}

}
