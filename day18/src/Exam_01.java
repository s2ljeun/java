import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame01 extends JFrame implements ActionListener{
	private JButton jbt = new JButton("Ȯ��");
	
	public void init() {
		Color color = JColorChooser.showDialog(this, "��������!!", Color.GREEN);
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
		int res = JOptionPane.showConfirmDialog(this, "������ �����Ͻðڽ��ϱ�?", "����", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (res==0) {
			System.out.println("������....");
		}else {
			System.out.println("�������");
		}
		/*
		String name = JOptionPane.showInputDialog(this, "�̸��� �Է��� �ּ���", "�Է�", 
				JOptionPane.QUESTION_MESSAGE);
		System.out.println("name = " + name);
		/*
		 * JOptionPane.showMessageDialog(this, "�ȳ��ϼ���. swing�����ð��Դϴ�.", "�˸�",
		 * JOptionPane.QUESTION_MESSAGE);
		 */
		
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("swing����");
	}
}
