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
		//업캐스팅된 상태에서 오버라이드된 메소드를 실행하면 자식의 메소드가 실행된다.
		/*
		Point2d p2 = new Point3d();
		Point3d p3 = (Point3d)p2;	//다운캐스팅 - 강제형변환
		//1. 부모객체는 반드시 업캐스팅 된 상태일때만 가능
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		//System.out.println("p2.z = " + p2.z);
		/*
		Point3d p3 = new Point3d();
		Point2d p2 = p3;	//업캐스팅 - 자동형변환
		//Point3d의 super멤버필드만 접근 가능
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		//System.out.println("p2.z = " + p2.z);
		
		/*
		Point2d p = new Point2d();
		Point2d p1 = p;
		//객체간의  연산은 자바에서는 대입연산만 가능
		//- 대입연산도 같은 클래스이거나, 상속관계일때만 가능
		System.out.println("p.x = " + p.x);
		System.out.println("p1.x = " + p1.x);
		
		p.x = 1;
		System.out.println("p.x = " + p.x);
		System.out.println("p1.x = " + p1.x);
		*/
	}
}

















