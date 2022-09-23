package sungjuk;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SungjukGUI extends Frame implements ActionListener{
	private Panel north_p = new Panel();
	
	private Button insert_bt = new Button("입력");
	private Button edit_bt = new Button("수정");
	private Button delete_bt = new Button("삭제");
	
	private String str = new String("이름\t국어\t영어\t총점\t순위\n");
	private TextArea ta = new TextArea();
	
	private SungjukPro pro = new SungjukProImpl();
	private InputDialog indlg = new InputDialog(this, "입력", true);
	
	protected void setView() {
		ArrayList<Student> list = pro.view();
		ta.setText(str);
		for(Student view : list) {
			ta.append(view.getName()+"\t"+
				view.getKor()+"\t"+view.getEng()+"\t"
				+view.getTot()+"\t"+view.getRank()+"\n");
		}
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", north_p);
		north_p.setLayout(new GridLayout(1,3));
		north_p.add(insert_bt);
		insert_bt.addActionListener(this);
		north_p.add(edit_bt);
		north_p.add(delete_bt);
		setView();
		this.add("Center", ta);
		indlg.input_bt.addActionListener(this);
		indlg.cencle_bt.addActionListener(this);
	}
	
	public SungjukGUI(String title) {
		super(title);
		this.init();
		
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
		}else if (indlg.input_bt == e.getSource()) {
			Student st = indlg.getStudent();
			pro.insert(st);
			indlg.clearDialog();
			this.setView();
		}else if (indlg.cencle_bt == e.getSource()) {
			indlg.clearDialog();
		}
		
	}
}
