package minipos.client;

import java.awt.*;
import javax.swing.*;
public class PosButton extends Button{
	private Image img;
	public PosButton(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 4, 4, getWidth()-8, getHeight()-8, this);
	}
}
