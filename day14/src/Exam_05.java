import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame05 extends Frame implements ActionListener{
	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("파일");
	private Menu help = new Menu("도움말");
	
	private MenuItem open_f = new MenuItem("파일열기");
	private MenuItem save_f = new MenuItem("파일저장");
	private MenuItem exit_f = new MenuItem("종료");
	private MenuItem ver_h = new MenuItem("버전보기");
	
	private Dialog dlg = new Dialog(this, "알림", true);
	private Label dlg_lb = new Label("버전 1.0입니다.");
	private Button dlg_bt = new Button("확인");
	private Panel dlg_p = new Panel();
	
	public void init() {
		this.setMenuBar(mb);
		mb.add(file);
		mb.add(help);
		
		file.add(open_f);
		open_f.addActionListener(this);
		
		file.add(save_f);
		save_f.addActionListener(this);

		file.addSeparator();
		file.add(exit_f);
		exit_f.addActionListener(this);
		
		help.add(ver_h);
		ver_h.addActionListener(this);
		
		dlg.setLayout(new BorderLayout());
		dlg.add("Center", dlg_lb);
		dlg.add("South", dlg_p);
		dlg_p.setLayout(new FlowLayout());
		dlg_p.add(dlg_bt);

		dlg_bt.addActionListener(this);
	}
	
	public MyFrame05(String title) {
		super(title);
		this.init();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		dlg.setBounds(xpos, ypos, 300, 200);
		dlg.setResizable(false);
		
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == open_f) {
			FileDialog fdlg = new FileDialog(this, "열기", FileDialog.LOAD); // 어디에 , 타이틀, 어떤 창
			fdlg.setVisible(true);
		} else if(e.getSource() == save_f) {
			FileDialog fdlg = new FileDialog(this, "저장", FileDialog.SAVE);
			fdlg.setVisible(true);
		} else if(e.getSource() == exit_f) {
			System.exit(0);
		} else if(e.getSource() == ver_h) {
			dlg.setVisible(true);
		} else if (e.getSource() == dlg_bt) {
//			System.exit(0); // 창만 닫게?
			dlg.setVisible(false);
		}
		
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("awt연습");
	}
}
