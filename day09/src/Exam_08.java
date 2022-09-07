/* ★ 다형성을 응용해 class Shape를 구현해두고 원/삼각형/사각형/메인을 나누어 구현하는 협업을 할 수 있다.
 * 1. 직각삼각형 2.직사각형 3.원:
 * 삼각형을 선택하면, 밑변과 높이를 구하고 그 결과를 출력
 * 사각형을 선택하면, 가로와 세로를 구하고 그 결과를 출력
 * 원을 선택하면, 반지름을 구하고 그 결과를 출력
 */
import java.util.*;

class Shape{
	Scanner in = new Scanner(System.in);
	protected double res;
	public double area() {
		System.out.println("해당하는 도형의 넓이를 구해 반환");
		return res;
	}
}

class Triangle extends Shape{
	private double bottom;
	private double height;
	public Triangle() {
		System.out.println("밑변을 입력: ");
		bottom = in.nextInt();
		System.out.println("높이를 입력: ");
		height = in.nextInt();
	}
	public double area() {
		res = bottom * height / 2.0;
		return res;
	}
}

public class Exam_08 {
	
	
	
	
	Triangle tri = new Triangle(base, height);
	

}
