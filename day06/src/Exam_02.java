/*
 * 2차원 배열
 */

public class Exam_02 {
	public static void main(String[] args) {
		//int arr[] = new int[3];
		int[][] arr1 = new int[2][3]; // [2개방][크기 3개씩]
		int[] arr2[] = new int[2][2];
		int arr3[][] = new int[2][2];
		
		int[][] arr4 = new int[2][]; // [2개방][크기 각자 나중에 선언]
		arr4[0] = new int[3]; // arr4의 (주소값)0번이 가리키는 배열 : 크기 3
		arr4[1] = new int[4]; // arr4의 (주소값)1번이 가리키는 배열: 크기 4
		
		System.out.println("arr4.length = " + arr4.length); // 2
		System.out.println("arr4.length = " + arr4[0].length); // 3
		System.out.println("arr4.length = " + arr4[1].length); // 4
	}

}
