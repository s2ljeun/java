import java.awt.*;
import java.util.*;
import java.awt.event.*;

class MyFrame06 extends Frame implements ActionListener{
	private int year, month, week, lastDay;
	private Calendar cal;
	
	private BorderLayout bl = new BorderLayout();
	private Panel north_p = new Panel();
	private Label north_lb = new Label("");
	private Panel no_east_p = new Panel();
	private Button left_bt = new Button("��");
	private Button right_bt = new Button("��");
	private Panel p = new Panel();
	private Button bt[] = new Button[49];
	private String str[] = new String[] {"��", "��", "ȭ", "��", "��", "��", "��"};
	
	private int co = 0;//��ư�� ��ġ�� ��Ÿ���� ���� ����� ����
	
	public void setCalendar() {
		cal.set(year, month-1, 1);
		week = cal.get(Calendar.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		north_lb.setText(year+"�� " + month+"��");
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
		//���ϼ���
		for(int i=0; i<str.length; ++i) {
			bt[i] = new Button(str[i]);
			p.add(bt[i]);
		}	
		//��¥�� �� ������ �� ��ư���� �Ѵ�
		for(int i=7; i<bt.length; ++i) {
			bt[i] = new Button("");
			p.add(bt[i]);
		}
		buttonSetting();
	}
	
	public void buttonSetting() {
		co = 7;
		//1���� �Ǳ� �� ��ư ����
		for(int i=1; i<week; ++i) {
			bt[co].setLabel("");
			co++;
		}
		//1�Ϻ��� ��������¥���� ��ư ����
		for(int i=1; i<=lastDay; ++i) {
			bt[co].setLabel(String.valueOf(i));
			co++;
		}
		//co��°���� ������ �� ��ư ����
		for(int i=co; i<bt.length; ++i) {
			bt[i].setLabel("");
		}
	}
	
	public MyFrame06(String title) {
		super(title);
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
		}
		setCalendar();
		buttonSetting();
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("awt����");
	}
}