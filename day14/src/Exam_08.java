import java.awt.*;
import java.awt.event.*;

class MyFrame08 extends Frame implements ActionListener{
	private BorderLayout bl = new BorderLayout();
	private TextField tf = new TextField();
	private Panel p = new Panel();
	private GridLayout gl = new GridLayout(4,4,5,5);
	private Button[] bt = new Button[16]; // 객체를 만든 것이 아니고 선언만 한 것
	private String[] str = new String[] {"7","8","9","+","4","5","6","-",
											"1","2","3","*","0","=","%","/"};
	private boolean isOp = false; //직전 버튼 누른 값이 연산자냐 아니냐를 구별하기 위해
	private char op = 0;//''
	private int firstSu = 0;
	
	public void init() {
		this.setLayout(bl);
		this.setBackground(Color.YELLOW);
		tf.setFont(new Font("", Font.BOLD, 30));
		tf.setEditable(false);
		this.add("North", tf);
		this.add("Center", p);
		p.setLayout(gl);
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new Button(str[i]); // 객체 만들기
			bt[i].setFont(new Font("", Font.PLAIN, 25));
			p.add(bt[i]);
			bt[i].addActionListener(this);
		}
	}
	
	public MyFrame08(String title) {
		super(title);
		this.init();	super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}

	protected void result() {
		int res = 0;
		switch(op) {
		case '+' : res = firstSu + Integer.parseInt(tf.getText()); break;
		case '-' : res = firstSu - Integer.parseInt(tf.getText()); break;
		case '*' : res = firstSu * Integer.parseInt(tf.getText()); break;
		case '/' : res = firstSu / Integer.parseInt(tf.getText()); break;
		case '%' : res = firstSu % Integer.parseInt(tf.getText()); 
		}
		tf.setText(String.valueOf(res));
	}
	
	// 이 안에 isOp를 선언하면 actionPerformed가 실행될 때마다 초기화가 되어버린다...: 지역변수
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {	// 눌린 버튼이 숫자면
			if (isOp) {
				isOp = false;
				firstSu = Integer.parseInt(tf.getText());
				tf.setText(str);
			}else {
				tf.setText(tf.getText() + str);
			}
		}else {												// 눌린 버튼이 특수문자면
			isOp = true; //연산자를 눌렀다고 신호를 준다
			if (op !=0) result(); // 기존 연산자가 있다면 계산을 해서 나타내준다
			if (str.charAt(0)=='=') { // 지금 누른 연산자가 '=' 이라면 더이상 계산 연결 안 함
				op = 0;
			}else {
				op = str.charAt(0);
			}
		}
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		MyFrame08 mf = new MyFrame08("계산기예제");
	}
}
	