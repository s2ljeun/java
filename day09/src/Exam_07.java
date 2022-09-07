import java.util.*;
class Protoss{
	public void attack() {
		System.out.println("공격하는 기능!!");
	}
	public void move() {
		System.out.println("이동하는 기능!!");
	}
}

class Zeatlot extends Protoss{
	public void attack() {
		System.out.println("질럿이 공격을 합니다.");
	}
	public void move() {
		System.out.println("질럿이 이동을 합니다.");
	}
}
class Dragon extends Protoss{
	public void attack() {
		System.out.println("드라곤이 공격을 합니다.");
	}
	public void move() {
		System.out.println("드라곤이 이동을 합니다.");
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Protoss[] pro = new Protoss[4];
		for(int i=0; i<4; ++i) {
			System.out.print("1.질럿  2.드라곤 : ");
			int select1 = in.nextInt();
			if (select1 == 1) {			pro[i] = new Zeatlot();
			}else {			pro[i] = new Dragon();		}
		}
		
		System.out.print("1.공격  2.이동 : ");
		int select2 = in.nextInt();
		
		if (select2 == 1) {
			for(int i=0; i<4; ++i) {
				pro[i].attack();
			}
		}else {
			for(int i=0; i<4; ++i) {
				pro[i].move();		
			}
			}
	}
}














