package baseball;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class BaseballGUI extends Frame implements ActionListener{
	private BaseballPro pro = new BaseballProImpl();
	String team[] = pro.getTeam();
	
	private JToolBar jtb_north = new JToolBar();
	private JButton team_bt[] = new JButton[10];
	
	private JTextArea ta = new JTextArea();
	
	private JToolBar jtb_south = new JToolBar();
	private JButton menu_bt[] = new JButton[4];
	private String str[] = new String[] {"�Է�", "����", "����", "����"};
	
	private InputDialog inDlg = new InputDialog(this, "�������", true);
	private EditDialog edDlg = new EditDialog(this, "��������", true);
	private DeleteDialog deDlg = new DeleteDialog(this, "��������", true);

	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", jtb_north);
		for(int i=0; i<team.length; ++i) {
			team_bt[i] = new JButton(team[i]);
			jtb_north.add(team_bt[i]);
			team_bt[i].addActionListener(this);
		}

		ta.setFont(new Font("", Font.PLAIN, 20));
		this.add(ta);
		ta.setText("���� �������ּ���.");

		this.add("South", jtb_south);
		for(int i=0; i<str.length; ++i) {
			menu_bt[i] = new JButton(str[i]);
			jtb_south.add(menu_bt[i]);
			menu_bt[i].addActionListener(this);
		}
	}
	public void start() {
		inDlg.input_bt.addActionListener(this);
		inDlg.cencle_bt.addActionListener(this);
		edDlg.input_bt.addActionListener(this);
		edDlg.cencle_bt.addActionListener(this);
		deDlg.input_bt.addActionListener(this);
		deDlg.cencle_bt.addActionListener(this);
	}
	
	public BaseballGUI(String title) {
		super(title);
		this.init();
		this.start();
		super.setSize(400, 400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	
	protected void teamPlayerView(String team) {
		ArrayList<Player> list = pro.view(team);
		Collections.sort(list);
		ta.setText(team+"�� �����ϼ̽��ϴ�\n");
		ta.append("=========================\n");
		ta.append("����\t\t����\n");
		ta.append("-------------------------\n");
		for(Player p : list) {
			ta.append(p.getName() + "\t\t" + p.getSalary()+"\n");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==menu_bt[3]) {
			System.exit(0);
		}
		for(int i=0; i<10; ++i) {
			if (e.getSource()==team_bt[i]) {
				String team = team_bt[i].getActionCommand();
				teamPlayerView(team);
				return;
			}
		}
		if (e.getSource()==menu_bt[0]) {
			inDlg.teamSetting(team);
			inDlg.setVisible(true);
		}else if (e.getSource()==menu_bt[1]) {
			edDlg.teamSetting(team);
			edDlg.setVisible(true);
		}else if (e.getSource()==menu_bt[2]) {
			deDlg.teamSetting(team);
			deDlg.setVisible(true);
		}if (e.getSource()==inDlg.input_bt) {
			String name = inDlg.getName();
			String team = inDlg.getTeam();
			int salary = inDlg.getSalary();
			Player p = new Player(name, team, salary);
			pro.insert(p);
			teamPlayerView(team);
			inDlg.clearDialog();
		}else if (e.getSource()==inDlg.cencle_bt) {
			inDlg.clearDialog();
		}if (e.getSource()==edDlg.input_bt) {
			String name = edDlg.getName();
			String team = edDlg.getTeam();
			String tradeTeam = edDlg.getTradeTeam();
			Player p = pro.getPlayer(name, team);
			pro.trade(p, tradeTeam);
			teamPlayerView(tradeTeam);
			edDlg.clearDialog();
		}else if (e.getSource()==edDlg.cencle_bt) {
			edDlg.clearDialog();
		}if (e.getSource()==deDlg.input_bt) {
			String name = deDlg.getName();
			String team = deDlg.getTeam();
			pro.delete(team, name);
			teamPlayerView(team);
			deDlg.clearDialog();
		}else if (e.getSource()==deDlg.cencle_bt) {
			deDlg.clearDialog();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new BaseballGUI("�߱���������");
	}
}
