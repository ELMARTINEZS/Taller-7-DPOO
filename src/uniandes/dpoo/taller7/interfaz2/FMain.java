package uniandes.dpoo.taller7.interfaz2;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import uniandes.dpoo.taller7.interfaz2.POptions;
import uniandes.dpoo.taller7.interfaz2.PSizeDif;
import uniandes.dpoo.taller7.interfaz3.PTablero;

public class FMain extends JFrame {
	private PSizeDif arriba;
	private POptions derecha;
	private PTextField abajo;
	public FMain() {
		setTitle("LightsOut");
		setSize(400,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		this.arriba = new PSizeDif();
		this.add(arriba,BorderLayout.NORTH);
		this.derecha = new POptions();
		this.add(derecha,BorderLayout.EAST);
		this.abajo = new PTextField();
		this.add(abajo,BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		new FMain();
	}
}
