/* �� �������� ������ class Shape�� �����صΰ� ��/�ﰢ��/�簢��/������ ������ �����ϴ� ������ �� �� �ִ�.
 * 1. �����ﰢ�� 2.���簢�� 3.��:
 * �ﰢ���� �����ϸ�, �غ��� ���̸� ���ϰ� �� ����� ���
 * �簢���� �����ϸ�, ���ο� ���θ� ���ϰ� �� ����� ���
 * ���� �����ϸ�, �������� ���ϰ� �� ����� ���
 */
import java.util.*;

class Shape{
	Scanner in = new Scanner(System.in);
	protected double res;
	public double area() {
		System.out.println("�ش��ϴ� ������ ���̸� ���� ��ȯ");
		return res;
	}
}

class Triangle extends Shape{
	private double bottom;
	private double height;
	public Triangle() {
		System.out.println("�غ��� �Է�: ");
		bottom = in.nextInt();
		System.out.println("���̸� �Է�: ");
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
