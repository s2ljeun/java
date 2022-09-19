import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Meal {
}

class MyFrame001 extends Frame implements ActionListener{
	private Panel center_p = new Panel();
	
	private Panel east_p = new Panel();
	private TextArea ta = new TextArea();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", center_p);
		this.add("East", east_p);
		east_p.setLayout(new BorderLayout()); // textarea 사이즈를 잡아주기 위해
		east_p.add(ta);
	}

	
	public MyFrame001(String title) {
		super(title);
		
		this.init();
		
		super.setSize(1000, 400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	public void setView(int i) {
	}
}

public class practice1 {
	public static void main(String[] args) {
		MyFrame001 mf = new MyFrame001("연습");
	}
}