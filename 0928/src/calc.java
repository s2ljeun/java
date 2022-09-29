//14일 8번
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame01 extends JFrame implements ActionListener{	
	private JTextField jtf = new JTextField();
	private JPanel jp = new JPanel();
	private JButton[] bt = new JButton[16];
	private String[] str = {"7", "8", "9", "+",
							"4", "5", "6", "-",
							"1", "2", "3", "*",
							"0", "=", "%", "/"};
	private boolean isOp = false;
	private char op = 0;//''
	private int firstSu = 0;

	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtf);
		jtf.setEditable(false);

		con.add("Center", jp);		
		jp.setLayout(new GridLayout(4,4));
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new JButton(str[i]);
			jp.add(bt[i]);
			bt[i].addActionListener(this);
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame01(String title) {
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
	
	protected void result() {
		int res = 0;
		switch(op) {
		case '+' : res = firstSu + Integer.parseInt(jtf.getText()); break;
		case '-' : res = firstSu - Integer.parseInt(jtf.getText()); break;
		case '*' : res = firstSu * Integer.parseInt(jtf.getText()); break;
		case '/' : res = firstSu / Integer.parseInt(jtf.getText()); break;
		case '%' : res = firstSu % Integer.parseInt(jtf.getText()); 
		}
		jtf.setText(String.valueOf(res));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.charAt(0) >= '0' && str.charAt(0) <= '9') {
			if (isOp) {
				isOp = false;
				firstSu = Integer.parseInt(jtf.getText());
				jtf.setText(str);
			} else {
				jtf.setText(jtf.getText() + str);
			}
		} else {
			isOp = true;
			if (op != 0) result();
			if (str.charAt(0)=='=') {
				op = 0;
			}else {
				op = str.charAt(0);
			}
		}
		
	}
}
public class calc {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("계산기");
	}
}
