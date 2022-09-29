import java.util.*;

class MyException02 extends Exception{ // ����Ŭ���� �����
	private String message;
	
	public MyException02(String msg) {
		super(msg);
	}
	
	public String getMessage() {
		message = super.getMessage() + "0������ 100�� ������ ������ �Է��ϼ���.";
		return message;
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.print("���������� �Է�: ");
			int kor = in.nextInt();
			
			if(kor<0 || kor>100) throw new MyException02("����: "); // ����Ŭ���� ��ü(�ν��Ͻ�) ����(���赵�� ���� �ڵ��� �����)
			
			System.out.print("�Է��� ������ " + kor + "��");
			
		} catch(InputMismatchException e) {
			System.err.println("���ڸ� �Է����ּ���.");
		} catch(MyException02 e) { // ���� ������ exception�� �߻��ϸ�
			 System.err.println(e.getMessage());
		}
	}
}