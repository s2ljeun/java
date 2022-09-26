import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame01 extends JFrame implements ActionListener{
	private JButton jbt = new JButton("확인");
	
	public void init() {
		Color color = JColorChooser.showDialog(this, "색을골라봐!!", Color.GREEN);
		Container con = this.getContentPane();
		con.setBackground(color);
		con.setLayout(new BorderLayout());
		con.add("South", jbt);
		jbt.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame01(String title) {
		super(title);
		this.init();
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*
		int res = JOptionPane.showConfirmDialog(this, "정말로 삭제하시겠습니까?", "삭제", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (res==0) {
			System.out.println("삭제중....");
		}else {
			System.out.println("삭제취소");
		}
		/*
		String name = JOptionPane.showInputDialog(this, "이름을 입력해 주세요", "입력", 
				JOptionPane.QUESTION_MESSAGE);
		System.out.println("name = " + name);
		/*
		 * JOptionPane.showMessageDialog(this, "안녕하세요. swing수업시간입니다.", "알림",
		 * JOptionPane.QUESTION_MESSAGE);
		 */
		
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("swing예제");
	}
}
