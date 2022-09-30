import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

class MyFrame08 extends JFrame implements ActionListener, Runnable, KeyListener{
	private TextArea ta = new TextArea();
	private JPanel jp = new JPanel();
	private JTextField jtf = new JTextField();
	private JButton jbt = new JButton("전송");
	
	private InetAddress ia;
	private Socket soc;
	
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
	
	public MyFrame08(String title) {
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
			ia = InetAddress.getByName("localhost");
			soc = new Socket(ia, 12345);
			pw = new PrintWriter(soc.getOutputStream());
			Thread th = new Thread(this);
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
			ta.append("서버에 보낸 메세지 : " + msg + "\n");
		}
	}

	@Override
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			while(true) {
				String msg = br.readLine();
				ta.append("서버에서 온 메세지 : " + msg + "\n");
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
			String msg = jtf.getText();
			pw.println(msg);
			pw.flush();
			jtf.setText("");
			ta.append("서버에 보낸 메세지 : " + msg + "\n");
		}
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		MyFrame08 mf = new MyFrame08("swing예제");
	}
}
