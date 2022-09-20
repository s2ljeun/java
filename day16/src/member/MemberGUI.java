package member;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MemberGUI extends Frame implements ActionListener{
	private Panel north_p = new Panel();
	private Button insert_bt = new Button("입력");
	private Button edit_bt = new Button("수정");
	private Button delete_bt = new Button("삭제");
	private Button exit_bt = new Button("종료");
	private TextArea ta = new TextArea();
	private String title = new String("회 원 목 록 리 스 트");
	private String line = new String("-----------------");
		
	private InputDialog idlg = new InputDialog(this, "회원입력", true);
	private DeleteDialog ddlg = new DeleteDialog(this, "회원삭제", true);
	
	private MemberPro pro = new MemberProImpl();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", north_p);
		north_p.setLayout(new GridLayout(1,4));
		north_p.add(insert_bt);
		north_p.add(edit_bt);
		north_p.add(delete_bt);
		north_p.add(exit_bt);
		setTextArea(pro.view());
		ta.setFont(new Font("", Font.PLAIN, 20));
		this.add("Center", ta);
	}
	public void start() {
		insert_bt.addActionListener(this);
		edit_bt.addActionListener(this);
		delete_bt.addActionListener(this);
		exit_bt.addActionListener(this);
		idlg.input_bt.addActionListener(this);
		idlg.cencle_bt.addActionListener(this);
		ddlg.input_bt.addActionListener(this);
	}
	public void setTextArea(ArrayList<Member> list) {
		ta.setText(title + "\n");
		ta.append(line + "\n");
		ta.append("이름\t\t전화번호\n");
		ta.append(line + "\n");
		for(Member mb : list) {
			ta.append(mb.getName() + "\t\t" + mb.getTel()+"\n");
		}
	}
	
	public MemberGUI(String title) {
		super(title);
		this.init();
		this.start();
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==insert_bt) {
			idlg.setVisible(true);
		}else if (e.getSource()==idlg.input_bt) {
			Member mb = idlg.getMember();
			idlg.clearDialog();
			pro.insert(mb);
			setTextArea(pro.view());
		}else if (e.getSource()==idlg.cencle_bt) {
			idlg.clearDialog();
		}else if (e.getSource()==delete_bt) {
			ddlg.setVisible(true);
		}else if (e.getSource()==ddlg.input_bt) {
			String name = ddlg.getName();
			ddlg.clearDialog();
			boolean isDel = pro.delete(name);
			if (isDel) {
				System.out.println(name+"회원님을 삭제!!");
			}else {
				System.out.println(name+"님은 우리 회원이 아닙니다.!!");
			}
			setTextArea(pro.view());
		}else if (e.getSource()==exit_bt) {
			System.exit(0);
		}
	}
}
