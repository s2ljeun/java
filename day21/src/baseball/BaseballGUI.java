package baseball;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class BaseballGUI extends Frame implements ActionListener{
	private BaseballPro pro = new BaseballProImpl();
	String team[] = pro.getTeam();

	private JDesktopPane jdp = new JDesktopPane();
	private JInternalFrame jif[] = new JInternalFrame[10];
	
	private Panel north_p = new Panel();
	private Button team_bt[] = new Button[10];
	private TextArea ta = new TextArea("");
	private Panel south_p = new Panel();
	private Button menu_bt[] = new Button[6];
	private String str[] = new String[] {"입력", "수정", "삭제", "저장", "불러오기", "종료"};
	
	private InputDialog inDlg = new InputDialog(this, "선수등록", true);
	private EditDialog edDlg = new EditDialog(this, "선수수정", true);
	private DeleteDialog deDlg = new DeleteDialog(this, "선수삭제", true);

	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", north_p);
		north_p.setLayout(new GridLayout(1, 10));
		for(int i=0; i<team.length; ++i) {
			team_bt[i] = new Button(team[i]);
			north_p.add(team_bt[i]);
			team_bt[i].addActionListener(this);
		}
		this.add(jdp);
		//this.add(ta);
		this.add("South", south_p);
		south_p.setLayout(new GridLayout(1, 4));
		for(int i=0; i<str.length; ++i) {
			menu_bt[i] = new Button(str[i]);
			south_p.add(menu_bt[i]);
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
		super.setSize(800, 400);
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
		ta.setText(team+"을 선택하셨습니다\n");
		ta.append("=========================\n");
		ta.append("선수\t\t연봉\n");
		ta.append("-------------------------\n");
		for(Player p : list) {
			ta.append(p.getName() + "\t\t" + p.getSalary()+"\n");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==menu_bt[5]) { //종료
			System.exit(0);
		}
		for(int i=0; i<10; ++i) {
			if (e.getSource()==team_bt[i]) {
				String team = team_bt[i].getActionCommand();
				teamPlayerView(team);
				jif[i].setBounds(20,20,150,100);
				jif[i] = new JInternalFrame(team_bt[i].getLabel(), false, true, true, true);
				jif[i].setVisible(true);
				jdp.add(jif[i]);
				jif[i].add(ta);
				return;
			}
		}
		if (e.getSource()==menu_bt[0]) { // 입력
			inDlg.teamSetting(team);
			inDlg.setVisible(true);
		}else if (e.getSource()==menu_bt[1]) { // 수정
			edDlg.teamSetting(team);
			edDlg.setVisible(true);
		}else if (e.getSource()==menu_bt[2]) { // 삭제
			deDlg.teamSetting(team);
			deDlg.setVisible(true);
		}else if (e.getSource()==menu_bt[3]) { // 저장
			pro.save();
			System.out.println("저장완료!");
		}else if (e.getSource()==menu_bt[4]) { // 불러오기
			pro.load();
			System.out.println("불러오기 완료!");
		}
		
		
		if (e.getSource()==inDlg.input_bt) {
			String name = inDlg.getName();
			String team = inDlg.getTeam();
			int salary = inDlg.getSalary();
			Player p = new Player(name, team, salary);
			pro.insert(p);
			teamPlayerView(team);
			inDlg.clearDialog();
		}else if (e.getSource()==inDlg.cencle_bt) {
			inDlg.clearDialog();
		}
		
		if (e.getSource()==edDlg.input_bt) {
			String name = edDlg.getName();
			String team = edDlg.getTeam();
			String tradeTeam = edDlg.getTradeTeam();
			Player p = pro.getPlayer(name, team);
			pro.trade(p, tradeTeam);
			teamPlayerView(tradeTeam);
			edDlg.clearDialog();
		}else if (e.getSource()==edDlg.cencle_bt) {
			edDlg.clearDialog();
		}
		
		if (e.getSource()==deDlg.input_bt) {
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
		new BaseballGUI("야구선수관리");
	}
}
