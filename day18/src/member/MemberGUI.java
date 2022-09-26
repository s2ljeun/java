package member;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class MemberGUI extends Frame implements ActionListener{
	private JToolBar jtb = new JToolBar();
	private JButton insert_bt = new JButton("�Է�");
	private JButton edit_bt = new JButton("����");
	private JButton delete_bt = new JButton("����");
	private JButton exit_bt = new JButton("����");
	
	private JTabbedPane jtp = new JTabbedPane();
	private JPanel name_jp = new JPanel();
	private JPanel tel_jp = new JPanel();
	private TextArea name_ta = new TextArea();
	private TextArea tel_ta = new TextArea();

	private String title = new String("ȸ �� �� �� �� �� Ʈ");
	private String line = new String("-----------------");
		
	private InputDialog idlg = new InputDialog(this, "ȸ���Է�", true);
	private DeleteDialog ddlg = new DeleteDialog(this, "ȸ������", true);
	private InputDialog edlg = new InputDialog(this, "ȸ������", true);
	
	private MemberPro pro = new MemberProImpl();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", jtb);
		jtb.add(insert_bt);
		jtb.add(edit_bt);
		jtb.add(delete_bt);
		jtb.add(exit_bt);

		setTextArea(pro.view());
		
		this.add("Center", jtp);
		jtp.addTab("�̸�", name_jp);
		jtp.addTab("��ȣ", tel_jp);
		
		name_jp.setLayout(new BorderLayout());
		tel_jp.setLayout(new BorderLayout());
		name_jp.add(name_ta);
		tel_jp.add(tel_ta);
	}
	public void start() {
		insert_bt.addActionListener(this);
		edit_bt.addActionListener(this);
		delete_bt.addActionListener(this);
		exit_bt.addActionListener(this);
		idlg.input_bt.addActionListener(this);
		idlg.cencle_bt.addActionListener(this);
		ddlg.input_bt.addActionListener(this);
		edlg.input_bt.addActionListener(this);
		edlg.cencle_bt.addActionListener(this);
	}
	public void setTextArea(ArrayList<Member> list) {
		name_ta.setText(title + "\n");
		name_ta.append(line + "\n");
		name_ta.append("�̸�\t��ȭ��ȣ\n");
		name_ta.append(line + "\n");
		for(Member mb : list) {
			name_ta.append(mb.getName() + "\t\t" + mb.getTel()+"\n");
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
				JOptionPane.showMessageDialog(this, name+"ȸ������ ����!!", "����", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(this, name+"���� �츮 ȸ���� �ƴմϴ�!!", "�˸�", JOptionPane.WARNING_MESSAGE);
			}
			setTextArea(pro.view());
		}else if (e.getSource()==exit_bt) {
			System.exit(0);
		}else if (e.getSource() == edit_bt) {
			String name = JOptionPane.showInputDialog(this, "������ ȸ���� �̸��� �Է��� �ּ���", "����", 
					JOptionPane.QUESTION_MESSAGE);
			Member mb = pro.isMember(name);
			if (mb == null) {
				JOptionPane.showMessageDialog(this, name+"���� ���� ȸ���� �ƴմϴ�.", 
						"�˸�", JOptionPane.INFORMATION_MESSAGE);
			} else {
				edlg.setMember(mb);
				edlg.setVisible(true);
			}
		}else if (e.getSource() == edlg.input_bt) {
			Member mb = edlg.getMember();
			pro.delete(mb.getName());
			pro.insert(mb);
			edlg.clearDialog();
			setTextArea(pro.view());
			
		}else if (e.getSource() == edlg.cencle_bt) {
			edlg.clearDialog();
		}
	}
}
