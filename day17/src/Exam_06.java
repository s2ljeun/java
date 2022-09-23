import java.util.*;
import java.text.*;

class TimeThread extends Thread{
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:SSS");

	public void run() {
		while(true) {
			Date date = new Date();
			System.out.println("현재시간 : " + sdf.format(date));
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		TimeThread tt = new TimeThread();
		tt.setDaemon(true);//main과 종속관계를 맺는다
		tt.start();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
	}
}











