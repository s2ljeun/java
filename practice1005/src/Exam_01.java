import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame01 extends JFrame implements ActionListener{
	private JLabel jp_north = new JLabel("회원가입", JLabel.CENTER);
	
	private JPanel jp_center = new JPanel();
	private JPanel west_wrap = new JPanel();
	private JLabel[] west_lb = new JLabel[10];
	private String[] lb_str = new String[]{"이름", "성별", "아이디", "비밀번호", "비밀번호 재입력", "주소", "이메일", "전화번호", "취미", "자기소개"};
	
	private JPanel center_wrap = new JPanel();
	private JPanel[] center_jp = new JPanel[10];
	private JTextField tf_name = new JTextField();
	private JRadioButton[] gender_bt = new JRadioButton[2];
	private String[] gender_str = new String[] {"남", "여"};
	private JTextField tf_id = new JTextField();
	private JButton bt_id = new JButton();
	private JTextField tf_pw = new JTextField();
	private JTextField tf_pw_re = new JTextField();
	
	
	
	private JPanel jp_south = new JPanel();
	private JPanel south_bt_wrap = new JPanel();
	private JButton confirm_bt = new JButton("완료");
	private JButton rewrite_bt = new JButton("다시입력");
	
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		
		// North
		con.add("North", jp_north);
		
		// Center - West
		con.add("Center", jp_center);
		jp_center.setLayout(new BorderLayout());
		jp_center.add("West", west_wrap);
		west_wrap.setLayout(new GridLayout(10,1));
		for(int i=0; i<9; ++i) {
			west_lb[i] = new JLabel(); // 객체 생성하지 않으면 java.lang.NullPointerException 발생
			west_wrap.add(west_lb[i]);
			west_lb[i].setText(lb_str[i]);
		}
		
		// Center - Center
		jp_center.add("Center", center_wrap);
		center_wrap.setLayout(new GridLayout(10,1));
		for(int i=0; i<9; ++i) {
			center_jp[i] = new JPanel();
			center_wrap.add(center_jp[i]);
		}
		
			// name
		center_jp[0].add(tf_name);
		
			// gender
		for(int i=0; i<gender_bt.length; ++i) {
			gender_bt[i] = new JRadioButton();
			center_jp[i].add(gender_bt[i]);
			gender_bt[i].setText(gender_str[i]);
		}

			// id
		center_jp[2].setLayout(new GridLayout(1,2));
		center_jp[2].add(tf_id);	center_jp[2].add(bt_id);
		
			// pw
		center_jp[3].add(tf_pw);
		center_jp[4].add(tf_pw_re);
		
			// address
		center_jp[5].setLayout(new GridLayout(1,2));
		center_jp[5].add(tf_adr);	center_jp[5].add(bt_adr);
		
			// email
		center_jp[6].setLayout(new GridLayout(1,4));
		center_jp[6].add(tf_email_id);	center_jp[6].add(new JLabel("@"));	center_jp[6].add(tf_email_domain);	center_jp[6].add(jop_email);
		
			// phone
		center_jp[7].setLayout(new GridLayout(1,5));
		center_jp[7].add(jop_phone);	center_jp[7].add(new JLabel("-"));	center_jp[7].add(tf_phone_1);
		center_jp[7].add(new JLabel("-"));	center_jp[7].add(tf_phone_2);
		
			// hobby
		for(int i=0; i<3; ++i) {
			jcb_hobby[i] = new JCheckbox();
			center_jp[8].add(jcb_hobby[i]);
			//jcb_hobby[i].setText(hobby_str[i]);
		}
		
			// self introduction
		center_jp[9].add(ta_self);
		
		
		// South
		con.add("South", jp_south);
		jp_south.setLayout(new BorderLayout());
		jp_south.add("Center", south_bt_wrap);
		south_bt_wrap.setLayout(new GridLayout(1,2));
		south_bt_wrap.add(confirm_bt);	south_bt_wrap.add(rewrite_bt);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame01(String title) {
		super(title);
		this.init();
		this.setSize(800,600);
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
public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("회원가입");
	}
}
