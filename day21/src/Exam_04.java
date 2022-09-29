//from day14 Exam_6
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;

class MyFrame04 extends Frame implements ActionListener{
	private int year, month, week, lastDay;
	private Calendar cal;
	
	private BorderLayout bl = new BorderLayout();
	private Panel north_p = new Panel();
	private Label north_lb = new Label("");
	private Panel no_east_p = new Panel();
	private Button left_bt = new Button("▲");
	private Button right_bt = new Button("▼");
	private Panel p = new Panel();
	private Button bt[] = new Button[49];
	private String str[] = new String[] {"일", "월", "화", "수", "목", "금", "토"};
	
	private int co = 0;//버튼의 위치를 나타내기 위해 선언된 변수
	
	private Dialog dlg = new Dialog(this, "", true);
	private TextArea dlg_ta = new TextArea();
	private Panel dlg_south_p = new Panel();
	private Button dlg_input_bt = new Button("확인");
	private Button dlg_cencle_bt = new Button("취소");
	
	private File dir, file;
	
	public void setCalendar() {
		cal.set(year, month-1, 1);
		week = cal.get(Calendar.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		north_lb.setText(year+"년 " + month+"월");
	}
	
	public void init() {				
		this.setLayout(bl);
		this.add("North", north_p);
		north_p.setLayout(new BorderLayout());
		north_lb.setFont(new Font("", Font.BOLD, 20));
		north_p.add("Center", north_lb);
		north_p.add("East", no_east_p);
		no_east_p.setLayout(new GridLayout(1,2));
		left_bt.setFont(new Font("", Font.PLAIN, 20));
		right_bt.setFont(new Font("", Font.PLAIN, 20));
		no_east_p.add(left_bt);		left_bt.addActionListener(this);
		no_east_p.add(right_bt);	right_bt.addActionListener(this);
		this.add("Center", p);
		p.setLayout(new GridLayout(7, 7));
		//요일셋팅
		for(int i=0; i<str.length; ++i) {
			bt[i] = new Button(str[i]);
			p.add(bt[i]);
			//bt[i].setEnabled(false);
		}	
		//날짜가 들어갈 공간은 빈 버튼으로 한다
		for(int i=7; i<bt.length; ++i) {
			bt[i] = new Button("");
			p.add(bt[i]);
			bt[i].addActionListener(this);
		}
		buttonSetting();
		dialogSetting();
	}
	
	public void dialogSetting() {
		dlg.setLayout(new BorderLayout());
		dlg.add("Center", dlg_ta);
		dlg.add("South", dlg_south_p);
		dlg_south_p.setLayout(new GridLayout(1,2));
		dlg_south_p.add(dlg_input_bt);	dlg_input_bt.addActionListener(this);
		dlg_south_p.add(dlg_cencle_bt);	dlg_cencle_bt.addActionListener(this);
		dlg.setSize(200, 200);
		dlg.setResizable(false);
	}
	
	public void buttonSetting() {
		co = 7;
		//1일이 되기 전 버튼 셋팅
		for(int i=1; i<week; ++i) {
			bt[co].setLabel("");
			bt[co].setEnabled(false);
			co++;
		}
		//1일부터 마지막날짜까지 버튼 셋팅
		for(int i=1; i<=lastDay; ++i) {
			bt[co].setLabel(String.valueOf(i));
			bt[co].setEnabled(true);
			co++;
			
		}
		//co번째부터 나머지 빈 버튼 셋팅
		for(int i=co; i<bt.length; ++i) {
			bt[i].setLabel("");
			bt[i].setEnabled(false);
		}
	}
	
	public MyFrame04(String title) {
		super(title);
		dir = new File("G:\\jieun\\study\\day21\\src");
		cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		this.setCalendar();
		this.init();
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		dlg.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == left_bt) {
			month--;
			if (month < 1) {
				month = 12;
				year--;
			}
		}else if (e.getSource() == right_bt) {
			month++;
			if (month > 12) {
				month = 1;
				year++;
			}
		}else if (e.getSource() == dlg_input_bt) {
			String msg = dlg_ta.getText();
			try {
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.println(msg);
				pw.close();
			}catch(IOException ee) {}
			dlg_ta.setText("");
			dlg.setVisible(false);
		}else if (e.getSource() == dlg_cencle_bt) {
			dlg_ta.setText("");
			dlg.setVisible(false);
		}
		for(int i=7; i<bt.length; ++i) {
			if (e.getSource()==bt[i]) {
				String filename = String.valueOf(year);
				if (month<10) filename += "0" + month;
				else filename += month;
				String day = e.getActionCommand();
				if (day.length() == 1) filename += "0" + day;
				else filename += day;
				filename += ".txt";
				dlg.setTitle(filename);
				file = new File(dir, filename);
				dlg_ta.setText("");
				try {
					if (file.createNewFile()) {
						dlg.setVisible(true);
					}else {
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						while(true) {
							String msg = br.readLine();
							if (msg == null) break;
							dlg_ta.append(msg);
						}
						dlg.setVisible(true);
					}
				}catch(IOException ee) {}
				
			}
		}
		setCalendar();
		buttonSetting();
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("awt연습");
	}
}