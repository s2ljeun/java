
import java.awt.*;
import java.text.DecimalFormat;
import java.util.*;

public class InputDialog extends Dialog{
	private Panel p1 = new Panel();
	
	private Label title_lb = new Label("결재금액", Label.CENTER);
	private TextArea ta = new TextArea();
	private Label price_lb = new Label("총금액 : ", Label.CENTER);

	protected Button input_bt = new Button("확인");
  
	public void setTextArea(ArrayList<Food> list) {
		Hashtable<String, Food> ht = new Hashtable<>();
		for(Food food : list) {
			if (ht.containsKey(food.getName())) {
				Food data = ht.get(food.getName());
				data.setPrice(food.getPrice() + data.getPrice());
			}else {
				ht.put(food.getName(), food);
			}
		}
		Enumeration<String> enu = ht.keys();
		ta.setText("상품\t\t금액\n");
		DecimalFormat df = new DecimalFormat("###,###원");
		int sum = 0;
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			Food food = ht.get(key);
			ta.append(food.getName()+"\t\t"+df.format(food.getPrice())+"\n");
			sum += food.getPrice();
		}
		price_lb.setText("결재금액\t" + df.format(sum));
	}
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", p1);
		p1.setLayout(new BorderLayout());
		p1.add("North", title_lb);
		p1.add("Center", ta);
		p1.add("South", price_lb);
		this.add("South", input_bt);
	}
	
	public InputDialog(Frame owner, 
					String title, boolean modal) {
		super(owner, title, modal);
		
		this.init();
		
		super.setSize(200, 250);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
	}
	
}
