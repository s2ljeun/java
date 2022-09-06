import java.util.Scanner;

/*
 * Ŭ������ �̿��Ͽ� �������� ���α׷��� �ۼ��Ͽ� �ּ���
 * - �̸�, ����, ���������� �Է¹޾� �̸�, ����, ������ ��½����ִ� ���α׷�
 */
class Score{
	String name;
	int kor;
	int eng;
	int tot;
	int rank;
	Score(String name, int kor, int eng){ // �� ��ü�� ���� �� ������ ������
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
		rank = 1; // ��� ����� ������ 1������ ����
	}
	void disp() { // ���� ��� ����� �޼ҵ� �����
		System.out.println(name + "���� ����: " + tot + " ����: " + rank);
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�л��� ���� �Է� : ");
		int inwon = in.nextInt();
		
		Score sc[] = new Score[inwon]; // �Է¹��� �ο�����ŭ �迭 �����, �ο�����ŭ ���� ��ü ����
		for(int i=0; i<inwon; ++i) {
			System.out.print("�̸��� �Է�: ");
			String name = in.next();
			System.out.print("���������� �Է�: ");
			int kor = in.nextInt();
			System.out.print("���������� �Է�: ");
			int eng = in.nextInt();
			sc[i] = new Score(name, kor, eng);
		}
		for(int i=0; i<inwon; ++i) { //��� �Է� �޾����Ƿ� ��ũ ���ϱ�
			for(int j=0; j<inwon; ++j) {
				if (sc[i].tot < sc[j].tot) {
					sc[i].rank++;
				}
			}
		}
		
		for(int i=0; i<inwon; ++i) {
			sc[i].disp();
		}
	}
}
