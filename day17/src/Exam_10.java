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
	private String str = new String("주문내역서");
	private Button south_bt = new Button("확인");
	
	private Dialog dlg = new Dialog(this, "확인", true);
	private TextArea dlg_ta = new TextArea();
	
	private String[] menu = new String[] {
			"짜장면", "짬뽕", "잔치국수", "순대국", "뼈해장국", "양평해장국", "소불고기", "냉면", 
			"잡채밥", "김밥", "라면", "쫄면"};
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
		ta.append("현재금액     0원");
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
		dlg_ta.append("총 금액: " + totPrice);
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
		ta.append("현재금액 : "+totPrice+"원");
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		MyFrame10 mf = new MyFrame10("awt연습");
	}
}