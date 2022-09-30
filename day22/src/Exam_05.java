//����
import java.net.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class chatGui extends Thread{
	public void run() {
		MyFrame05 mf = new MyFrame05("ä�ü���");
	}
}

class MyFrame05 extends JFrame implements ActionListener{	
	public void init() {
		Container con = this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame05(String title) {
		super(title);
		this.init();
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}


public class Exam_05 extends Thread {
	ServerSocket ss;
	Socket soc;
	PrintWriter pw; // �޼��� ����
	Scanner in;
	BufferedReader br; //�޼��� �ޱ�
	
	public Exam_05() {
		in = new Scanner(System.in);
		
		try {
			ss = new ServerSocket(12345);
			soc = ss.accept();
			
			this.start(); // ��Ƽ������� �޴� �� ���� (soc�� ������ ����)

			pw = new PrintWriter(soc.getOutputStream()); // soc�� ������ ����
			
			while(true) {
				System.out.print("Ŭ�� ������ �޼���: ");
				String msg = in.next();
				pw.println(msg);
				pw.flush();
				
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			while(true) {
				String msg = br.readLine();
				if(msg == null) break;
				System.out.println("Ŭ���� �� �޼���: " + msg);
			}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Exam_05();
	}
	
}
