package baseball;

import java.awt.*;
import java.awt.event.*;

public class BaseballGUI extends Frame implements ActionListener {
	private Panel north_p = new Panel();
	private Button[] north_bt = new Button[10];
	private String[] club_str = new String[]{"SSG", "LG", "KT", "키움", "기아", "NC", "롯데", "삼성", "두산", "한화"};

	private TextArea ta = new TextArea();
	private String str = new String("선수\t\t\t연봉\n");

	private Panel south_p = new Panel();
	private Button input_bt = new Button("입력");
	private Button edit_bt = new Button("수정");
	private Button delete_bt = new Button("삭제");
	private Button exit_bt = new Button("종료");
	
	private BaseballPro pro = new BaseballProImpl(); // 이게 뭐지 > proImpl 객체생성자 근데 왜 앞에는 pro?

	private InputDialog indlg = new InputDialog(this, "입력", true);
	private EditDialog eddlg = new EditDialog(this, "수정", true);
	private DeleteDialog dtdlg = new DeleteDialog(this, "삭제", true);
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", north_p);
		north_p.setLayout(new GridLayout(1,5));
		for(int i=0; i<north_bt.length; ++i) {
			north_bt[i] = new Button();
			north_p.add(north_bt[i]);
			north_bt[i].setLabel(club_str[i]);
			north_bt[i].addActionListener(this); //액션리스너
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
	
	public void start() { //액션리스너 더하기
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
				ta.append(north_bt[i].getLabel() + "클릭\n");
			}
		}
		
		if(e.getSource() == input_bt) {
			indlg.setVisible(true);
		}  else if(e.getSource() == indlg.input_bt) { // 입력 - 확인
			pro.insert();
		} else if(e.getSource() == indlg.cancle_bt) { // 입력 - 취소
			indlg.clearDialog();
		} else if(e.getSource() == edit_bt) {
			eddlg.setVisible(true);
		} else if(e.getSource() == eddlg.input_bt) { // 수정 - 확인
			System.out.print("선수 수정!");
		} else if(e.getSource() == eddlg.cancle_bt) { // 수정 - 취소
			eddlg.clearDialog();
		} else if(e.getSource() == delete_bt) {
			dtdlg.setVisible(true);
		} else if(e.getSource() == dtdlg.delete_bt) { // 삭제 - 삭제
			System.out.print("선수 삭제!");
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
