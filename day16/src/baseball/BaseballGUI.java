package baseball;

import java.awt.*;
import java.awt.event.*;

public class BaseballGUI extends Frame implements ActionListener {
	private Panel north_p = new Panel();
	private Button[] north_bt = new Button[10];
	private String[] club_str = new String[]{"SSG", "LG", "KT", "Ű��", "���", "NC", "�Ե�", "�Ｚ", "�λ�", "��ȭ"};

	private TextArea ta = new TextArea();
	private String str = new String("����\t\t\t����\n");

	private Panel south_p = new Panel();
	private Button input_bt = new Button("�Է�");
	private Button edit_bt = new Button("����");
	private Button delete_bt = new Button("����");
	private Button exit_bt = new Button("����");
	
	private BaseballPro pro = new BaseballProImpl(); // �̰� ���� > proImpl ��ü������ �ٵ� �� �տ��� pro?

	private InputDialog indlg = new InputDialog(this, "�Է�", true);
	private EditDialog eddlg = new EditDialog(this, "����", true);
	private DeleteDialog dtdlg = new DeleteDialog(this, "����", true);
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", north_p);
		north_p.setLayout(new GridLayout(1,5));
		for(int i=0; i<north_bt.length; ++i) {
			north_bt[i] = new Button();
			north_p.add(north_bt[i]);
			north_bt[i].setLabel(club_str[i]);
			north_bt[i].addActionListener(this); //�׼Ǹ�����
		}
		
		this.add("Center", ta);
		ta.setText(str);
		
		this.add("South", south_p);	
		south_p.setLayout(new GridLayout(1,4));
		south_p.add(input_bt);
		
		south_p.add(edit_bt);
		south_p.add(delete_bt);
		south_p.add(exit_bt);
	}
	
	public void start() { //�׼Ǹ����� ���ϱ�
		input_bt.addActionListener(this);
		indlg.input_bt.addActionListener(this);
		indlg.cancle_bt.addActionListener(this);

		edit_bt.addActionListener(this);
		eddlg.input_bt.addActionListener(this);
		eddlg.cancle_bt.addActionListener(this);
		
		delete_bt.addActionListener(this);
		dtdlg.delete_bt.addActionListener(this);

		exit_bt.addActionListener(this);
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<north_bt.length; ++i) {
			if(e.getSource() == north_bt[i]) {
				ta.append(north_bt[i].getLabel() + "Ŭ��\n");
			}
		}
		
		if(e.getSource() == input_bt) {
			indlg.setVisible(true);
		}  else if(e.getSource() == indlg.input_bt) { // �Է� - Ȯ��
			pro.insert();
		} else if(e.getSource() == indlg.cancle_bt) { // �Է� - ���
			indlg.clearDialog();
		} else if(e.getSource() == edit_bt) {
			eddlg.setVisible(true);
		} else if(e.getSource() == eddlg.input_bt) { // ���� - Ȯ��
			System.out.print("���� ����!");
		} else if(e.getSource() == eddlg.cancle_bt) { // ���� - ���
			eddlg.clearDialog();
		} else if(e.getSource() == delete_bt) {
			dtdlg.setVisible(true);
		} else if(e.getSource() == dtdlg.delete_bt) { // ���� - ����
			System.out.print("���� ����!");
		} else if(e.getSource() == exit_bt) {
			System.exit(0);
		}
	}
	
		
	
	public BaseballGUI(String title) {
		super(title);
		this.start();
		this.init();
		
		super.setSize(600, 400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}

}
