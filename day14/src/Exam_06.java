import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyFrame06 extends Frame implements ActionListener{
	private int year, month, week, lastDay;
	private Calendar cal;
	
	private BorderLayout bl = new BorderLayout();
	private Panel north_p = new Panel();
	private Label north_lb = new Label("");

	private Panel north_p_right = new Panel();
	private Button bt_up = new Button("��");
	private Button bt_dn = new Button("��");

	private Panel p = new Panel();
	private Button bt[] = new Button[49];
	private String str[] = new String[] {"��", "��", "ȭ", "��", "��", "��", "��"};

	private int co = 0; // ��ư�� ��ġ
	
	public void setCalendar() {
		cal.set(year, month-1, 1);
		week = cal.get(Calendar.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		north_lb.setText(year+"�� " + month +"��"); // �󺧿� ���� ���� ���ش�
	}
	
	public void init() {
		
		north_lb.setText(year+"�� " + month +"��"); // �󺧿� ���� ���� ���ش�
		
		// ��ü ���̾ƿ�
		this.setLayout(bl);
		this.add("North", north_p);
		
		// North ���̾ƿ�
		north_p.setLayout(new BorderLayout());
		
		// North - center�� label �߰�
		north_p.add("Center", north_lb);
		

		// North - right ���̾ƿ�
		north_p.add("East", north_p_right);
		north_p_right.setLayout(new GridLayout(1,2));
		north_p_right.add(bt_up);
		north_p_right.add(bt_dn);
		
		// �̺�Ʈ ������ �߰�
		bt_up.addActionListener(this);
		bt_dn.addActionListener(this);

		this.add("Center", p);
		p.setLayout(new GridLayout(7,7));
		for(int i=0; i<str.length; i++) {
			bt[co] = new Button(str[i]);
			p.add(bt[co]);
			co++;
		}
		for(int i=1; i<week; ++i) {
			bt[co] = new Button("");
			p.add(bt[co]);
			co++;
		}
		
		for(int i=1; i<=lastDay; ++i) {
			bt[co] = new Button(String.valueOf(i));
			p.add(bt[co]);
			co++;
		}
		
		for(int i=co; i<bt.length; ++i) {
			bt[i] = new Button("");
			p.add(bt[co]);
			co++;
		}
		
	}
	
	public MyFrame06(String title) {
		super(title);

		cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) +1;
		setCalendar();
		
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
		if(e.getSource() == bt_up) {
			month++; // �� ����
			if (month > 12) { // 12���� �Ѿ�� �� �ٲٱ�
				month = 1;
				year++;
			}
			setCalendar();
			

		}else if(e.getSource() == bt_dn) {
			month--; // �� ����
			if (month < 1) { // 1�� ������ ���ư��� �� �ٲٱ�
				month = 12;
				year--;
			}
			setCalendar();
			
		}
		
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("awt����");
	}
}
