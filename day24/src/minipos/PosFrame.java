package minipos;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import minipos.client.*;
import java.net.*;
import java.util.*;

public class PosFrame extends JFrame implements Runnable{
	private Container con;
	private JTextArea jta = new JTextArea();
	private JScrollPane jsp = new JScrollPane(jta);
	
	private ServerSocket ss;
	private Socket soc;
	private ObjectInputStream ois = null;
	private Hashtable<String, ArrayList<Food>> ht = new Hashtable<>();
	
	protected void init() {
		con = this.getContentPane();
		con.setLayout(new BorderLayout());
		jta.setEditable(false);
		con.add("Center", jsp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public PosFrame(String title) {
		super(title);
			
		this.init();
		
		super.setSize(400, 300);
		Dimension screen = 
				Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		super.setVisible(true);
		try {
			ss = new ServerSocket(12345);
			soc = ss.accept();
			Thread th = new Thread(this);
			th.start();
		}catch(Exception e) {}
	}
	
	public static void main(String[] args) {
		new PosFrame("포스서버");
	}
	public void print(String msg, ArrayList<Food> list) {
		Hashtable<String, Food> order = new Hashtable<>();
		for(Food food : list) {
			if (order.containsKey(food.getName())) {
				order.get(food.getName()).plusCount();
			}else {
				order.put(food.getName(), food);
			}
		}
		list.clear();
		Enumeration<String> enu = order.keys();
		while(enu.hasMoreElements()) {
			String menu = enu.nextElement();
			list.add(order.get(menu));
		}
		ht.put(msg, list);
		jta.append(msg+"\n");
		for(Food food : list) {
			jta.append(food.getName() + "\t" +food.getCount()+"\t"+ food.getPrice()*food.getCount()+"\n");
		}
	}
	@Override
	public void run() {
		try{
			ois = new ObjectInputStream(soc.getInputStream());
			while(true) {
				String msg = ois.readUTF();
				ArrayList<Food> list = (ArrayList)ois.readObject();
				print(msg, list);
			}
		}catch(Exception e) {}
		
	}
}
