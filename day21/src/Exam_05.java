// frame 안에 frame: JInternalFrame
// -> JDesktopPane 위에 올려놓고 쓰라
// Container > JDesktopPane
import java.awt.*;
import javax.swing.*;

class MyFrame05 extends JFrame{
	private JDesktopPane jtp = new JDesktopPane();
	private JInternalFrame jif1 = new JInternalFrame("1번", true, true, true, true); // 타이틀, 크기조절, 닫을 수 있는지, 최대화, 최소화
	private JInternalFrame jif2 = new JInternalFrame("2번", false, true, true, true);
	private JInternalFrame jif3 = new JInternalFrame("3번", true, false, true, true);
	private JInternalFrame jif4 = new JInternalFrame("4번", true, true, false, true);
	private JInternalFrame jif5 = new JInternalFrame("5번", true, true, true, false);
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(jtp); // center
		jif1.setBounds(20, 20, 150, 100); // 시작점, 시작점, 가로, 세로 (사각형)
		jif2.setBounds(20, 40, 150, 100);
		jif3.setBounds(20, 60, 150, 100);
		jif4.setBounds(20, 80, 150, 100);
		jif5.setBounds(20, 100, 150, 100);
		jif1.setVisible(true);
		jif2.setVisible(true);
		jif3.setVisible(true);
		jif4.setVisible(true);
		jif5.setVisible(true);
		jtp.add(jif1);
		jtp.add(jif2);
		jtp.add(jif3);
		jtp.add(jif4);
		jtp.add(jif5);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame05(String title) {
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

}
public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("swing예제");
	}
}
