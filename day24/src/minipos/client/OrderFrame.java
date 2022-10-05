package minipos.client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.util.*;
import java.io.*;

public class OrderFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;

	private static PosButton[] pos = new PosButton[9];
	static {
		for(int i=0; i<pos.length; ++i) {
			Image img = Toolkit.getDefaultToolkit().
					getImage("image/food"+(i+1)+".jpg");
			pos[i] = new PosButton(img);
		}
	}
	private JPanel p = new JPanel();
	private JTextArea jta = new JTextArea();
	private JScrollPane jsp = new JScrollPane(jta);
	private JButton jbt = new JButton("주문");
	private JPanel p2 = new JPanel();
	
	private OrderProcess pro = new OrderProcess();
	InetAddress ia = null;
	Socket soc = null;
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("Center", p);
		p.setLayout(new GridLayout(3,3));
		for(int i=0; i<pos.length; ++i) {
			p.add(pos[i]);
		}
		
		p2.setPreferredSize(new Dimension(100, 300));
		this.add("East", p2);
		p2.setLayout(new BorderLayout());
		setTextArea();
		p2.add(jsp);
		p2.add("South", jbt);
	}

	public void start() {
		for(int i=0; i<pos.length; ++i) {
			pos[i].addActionListener(this);
		}
		jbt.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	protected void setTextArea() {
		jta.setText(pro.getFood());
	}

	protected void setTable() {
		String tableNumber = null; 
		do{
			tableNumber = JOptionPane.showInputDialog(this, 
							"테이블 번호 : ","번호입력", 
							JOptionPane.QUESTION_MESSAGE);
		}while(tableNumber==null || tableNumber.trim().equals(""));
		this.setTitle(tableNumber+"번 테이블 주문서");
		jta.setText(pro.getFood());
		this.setVisible(true);
	}
	
	public OrderFrame() {
		try {
			ia = InetAddress.getByName("localhost");
			soc = new Socket(ia, 12345);
			oos = new ObjectOutputStream(soc.getOutputStream());
		}catch(Exception e) {}
		
		this.setTable();
		this.init();
		this.start();
		
		
		super.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		super.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<pos.length; ++i) {
			if (e.getSource()==pos[i]) {
				pro.order(i);
				setTextArea();
			}
		}
		if (e.getSource()==jbt) {
			sendOrder();
		}
	}
	
	public void sendOrder() {
		try {
			
			String title = this.getTitle();
			oos.writeUTF(title);
			ArrayList<Food> list = pro.getList();
			oos.writeObject(list);
			oos.flush();
			//this.setVisible(false);
			pro.listClear();
			this.setTextArea();
			this.setTable();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new OrderFrame();
	}
}







