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
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}

class MyButton extends Button{
	private Image img;
	private String menu;
	public MyButton(Image img, String menu) {
		this.img = img;
		this.menu = menu;
	}

	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, this.getWidth()-10, this.getHeight()-30, this);
		g.setFont(new Font("", Font.BOLD, 15));
		g.drawString(menu, 5, this.getHeight()-10);
	}
}

class MyFrame01 extends Frame implements ActionListener{
	private Panel center_p = new Panel();
	private MyButton[] bt = new MyButton[9];
	private Panel east_p = new Panel();
	private TextArea ta = new TextArea();
	private Button ok_bt = new Button("확인");
	
	private String str = new String("주문내역서");
	
	private String[] menu = new String[] {
			"짜장", "짬뽕", "피자", "족발", "보쌈", "치킨", "닭발", "순대", "곱창"};
	private int[] price = new int[] {
			5000, 8000, 20000, 25000, 25000, 20000, 23000, 4000, 15000};
	private Food[] food = new Food[12];
	private ArrayList<Food> list = new ArrayList<>();
	
	private InputDialog indlg = new InputDialog(this, "계산서", true);
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add(center_p);
		center_p.setLayout(new GridLayout(3,3));
		for(int i=0; i<bt.length; ++i) {
			food[i] = new Food(menu[i], price[i]);
			Image img = Toolkit.getDefaultToolkit().getImage("img/food"+(i+1)+".jpg");
			bt[i] = new MyButton(img, menu[i]+" : " + price[i]);
			center_p.add(bt[i]);
			bt[i].addActionListener(this);
		}
		east_p.setPreferredSize(new Dimension(150, 400));
		this.add("East", east_p);
		east_p.setLayout(new BorderLayout());
		east_p.add(ta);
		east_p.add("South", ok_bt);
		ok_bt.addActionListener(this);
		ta.setText(str+"\n");
		ta.append("================\n");
		ta.append("현재금액     0원");
		indlg.input_bt.addActionListener(this);
	}
	public MyFrame01(String title) {
		super(title);
		
		this.init();
		
		super.setSize(450, 400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==ok_bt) {
			indlg.setTextArea(list);
			indlg.setVisible(true);
		}else if(e.getSource()==indlg.input_bt) {
			indlg.setVisible(false);
		}
		for(int i=0; i<bt.length; ++i) {
			if (e.getSource() == bt[i]) {
				list.add(food[i]);
				setView(i);
			}
		}
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

public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("awt연습");
	}
}