import java.util.*;

/*
 * 1.입력 2.출력 3.수정 4.삭제 5.종료:
 * 입력시 이름과 전화번호를 입력받아 저장한다
 * 출력시 입력된 모든 자료를 출력시켜준ㄴ다
 * 수정시 이름으 받 아 ㅏ해당하는곳의 전화번호를 수정한ㅏ
 * 삭제시이름을 입력받아 해당하느 회원의 삭제
 * 종료ㅣ 프로그램을 종룟긴카
 */
public class Exam_06 {
	Scanner in = new Scanner(System.in);
	HashSet hs = new HashSet();
	Iterator it = hs.iterator();
	
	int select = in.nextInt();
	String name;
	int tel;
	
	switch(select) {
	case 1: {
		System.out.print("이름을 입력: ");
		name = in.next();
		hs.add(name);
		System.out.print("번호를 입력: ");
		tel = in.nextInt();
		hs.add(tel);
		break;
	}
	case 2: {
		while(it.hasNext()) {
			System.out.println("이름: " + name + "번호: " + tel);
		}
		break;
	}
	case 3:
	case 4:
	case 5:
	}

}
