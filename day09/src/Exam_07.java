import java.util.*;
abstract class Protoss{	//�߻�Ŭ���� - ����޼ҵ� �߿� �ϳ� �̻� �߻�޼ҵ尡 �����Ѵ�, �����ڰ� ����
	//�߻�Ŭ������ ��üȭ
	//-1. ��ĳ����(�ڽ��� �����ڷ� ��ü�� �����)
	//-2. �͸���øŬ����
	public abstract void attack(); 
	public abstract void move();
}

class Zeatlot extends Protoss{
	//�߻�Ŭ������ ��ӹ�����, �ݵ�� �߻�޼ҵ带 �������̵� �ؾ� �Ѵ�.
	public void attack() {
		System.out.println("������ ������ �մϴ�.");
	}
	public void move() {
		System.out.println("������ �̵��� �մϴ�.");
	}
}
class Dragon extends Protoss{
	public void attack() {
		System.out.println("������ ������ �մϴ�.");
	}
	public void move() {
		System.out.println("������ �̵��� �մϴ�.");
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		Protoss p = new Protoss() {
			public void attack() {
				System.out.println("������ �մϴ�.");
			} 
			public void move() {
				System.out.println("�̵��� �մϴ�.");
			}
		};
		*/
		Protoss[] pro = new Protoss[4];
		for(int i=0; i<4; ++i) {
			System.out.print("1.����  2.���� : ");
			int select1 = in.nextInt();
			if (select1 == 1) {			pro[i] = new Zeatlot();
			}else {			pro[i] = new Dragon();		}
		}
		
		System.out.print("1.����  2.�̵� : ");
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














