import java.util.Scanner;

/*
 * 클래스를 이용하여 성적관리 프로그램을 작성하여 주세요
 * - 이름, 국어, 영어점수를 입력받아 이름, 총점, 순위를 출력시켜주는 프로그램
 */
class Score{
	String name;
	int kor;
	int eng;
	int tot;
	int rank;
	Score(String name, int kor, int eng){ // 이 객체를 만들 때 무엇을 받을지
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
		rank = 1; // 모든 사람의 순위는 1위에서 시작
	}
	void disp() { // 최종 출력 담당할 메소드 만들기
		System.out.println(name + "님의 총점: " + tot + " 순위: " + rank);
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("학생의 수를 입력 : ");
		int inwon = in.nextInt();
		
		Score sc[] = new Score[inwon]; // 입력받은 인원수만큼 배열 만들기, 인원수만큼 각각 객체 생성
		for(int i=0; i<inwon; ++i) {
			System.out.print("이름을 입력: ");
			String name = in.next();
			System.out.print("국어점수를 입력: ");
			int kor = in.nextInt();
			System.out.print("영어점수를 입력: ");
			int eng = in.nextInt();
			sc[i] = new Score(name, kor, eng);
		}
		for(int i=0; i<inwon; ++i) { //모든 입력 받았으므로 랭크 구하기
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
