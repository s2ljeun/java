
public class Exam_08 {
	public static void main(String[] args) {
		int sum = 0;

		//while true��
//		while(true) {
//			sum += i;
//			++i;
//			if(i>100) break; // ������ ���� �߰�ȣ ���� ����
//		}
		
		//while��
		int i = 1;
		while(i<=100) {
			sum += i;
			++i;
		}

		//for��
//		for(int i=1; i<=100; ++i) {
//			sum += i;
//		}
		System.out.print(sum);
	}
}