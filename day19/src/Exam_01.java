/*
����ã��
9*9 �迭�� ���� �����
�� �迭 �� �������� ��ġ�� �����Ͽ�
9���� �����ϴ� ���α׷�
0	0	0	0	0	0	0	0	0
10	0	0	0	0	0	10
 */


public class Exam_01 {
	static int arr[][] = new int[9][9];
	public static void boomCheck(int x, int y) {
		int minI = x - 1; if (minI<0) minI = 0;
		int maxI = x + 1; if (maxI>8) maxI = 8;
		int minJ = y - 1; if (minJ<0) minJ = 0;
		int maxJ = y + 1; if (maxJ>8) maxJ = 8;
		for(int i=minI; i<=maxI; ++i) {
			for(int j=minJ; j<=maxJ; ++j) {
				if (x==i && y==j) continue;
				if (arr[i][j] == 10) continue;
				arr[i][j]++;
			}
		}
	}
	public static void main(String[] args) {
		for(int i=0; i<9; ++i) {
			while(true) {
				int x = (int)(Math.random()*9);//0 ~ 8������ ���� ���´�
				int y = (int)(Math.random()*9);
				if (arr[x][y] == 0) {
					arr[x][y] = 10;
					boomCheck(x, y);
					break;
				}
			}
		}
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				if (arr[i][j] == 10) {
					System.out.print("��ź" + "\t");
				}else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
