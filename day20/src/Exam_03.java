import javax.swing.*;
import java.io.*;

public class Exam_03 {
	public static void main(String[] args) {
		JFileChooser jfc = new JFileChooser(".");
		
		int res = jfc.showOpenDialog(null); // 특별한 컴포넌트 위에 올리지 않을 때 null (프레임, 컨테이너 위에 올릴 때는 this)
		
		if (res == 0) { // 열기버튼 = 0
			System.out.println("파일선택!!");
			File file = jfc.getSelectedFile();
			System.out.println("선택하신 파일: " + file.getName());
		}else {
			System.out.println("파일닫기 끝!!");
		}
	}

}
