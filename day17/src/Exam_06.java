import java.util.*;
import java.text.*;

class TimeThread extends Thread{
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:SSS");

	public void run() {
		while(true) {
			Date date = new Date();
			System.out.println("����ð� : " + sdf.format(date));
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		TimeThread tt = new TimeThread();
		tt.setDaemon(true);//main�� ���Ӱ��踦 �δ´�
		tt.start();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
	}
}











