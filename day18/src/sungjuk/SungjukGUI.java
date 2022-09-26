package sungjuk;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class SungjukGUI extends JFrame implements ActionListener{
	private Container con;
	private JToolBar jtb = new JToolBar();
	private JButton insert_bt = new JButton("입력");
	private JButton edit_bt = new JButton("수정");
	private JButton delete_bt = new JButton("삭제");
	private JButton exit_bt = new JButton("종료");
	
	private String[] title = new String[] {"이름","국어","영어","총점"};
	private JTabbedPane jtp = new JTabbedPane();
	private JPanel jp[] = new JPanel[4];
	/*
	private JPanel name_jp = new JPanel();
	private JPanel kor_jp = new JPanel();
	private JPanel eng_jp = new JPanel();
	private JPanel tot_jp = new JPanel();
	*/
	private String str = new String("이름\t국어\t영어\t총점\t순위\n");
	private JTextArea jta[] = new JTextArea[4];
	
	/*
	private JTextArea name_ta = new JTextArea(str);
	private JTextArea kor_ta = new JTextArea(str);
	private JTextArea eng_ta = new JTextArea(str);
	private JTextArea tot_ta = new JTextArea(str);
	*/
	
	SungjukPro pro = new SungjukProImpl();
	InputDialog indlg = new InputDialog(this, "입력", true);
	EditDialog eddlg = new EditDialog(this, "수정", true);
	
	protected void setView() {
		for(int i=0; i<4; ++i) {
			ArrayList<Student> list = pro.view(i);
			jta[i].setText(str);
			for(Student st : list) {
				jta[i].append(st.getName()+"\t");
				jta[i].append(st.getKor()+"\t");
				jta[i].append(st.getEng()+"\t");
				jta[i].append(st.getTot()+"\t");
				jta[i].append(st.getRank()+"\n");
			}
		}
	}

	public void init() {
		con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtb);
		jtb.add(insert_bt);
		jtb.add(edit_bt);
		jtb.add(delete_bt);
		jtb.addSeparator();
		jtb.add(exit_bt);
		con.add("Center", jtp);
		for(int i=0; i<4; ++i) {
			jp[i] = new JPanel();
			jtp.addTab(title[i], jp[i]);
			jp[i].setLayout(new BorderLayout());
			jta[i] = new JTextArea(str);
			jp[i].add(jta[i]);
		}
	}
	
	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		insert_bt.addActionListener(this);
		edit_bt.addActionListener(this);
		delete_bt.addActionListener(this);
		exit_bt.addActionListener(this);
		indlg.input_bt.addActionListener(this);
		indlg.cencle_bt.addActionListener(this);
		eddlg.input_bt.addActionListener(this);
		eddlg.cencle_bt.addActionListener(this);
	}
	
	public SungjukGUI(String title) {
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
		if (insert_bt == e.getSource()) {
			indlg.setVisible(true);
		}else if (edit_bt == e.getSource()) {
			String name = JOptionPane.showInputDialog(this, "수정할 학생의 이름을 입력 : ", 
					"수정", JOptionPane.QUESTION_MESSAGE);
			Student st = pro.isStudent(name);
			if (st == null) {
				JOptionPane.showMessageDialog(this, name+"님은 저희 학생이 아닙니다.", 
											"알림", JOptionPane.INFORMATION_MESSAGE);
			}else {
				eddlg.setStudent(st);
				eddlg.setVisible(true);
			}
		}else if (delete_bt == e.getSource()) {
			String name = JOptionPane.showInputDialog(this, "삭제할 학생의 이름을 입력 : ", 
										"삭제", JOptionPane.QUESTION_MESSAGE);
			String msg = pro.delete(name);
			JOptionPane.showMessageDialog(this, msg, "알림", JOptionPane.INFORMATION_MESSAGE);
			setView();
		}else if (exit_bt == e.getSource()) {
			System.exit(0);
		}else if (indlg.input_bt == e.getSource()) {
			Student st = indlg.getStudent();
			indlg.clearDialog();
			pro.insert(st);
			setView();
		}else if (indlg.cencle_bt == e.getSource()) {
			indlg.clearDialog();
		}else if (eddlg.cencle_bt == e.getSource()) {
			eddlg.clearDialog();
		}else if (eddlg.input_bt == e.getSource()) {
			Student st = eddlg.getStudent();
			eddlg.clearDialog();
			pro.delete(st.getName());
			pro.insert(st);
			setView();
		}
	}
}




