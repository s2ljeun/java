
public class Exam_08 {
	public static void main(String[] args) {
		char arr[][] = new char[5][5];
		
		char co = 'A';
		
		for(int j=0; j<5; ++j) {
			if (j%2==0) {
				for(int i=0; i<=4; ++i) {
					arr[i][j] = co;
					co++;
				}
			}else {	
				for(int i=4; i>=0; --i) {
					arr[i][j] = co;
					co++;
				}
			}
		
		}
		
		for(int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				System.out.printf("%c\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
