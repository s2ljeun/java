package library;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginGUI extends JFrame implements ActionListener{
	private JPanel main_jp = new JPanel();
	private JPanel[] jp = new JPanel[3];
	private JLabel id_lb = new JLabel("���̵�: ", JLabel.RIGHT);
	private JTextField id_tf = new JTextField();
	private JLabel pw_lb = new JLabel("��й�ȣ: ", JLabel.RIGHT);
	private JTextField pw_tf = new JTextField();
	private JButton logIn_bt = new JButton("�α���");
	private JButton signUp_bt = new JButton("ȸ������");
	
	private SignUpDialog sudlg = new SignUpDialog(this, "ȸ������", true);
	private MemberPro pro = new MemberProImpl();
	
	public void init() {
		Container con = this.getContentPane();
		con.add(main_jp);
		main_jp.setLayout(new GridLayout(jp.length,1));
		main_jp.setBorder(BorderFactory.createEmptyBorder(40 , 40 , 40 , 40)); //�����¿� ����

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
		if(signUp_bt == e.getSource()) { //ȸ������
			// gui ����
			sudlg.setVisible(true);
		} else if(sudlg.confirm_bt == e.getSource()) { //SignUpGUI�� Ȯ�ι�ư�� ������
			Member mb = sudlg.getMember(); //SignUpGUI�� ���� �����ü �޾ƿ���
			int res = pro.insert(mb); //MemberProImpl�� insert �޼ҵ忡 �����ü �Ѱ��ֱ�
			if (res>0) {
				JOptionPane.showMessageDialog(null, "ȸ�������� �Ϸ�Ǿ����ϴ�.", "", JOptionPane.INFORMATION_MESSAGE);
				sudlg.clearDialog();
				sudlg.setVisible(false);
			}else {
				JOptionPane.showMessageDialog(null, "�ٽ� �õ����ּ���.", "", JOptionPane.INFORMATION_MESSAGE);
			}
			
		} else if(logIn_bt == e.getSource()) { //�α���
			Member mb = this.getLogin(); //���� â�� ���� �����ü �޾ƿ���
			int res = pro.search(mb);//MemberProImpl�� search�޼ҵ忡 �����ü �Ѱ��ֱ�
			if (res>0) {
				//mb�� ���̵�� �н����� ���̶� �̸� ã�ƿ� ���?
				JOptionPane.showMessageDialog(null, mb.getId() + "�� ȯ���մϴ�", "", JOptionPane.INFORMATION_MESSAGE);
				this.clearDialog();
				this.setVisible(false); // �α���â�� ������ �ʰ�
				MemberGUI gui = new MemberGUI(mb.getId());
			}else {
				JOptionPane.showMessageDialog(null, "���̵�� �н����带 Ȯ�����ּ���.", "", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
