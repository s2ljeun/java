package baseball;
import java.awt.*;
import java.awt.event.*;

public class BaseballGUI extends Frame implements ActionListener{
	private BaseballPro pro = new BaseballProImpl();
	String team[] = pro.getTeam();
	
	private Panel north_p = new Panel();
	private Button team_bt[] = new Button[10];
	private TextArea ta = new TextArea("팀을 선택해 주세요");
	private Panel south_p = new Panel();
	private Button menu_bt[] = new Button[4];
	private String str[] = new String[] {"입력", "수정", "삭제", "종료"};
	
	private InputDialog idlg = new InputDialog(this, "선수등록", true);
	private EditDialog edlg = new EditDialog(this, "선수수정", true);
	private DeleteDialog ddlg = new DeleteDialog(this, "선수삭제", true);
		
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", north_p);
		north_p.setLayout(new GridLayout(1, 10));
		for(int i=0; i<team.length; ++i) {
			team_bt[i] = new Button(team[i]);
			north_p.add(team_bt[i]);
			team_bt[i].addActionListener(this);
		}
		ta.setFont(new Font("", Font.PLAIN, 20));
		this.add(ta);
		this.add("South", south_p);
		south_p.setLayout(new GridLayout(1, 4));
		for(int i=0; i<str.length; ++i) {
			menu_bt[i] = new Button(str[i]);
			south_p.add(menu_bt[i]);
			menu_bt[i].addActionListener(this);
		}
	}
	
	public BaseballGUI(String title) {
		super(title);
		this.init();
		super.setSize(800, 400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<10; ++i) {
			if (e.getSource()==team_bt[i]) {
				String team = team_bt[i].getActionCommand();
				ta.setText(team+"을 선택하셨습니다");
				return;
			}
		}
		if (e.getSource()==menu_bt[0]) {
			idlg.teamSetting(team);
			idlg.setVisible(true);
		}else if (e.getSource()==menu_bt[3]) {
			System.exit(0);
		}else if (e.getSource()==menu_bt[1]) {
			edlg.teamSetting(team);
			edlg.setVisible(true);
		}else if (e.getSource()==menu_bt[2]) {
			ddlg.teamSetting(team);
			ddlg.setVisible(true);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new BaseballGUI("야구선수관리");
	}
}
