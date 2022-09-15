// ��
import java.awt.*;

class MyFrame16 extends Frame{
	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("����");
	private Menu edit = new Menu("����");
	private Menu help = new Menu("����");
	
	private MenuItem new_f = new MenuItem("������");
	private MenuItem open_f = new MenuItem("���Ͽ���");
	private MenuItem save_f = new MenuItem("��������");
	private MenuItem exit_f = new MenuItem("����");
	
	private Menu color_e = new Menu("������");
	private Menu size_e = new Menu("ũ�⼱��");
	
	private CheckboxMenuItem red = new CheckboxMenuItem("������");
	private CheckboxMenuItem green = new CheckboxMenuItem("���");
	private CheckboxMenuItem blue = new CheckboxMenuItem("�Ķ���");
	
	public void init() {
		this.setMenuBar(mb);
		mb.add(file);
		file.add(new_f);
		file.addSeparator();
		file.add(open_f);
		file.add(save_f);
		file.addSeparator();
		file.add(exit_f);
		
		mb.add(edit);
		edit.add(color_e);
		edit.addSeparator();
		edit.add(size_e);
		color_e.add(red);
		color_e.add(green);
		color_e.add(blue);
		mb.add(help);
	}
	
	public MyFrame16(String title) {
		super(title);
		this.init();
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		
		super.setVisible(true);
	}
}

public class Exam_16 {
	public static void main(String[] args) {
		MyFrame16 mf = new MyFrame16("awt����");
	}
}