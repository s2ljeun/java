class MyException extends Exception{ // a. Exception Ŭ������ ��ӹ������μ� ����Ŭ���� �����
	private String message;

	public MyException(String msg) {
		super(msg);
	}
	
	public String getMessage() { // b. ������ �������̵�
		message = super.getMessage() + "���� ���� ���� Ŭ����!!"; // Exception���� super()���� msg�� Exception�� message�� �������̵�
		return message;
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		try {
			MyException me = new MyException("�����ڵ�: "); // 1. ��ü ���������μ� "�����ڵ�:" �� MyException Ŭ���� �������� �Ű�����(String msg)�� ����
			// 2. �����ڿ��� �� msg�� super()�������Ƿ� ��ӹ��� �θ�Ŭ������ Exception���� �ö󰡰�,
			// 3. getMessage()�� �������̵� �ϰ� / message = super.getMessage(msg�� ��������) + "���� ���� ���� Ŭ����"�� ����
			// 4. ���� me���� Exception�� message�� �������.
			// 5. throw me�� ������ ���ܸ� �߻� -> catch���� ���� e.getMessage�� ����
			throw me; // ���ܸ� ������ �߻�
		}catch(MyException e) { // me�� e�� �ȴ�
			System.err.println(e.getMessage()); // err�� out�̶� ������ ���� �۾��� ������ �� ��
		}
	}
}
