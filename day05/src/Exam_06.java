/*
 * �ζ� ���α׷��� ����� ����
 * ��ǻ�Ͱ� 1~45�� �� 6���� �ߺ����� ���� ���� ����
 * ����ڴ� 1~45�� �� 6���� ���� �Է��ϵ��� �Ѵ�(�ߺ����� �ʰ�)
 * ��ǻ�Ͱ� ������ ���� ����ڰ� ������ ���� ���Ͽ� ���ᰳ���� �˷��ش�.
 */
import java.util.*;
public class Exam_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] lottery = new int[6];
		int[] select = new int[6];

		for(int i=0; i<lottery.length; i++) { // ��ǻ���� �� 6�� �̱�
			lottery[i] = (int)(Math.random() * 45) +1; // 1~45�� ��
			
			for(int j=0; j<i; ++j) { // �ߺ�üũ
				if (lottery[i] == lottery[j]) { // �ߺ��ȴٸ�
					i-- ; // ���� �ڸ��� ����
					break; // ���� for�� ����������
				}
			}

		}
		
		for(int i=0; i<lottery.length; i++) {
			do {
				System.out.print(i+1 + "��° ���� �Է����ּ���: ");
				select[i] = in.nextInt();
			}while(select[i] < 1 || select[i] > 45); //1���� �۰ų� 45���� ũ�� �ٽ� �Է½�Ų��.
			
			for(int j=0; j<i; ++j) { // �ߺ�üũ
				if (lottery[i] == lottery[j]) { // �ߺ��ȴٸ�
					i-- ; // ���� �ڸ��� ����
					break; // ���� for�� ����������
				}
			}
		}
		
		int co = 0;
		
		for(int i=0; i<lottery.length; i++) { // pc�� �� ��
			for(int j=0; j<lottery.length; j++) { // ���� �� ��
				if(lottery[i] == select[j]) {
					co++; // ���� ī��Ʈ�� 1�� ���̰�
					break; // �ߺ��Ұ��ϹǷ� ���Ĵ� ���� �ʴ´�.
				}
			}
		}
		
		System.out.print("���᰹��: " + co);

	}

}
