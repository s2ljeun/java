import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Food {
	private String name;
	private int price;
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}

class MyFrame10 extends Frame implements ActionListener{
	private Panel center_p = new Panel();
	private Button[] bt = new Button[12];
	private Panel east_p = new Panel();
	private TextArea ta = new TextArea();
	private String str = new String("�ֹ�������");
	private Button south_bt = new Button("Ȯ��");
	
	private Dialog dlg = new Dialog(this, "Ȯ��", true);
	private TextArea dlg_ta = new TextArea();
	
	private String[] menu = new String[] {
			"¥���", "«��", "��ġ����", "���뱹", "�����屹", "�������屹", "�ҺҰ��", "�ø�", 
			"��ä��", "���", "���", "�̸�"};
	private int[] price = new int[] {
			6000, 8000, 5000, 9000, 9000, 9000, 8000, 10000, 10000, 4000, 4500, 7000};
	private Food[] food = new Food[12];
	private ArrayList<Food> list = new ArrayList<>();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add(center_p);
		center_p.setLayout(new GridLayout(4,3));
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new Button(menu[i]);
			center_p.add(bt[i]);
			food[i] = new Food(menu[i], price[i]);
			bt[i].addActionListener(this);
		}
		east_p.setPreferredSize(new Dimension(150, 400));
		this.add("East", east_p);
		east_p.setLayout(new BorderLayout());
		east_p.add(ta);
		ta.setText(str+"\n");
		ta.append("================\n");
		ta.append("����ݾ�     0��");
		east_p.add("South", south_bt);
		south_bt.addActionListener(this);
	}
	public MyFrame10(String title) {
		super(title);
		
		this.init();
		
		super.setSize(450, 400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
		
		dlg.setResizable(false);
		dlg.setSize(200, 300);
		dlg.setLocation(xpos, ypos);
		dlg.add(dlg_ta);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<bt.length; ++i) {
			if (e.getSource() == bt[i]) {
				list.add(food[i]);
				setView(i);
			}
		}
		
		if(e.getSource() == south_bt) {
			setDlgView();
			dlg.setVisible(true);
		}
	}
	
	public void setDlgView() {
		int totPrice = 0;
		for(Food food : list) {
			dlg_ta.append(food.getName());
			totPrice += food.getPrice();
		}
		dlg_ta.append("�� �ݾ�: " + totPrice);
	}
	
	public void setView(int i) {
		int totPrice = 0;
		ta.setText(str+"\n");
		ta.append("================\n");
		for(Food food : list) {
			ta.append(food.getName() + "\t" + food.getPrice()+"\n");
			totPrice += food.getPrice();
		}
		ta.append("-----------------\n");
		ta.append("����ݾ� : "+totPrice+"��");
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		MyFrame10 mf = new MyFrame10("awt����");
	}
}