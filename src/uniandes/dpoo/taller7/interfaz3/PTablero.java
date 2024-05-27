package uniandes.dpoo.taller7.interfaz3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PTablero extends JPanel {

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D d2g = (Graphics2D) g;
		d2g.setColor(Color.black);
		d2g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
	
	
}
