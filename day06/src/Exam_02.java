/*
 * 2���� �迭
 */

public class Exam_02 {
	public static void main(String[] args) {
		//int arr[] = new int[3];
		int[][] arr1 = new int[2][3]; // [2����][ũ�� 3����]
		int[] arr2[] = new int[2][2];
		int arr3[][] = new int[2][2];
		
		int[][] arr4 = new int[2][]; // [2����][ũ�� ���� ���߿� ����]
		arr4[0] = new int[3]; // arr4�� (�ּҰ�)0���� ����Ű�� �迭 : ũ�� 3
		arr4[1] = new int[4]; // arr4�� (�ּҰ�)1���� ����Ű�� �迭: ũ�� 4
		
		System.out.println("arr4.length = " + arr4.length); // 2
		System.out.println("arr4.length = " + arr4[0].length); // 3
		System.out.println("arr4.length = " + arr4[1].length); // 4
	}

}
