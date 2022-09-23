import java.util.*;

class UpDownGame extends Thread{
	private int comsu;
	private int num;
	private int time;
	
	public UpDownGame() {
		comsu = (int)(Math.random()*100) + 1;
		time = 0;
	}
	
	public void run() {
		while(true) {
			time++;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
	
	public int getTime() {
		return time;
	}
	
	public void selectNum() {
		Scanner in = new Scanner(System.in);
		System.out.print("1~100사이의 수를 입력 : ");
		num = in.nextInt();
	}
	
	public int game() {
		if (comsu == num) {
			return 0;
		}else if (comsu>num) {
			return 1;
		}else {
			return -1;
		}
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		UpDownGame game = new UpDownGame();
		game.setDaemon(true);
		game.start();
		while(true) {
			game.selectNum();
			int res = game.game();
			if (res==0) {
				break;
			}else if (res == 1) {
				System.out.println("Up");
			}else if (res == -1) {
				System.out.println("Down");
			}
		}
		System.out.println(game.getTime()+"초만에 맞추셨습니다.");
	}
}
