import java.awt.*;
import java.awt.event.*;

class MyFrame08 extends Frame implements ActionListener{
	private BorderLayout bl = new BorderLayout();
	private TextField tf = new TextField();
	private Panel p = new Panel();
	private GridLayout gl = new GridLayout(4,4,5,5);
	private Button[] bt = new Button[16]; // ��ü�� ���� ���� �ƴϰ� ���� �� ��
	private String[] str = new String[] {"7","8","9","+","4","5","6","-",
											"1","2","3","*","0","=","%","/"};
	private boolean isOp = false; //���� ��ư ���� ���� �����ڳ� �ƴϳĸ� �����ϱ� ����
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
			bt[i] = new Button(str[i]); // ��ü �����
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
	
	// �� �ȿ� isOp�� �����ϸ� actionPerformed�� ����� ������ �ʱ�ȭ�� �Ǿ������...: ��������
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {	// ���� ��ư�� ���ڸ�
			if (isOp) {
				isOp = false;
				firstSu = Integer.parseInt(tf.getText());
				tf.setText(str);
			}else {
				tf.setText(tf.getText() + str);
			}
		}else {												// ���� ��ư�� Ư�����ڸ�
			isOp = true; //�����ڸ� �����ٰ� ��ȣ�� �ش�
			if (op !=0) result(); // ���� �����ڰ� �ִٸ� ����� �ؼ� ��Ÿ���ش�
			if (str.charAt(0)=='=') { // ���� ���� �����ڰ� '=' �̶�� ���̻� ��� ���� �� ��
				op = 0;
			}else {
				op = str.charAt(0);
			}
		}
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		MyFrame08 mf = new MyFrame08("���⿹��");
	}
}
	