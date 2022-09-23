import java.awt.*;

class MyButton001 extends Button{
	private Image img = Toolkit.getDefaultToolkit().getImage("img/food1.jpg");
	String price = "6000¿ø";
	
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, this.getWidth()-10, this.getHeight()-60, this);
		g.setFont(new Font("", Font.BOLD, 20));
		g.drawString(price, 0, this.getHeight()-50);
	}
}

class MyFrame002 extends Frame{
	MyButton001 mb = new MyButton001();
	
	public MyFrame002(String title) {
		super(title);
		this.add(mb);
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}

public class Test {
	public static void main(String[] args) {
		MyFrame002 mf = new MyFrame002("awt¿¬½À");
	}
}
