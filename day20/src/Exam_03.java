import javax.swing.*;
import java.io.*;

public class Exam_03 {
	public static void main(String[] args) {
		JFileChooser jfc = new JFileChooser(".");
		
		int res = jfc.showOpenDialog(null); // Ư���� ������Ʈ ���� �ø��� ���� �� null (������, �����̳� ���� �ø� ���� this)
		
		if (res == 0) { // �����ư = 0
			System.out.println("���ϼ���!!");
			File file = jfc.getSelectedFile();
			System.out.println("�����Ͻ� ����: " + file.getName());
		}else {
			System.out.println("���ϴݱ� ��!!");
		}
	}

}
