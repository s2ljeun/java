import java.util.*;
abstract class Protoss{	//추상클래스 - 멤버메소드 중에 하나 이상 추상메소드가 존재한다, 생성자가 없다
	//추상클래스의 객체화
	//-1. 업캐스팅(자식의 생성자로 객체를 만든다)
	//-2. 익명중첩클래스
	public abstract void attack(); 
	public abstract void move();
}

class Zeatlot extends Protoss{
	//추상클래스를 상속받으면, 반드시 추상메소드를 오버라이드 해야 한다.
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
		
		/*
		Protoss p = new Protoss() {
			public void attack() {
				System.out.println("공격을 합니다.");
			} 
			public void move() {
				System.out.println("이동을 합니다.");
			}
		};
		*/
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














