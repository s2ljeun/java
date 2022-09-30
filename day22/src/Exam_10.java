import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

class MyFrame10 extends JFrame implements ActionListener, Runnable, KeyListener{
	private TextArea ta = new TextArea();
	private JPanel jp = new JPanel();
	private JTextField jtf = new JTextField();
	private JButton jbt = new JButton("전송");
	
	private InetAddress ia;
	private Socket soc;
	
	private String name;
	
	private PrintWriter pw;
	private BufferedReader br;
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(ta);
		con.add("South", jp);
		jp.setLayout(new BorderLayout());
		jp.add(jtf);			jtf.addKeyListener(this);
		jp.add("East", jbt);	jbt.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame10() {
		name = JOptionPane.showInputDialog(this, "닉네임을 입력 : ", 
										"입력", JOptionPane.QUESTION_MESSAGE);
		this.setTitle(name);
		
		this.init();
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
		try {
			ia = InetAddress.getByName("localhost");
			soc = new Socket(ia, 12345);
			pw = new PrintWriter(soc.getOutputStream());
			pw.println("@"+name);
			pw.flush();
			Thread th = new Thread(this);
			th.start();
		}catch(Exception e) {}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbt) {
			sendMessage();
		}
	}

	@Override
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			while(true) {
				String msg = br.readLine();
				ta.append(msg+"\n");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER){
			sendMessage();
		}
	}
	
	public void sendMessage() {
		String msg = jtf.getText();
		pw.println(name+":"+msg);
		pw.flush();
		jtf.setText("");
	}
}
public class Exam_10 {
	public static void main(String[] args) {
		MyFrame10 mf = new MyFrame10();
	}
}