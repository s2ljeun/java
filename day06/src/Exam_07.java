import java.io.*;

public class Exam_07 {
	public static void main(String[] args) throws IOException {
		int com[] = new int[3];
		for(int i=0; i<3; ++i) {
			com[i] = (int)(Math.random()*9) + 1;
			for (int j=0; j<i; ++j) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		
		int select[] = new int[3];
		int co = 0;
		while(true) {
			int s = 0, b = 0;
			System.out.print("수를 입력 : ");
			for(int i=0; i<3; ++i) {
				select[i] = System.in.read() - 48;
			}
			System.in.skip(5);//enter키값을 메모리에서 버리는 것
			//System.in.read();// \r
			//System.in.read();// \n
			co++;
			for(int i=0; i<3; ++i) {
				for(int j=0; j<3; ++j) {
					if (com[i] == select[j]) {
						if (i==j) {
							s++;
						}else {
							b++;
						}
					}
				}
			}
			
			if (s==3) break;
			else if (s==0 && b==0) System.out.println("out");
			else System.out.printf("%dS %dB\n", s, b);
		}
		
		System.out.println(co+"번만에 맞추셨습니다.");
	}
}














