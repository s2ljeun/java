import java.util.Scanner;

/*☆
 * 인원수를 입력받고 그 인원수대로 이름과 국어, 영어점수를 입력받은 후,
 * 이름과 총점, 순위를 알려주는 프로그램
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("인원수를 입력하세요: ");
		int inwon = in.nextInt();

		String name[] = new String[inwon]; // 입력받은 숫자가 배열크기
		int kor[] = new int[inwon];
		int eng[] = new int[inwon];
		int sum[] = new int[inwon];
		int rank[] = new int[inwon];
		
		for(int i=0; i<inwon; i++) {
			System.out.print(i+1 + "번째 이름: ");
			name[i] = in.next();

			System.out.print(i+1 + "번째 국어점수: ");
			kor[i] = in.nextInt();
			
			System.out.print(i+1 + "번째 영어점수: ");
			eng[i] = in.nextInt();
			
			sum[i] = kor[i] + eng[i]; // 총합
			
			rank[i] = 1; // 순위를 구하기 위해 기본값 1로

		}
		
		//순위 구하기 알고리즘
		for(int i=0; i<inwon; ++i) {		//i = 나
			for(int j=0; j<name.length; ++j) {	//j = 다른사람
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int i=0; i<inwon; i++) {
			System.out.printf("%s님의 총점은 %d점이고, 순위는 %d위입니다. \n", name[i], sum[i], rank[i]);
		}
		
	}

}
