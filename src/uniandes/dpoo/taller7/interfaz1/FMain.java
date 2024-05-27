package uniandes.dpoo.taller7.interfaz1;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import uniandes.dpoo.taller7.interfaz2.POptions;
import uniandes.dpoo.taller7.interfaz2.PSizeDif;
import uniandes.dpoo.taller7.interfaz2.PTextField;
import uniandes.dpoo.taller7.interfaz3.PTablero;

public class FMain extends JFrame {
	public FMain() {
		setTitle("LightsOut");
		setSize(400,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		
	}
	public static void main(String[] args) {
		new FMain();
	}
}
