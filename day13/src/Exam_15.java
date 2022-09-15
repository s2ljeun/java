import java.awt.*;

class MyFrame15 extends Frame{
	
	private FileDialog fdlg = new FileDialog(this, "저장", FileDialog.LOAD);
	//FileDialog.LOAD : 열기, FileDialog.SAVE : 저장
	
	public MyFrame15(String title) {
		super(title);
		
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		fdlg.setVisible(true);
	}
}

public class Exam_15 {
	public static void main(String[] args) {
		MyFrame15 mf = new MyFrame15("awt연습");
	}
}