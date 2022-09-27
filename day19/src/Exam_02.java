import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame02 extends JFrame implements ActionListener, MouseListener{
	private JPanel north_jp = new JPanel();
	private JButton start_jbt = new JButton("시작");
	
	private JPanel center_jp = new JPanel();
	private JButton[][] jbt = new JButton[9][9];
	
	private boolean isButton = true;
	private int boomb[][] = new int[9][9];
	private boolean check[][] = new boolean[9][9];
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", north_jp);
		north_jp.setLayout(new BorderLayout());
		north_jp.add("East", start_jbt);
		start_jbt.addActionListener(this);
		con.add("Center", center_jp);
		center_jp.setLayout(new GridLayout(9,9));
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				jbt[i][j] = new JButton("");
				center_jp.add(jbt[i][j]);
				jbt[i][j].addMouseListener(this);
			}
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		isButtonEnable();
	}
	
	public void isButtonEnable() {
		start_jbt.setEnabled(isButton);
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				jbt[i][j].setEnabled(!isButton);
			}
		}
	}
	
	
	public MyFrame02(String title) {
		super(title);
		this.init();
		this.setSize(600,500);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public void buttonSetting() {
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				jbt[i][j].setText("");
				check[i][j] = false;
				boomb[i][j] = 0;
			}
		}
		for(int i=0; i<9; ++i) {
			while(true) {
				int x = (int)(Math.random()*9);//0 ~ 8까지의 수가 나온다
				int y = (int)(Math.random()*9);
				if (boomb[x][y] == 0) {
					boomb[x][y] = 10;
					boomCheck(x, y);
					break;
				}
			}
		}
	}
	
	public void boomCheck(int x, int y) {
		int minI = x - 1; if (minI<0) minI = 0;
		int maxI = x + 1; if (maxI>8) maxI = 8;
		int minJ = y - 1; if (minJ<0) minJ = 0;
		int maxJ = y + 1; if (maxJ>8) maxJ = 8;
		for(int i=minI; i<=maxI; ++i) {
			for(int j=minJ; j<=maxJ; ++j) {
				if (x==i && y==j) continue;
				if (boomb[i][j] == 10) continue;
				boomb[i][j]++;
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start_jbt) {
			isButton = false;
			isButtonEnable();
			buttonSetting();
		}
	}
	public void zeroCheck(int x, int y) {
		check[x][y] = true;
		int minI = x - 1; if (minI<0) minI = 0;
		int maxI = x + 1; if (maxI>8) maxI = 8;
		int minJ = y - 1; if (minJ<0) minJ = 0;
		int maxJ = y + 1; if (maxJ>8) maxJ = 8;
		for(int i=minI; i<=maxI; ++i) {
			for(int j=minJ; j<=maxJ; ++j) {
				if (check[i][j]) continue;
				if (boomb[i][j] == 0) zeroCheck(i, j);
				jbt[i][j].setText(String.valueOf(boomb[i][j]));
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				if (e.getSource() == jbt[i][j]) {
					if (boomb[i][j] == 10) {
						if (e.getButton() == MouseEvent.BUTTON3) {
							jbt[i][j].setText("폭탄");
							check[i][j] = true;
						}else {
							JOptionPane.showMessageDialog(this, "폭탄을 누르셔서 게임을 종료합니다.", 
								"알림", JOptionPane.INFORMATION_MESSAGE);
							isButton = true;
							isButtonEnable();
						}
					}else if (boomb[i][j] == 0) {
						jbt[i][j].setText(String.valueOf(boomb[i][j]));
						zeroCheck(i, j); 
					}else {
						jbt[i][j].setText(String.valueOf(boomb[i][j]));
						check[i][j] = true;
					}
				}
			}
		}
		for(int i=0; i<9; ++i) {
			for (int j=0; j<9; ++j) {
				if (!check[i][j]) return;
			}
		}
		JOptionPane.showMessageDialog(this, "게임을 종료합니다.", 
				"알림", JOptionPane.INFORMATION_MESSAGE);
	}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}
public class Exam_02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("폭탄게임");
	}
}
