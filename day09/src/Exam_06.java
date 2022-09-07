class Point2d{
	int x;
	int y;
	public Point2d() {
		x = 100;
		y = 125;
	}
	public void disp() {
		System.out.printf("[%d, %d]\n", x, y);
	}
}
class Point3d extends Point2d{
	int z;
	public Point3d() {
		z = 224;
	}
	public void disp() {
		System.out.printf("[%d, %d, %d]\n", x, y, z);
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		Point2d p2 = new Point3d();
		p2.disp();
		//��ĳ���õ� ���¿��� �������̵�� �޼ҵ带 �����ϸ� �ڽ��� �޼ҵ尡 ����ȴ�.
		/*
		Point2d p2 = new Point3d();
		Point3d p3 = (Point3d)p2;	//�ٿ�ĳ���� - ��������ȯ
		//1. �θ�ü�� �ݵ�� ��ĳ���� �� �����϶��� ����
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		//System.out.println("p2.z = " + p2.z);
		/*
		Point3d p3 = new Point3d();
		Point2d p2 = p3;	//��ĳ���� - �ڵ�����ȯ
		//Point3d�� super����ʵ常 ���� ����
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		//System.out.println("p2.z = " + p2.z);
		
		/*
		Point2d p = new Point2d();
		Point2d p1 = p;
		//��ü����  ������ �ڹٿ����� ���Կ��길 ����
		//- ���Կ��굵 ���� Ŭ�����̰ų�, ��Ӱ����϶��� ����
		System.out.println("p.x = " + p.x);
		System.out.println("p1.x = " + p1.x);
		
		p.x = 1;
		System.out.println("p.x = " + p.x);
		System.out.println("p1.x = " + p1.x);
		*/
	}
}

















