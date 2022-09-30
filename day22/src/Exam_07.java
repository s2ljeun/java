import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

class MyFrame07 extends JFrame implements ActionListener, Runnable{
	private TextArea ta = new TextArea();
	private JPanel jp = new JPanel();
	private JTextField jtf = new JTextField();
	private JButton jbt = new JButton("전송");
	
	private ServerSocket ss;
	private Socket soc;
	
	private PrintWriter pw;
	private BufferedReader br;
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(ta);
		con.add("South", jp);
		jp.setLayout(new BorderLayout());
		jp.add(jtf);
		jp.add("East", jbt);	jbt.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame07(String title) {
		super(title);
		this.init();
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
		try {
			ss = new ServerSocket(12345);
			soc = ss.accept();
			pw = new PrintWriter(soc.getOutputStream());
			Thread th = new Thread(this); // 스레드 받으려면 객체 생성
			th.start();
		}catch(Exception e) {}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbt) {
			String msg = jtf.getText();
			pw.println(msg);
			pw.flush();
			jtf.setText("");
			ta.append("클에 보낸 메세지 : " + msg + "\n");
		}
	}

	@Override
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			while(true) {
				String msg = br.readLine();
				ta.append("클에서 온 메세지 : " + msg + "\n");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		MyFrame07 mf = new MyFrame07("swing예제");
	}
}
