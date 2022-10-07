package library;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginGUI extends JFrame implements ActionListener{
	private JPanel main_jp = new JPanel();
	private JPanel[] jp = new JPanel[3];
	private JLabel id_lb = new JLabel("아이디: ", JLabel.RIGHT);
	private JTextField id_tf = new JTextField();
	private JLabel pw_lb = new JLabel("비밀번호: ", JLabel.RIGHT);
	private JTextField pw_tf = new JTextField();
	private JButton logIn_bt = new JButton("로그인");
	private JButton signUp_bt = new JButton("회원가입");
	
	private SignUpDialog sudlg = new SignUpDialog(this, "회원가입", true);
	private MemberPro pro = new MemberProImpl();
	
	public void init() {
		Container con = this.getContentPane();
		con.add(main_jp);
		main_jp.setLayout(new GridLayout(jp.length,1));
		main_jp.setBorder(BorderFactory.createEmptyBorder(40 , 40 , 40 , 40)); //상하좌우 띄우기

		for(int i=0; i<jp.length; ++i) {
			jp[i] = new JPanel();
			main_jp.add(jp[i]);
		}
		
		//id
		jp[0].setLayout(new BorderLayout());
		jp[0].add("West", id_lb);
		jp[0].add("Center", id_tf);
		
		//pw
		jp[1].setLayout(new BorderLayout());
		jp[1].add("West", pw_lb);
		jp[1].add("Center", pw_tf);
		
		//bt
		jp[2].setLayout(new GridLayout(1,2));
		jp[2].add(logIn_bt);
		jp[2].add(signUp_bt);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void start() { //addActionListener
		logIn_bt.addActionListener(this);
		signUp_bt.addActionListener(this);
		sudlg.confirm_bt.addActionListener(this);
	}
	
	public Member getLogin() {
		String id = id_tf.getText();
		String pw = pw_tf.getText();
		Member mb = new Member(id, pw);
		return mb;
	}
	
	public void clearDialog() {
		id_tf.setText("");
		pw_tf.setText("");
	}
	
	public LoginGUI(String title) {
		super(title);
		this.init();
		this.start();
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
		if(signUp_bt == e.getSource()) { //회원가입
			// gui 띄우기
			sudlg.setVisible(true);
		} else if(sudlg.confirm_bt == e.getSource()) { //SignUpGUI의 확인버튼을 누르면
			Member mb = sudlg.getMember(); //SignUpGUI에 적힌 멤버객체 받아오기
			int res = pro.insert(mb); //MemberProImpl의 insert 메소드에 멤버객체 넘겨주기
			if (res>0) {
				JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.", "", JOptionPane.INFORMATION_MESSAGE);
				sudlg.clearDialog();
				sudlg.setVisible(false);
			}else {
				JOptionPane.showMessageDialog(null, "다시 시도해주세요.", "", JOptionPane.INFORMATION_MESSAGE);
			}
			
		} else if(logIn_bt == e.getSource()) { //로그인
			Member mb = this.getLogin(); //현재 창에 적힌 멤버객체 받아오기
			int res = pro.search(mb);//MemberProImpl의 search메소드에 멤버객체 넘겨주기
			if (res>0) {
				//mb에 아이디랑 패스워드 뿐이라 이름 찾아올 방법?
				JOptionPane.showMessageDialog(null, mb.getId() + "님 환영합니다", "", JOptionPane.INFORMATION_MESSAGE);
				this.clearDialog();
				this.setVisible(false); // 로그인창이 보이지 않게
				MemberGUI gui = new MemberGUI(mb.getId());
			}else {
				JOptionPane.showMessageDialog(null, "아이디와 패스워드를 확인해주세요.", "", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
