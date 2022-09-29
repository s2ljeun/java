// gui���� PromImpl�� ȣ���ϴµ�, ���⼭ public/private...�Ű� �� ����
// �����͸� ó���ص� �Ǵ� �ǰ�??����;; -> ���Ⱑ ������ ó���ϴ� ���Դϴ�...�������������ñ⸦
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

	@Override
	public void save(){
		try {
			FileOutputStream fos = new FileOutputStream(data);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeObject(list);
			oos.close();
		}catch(Exception e) { //�ƿ� ���� ó���� ���ָ� throws�� ���������� �� ���൵ �ȴ�... -> ��� ���ܵ��� exception�� ��ӹ޾ұ� ������ ���ļ� ó�� ����
			e.printStackTrace();
			//System.out.print("���ܸ޼���" + e.getMessage()); < �̷��� ���� ����.
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
