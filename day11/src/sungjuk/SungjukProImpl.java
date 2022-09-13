package sungjuk;
import java.util.*;

public class SungjukProImpl implements SungjukPro{
	Scanner in;
	Hashtable ht;

	public SungjukProImpl() {
		in = new Scanner(System.in);
		ht = new Hashtable();
	}
	
	protected int input(String sub) {
		System.out.print(sub+"점수를 입력 : ");
		int score = in.nextInt();
		if (score<0 || score>100) {
			System.out.println(sub+"점수는 0점에서 100점 사이값만 입력!!");
			return input(sub);
		}else {
			return score;
		}
	}
	
	@Override
	public void insert() {
		while(true) {
			System.out.print("이름을 입력 : ");
			String name = in.next();
			if (ht.containsKey(name)) {
				System.out.println(name+"님은 존재합니다. 다시 입력해 주세요!!");
			}else {
				int kor = input("국어");
				int eng = input("영어");
				Student insert = new Student(name, kor, eng);
				ht.put(name, insert);
				return;
			}
		}
		
	}
	
	protected void rank() {
		for(Enumeration i = ht.keys(); i.hasMoreElements(); ) {
			Object objI = i.nextElement();
			String keyI = (String)objI;
			Student rankI = (Student)ht.get(keyI);
			rankI.clearRank();
			for(Enumeration j = ht.keys(); j.hasMoreElements(); ) {
				Object objJ = j.nextElement();
				String keyJ = (String)objJ;
				Student rankJ = (Student)ht.get(keyJ);
				if (rankI.getTot() < rankJ.getTot()) {
					rankI.plusRank();
				}
			}
		}
	}
	
	@Override
	public void view() {
		rank();
		Enumeration enu = ht.keys();
		while(enu.hasMoreElements()) {
			Object obj = enu.nextElement();
			String key = (String)obj;
			Student view = (Student)ht.get(key);
			view.disp();
		}
	}

	@Override
	public void delete() {
		System.out.print("삭제할 학생의 이름을 입력 : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name+"님을 삭제하였습니다.");
		}else {
			System.out.println(name+"님은 저희 학생이 아닙니다.");
		}
	}

	@Override
	public void edit() {
		System.out.print("수정할 학생의 이름을 입력 : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			Student edit = (Student)ht.get(name);
			System.out.println(name+"님의 현재 국어점수는 " + edit.getKor() +"점 입니다.");
			int kor = input("수정할 국어");
			System.out.println(name+"님의 현재 영어점수는 " + edit.getEng() +"점 입니다.");
			int eng = input("수정할 영어");
			edit.setKor(kor);
			edit.setKor(eng);
			edit.setTot();
			System.out.println(name+"님의 성적을 수정하였습니다.");
		}else {
			System.out.println(name+"님은 저희 학생이 아닙니다.");
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
