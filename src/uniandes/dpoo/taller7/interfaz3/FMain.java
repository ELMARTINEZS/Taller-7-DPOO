package uniandes.dpoo.taller7.interfaz3;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FMain extends JFrame {
	private PSizeDif arriba;
	private POptions derecha;
	private PTablero centro;
	private PTextField abajo;
	public FMain() {
		setTitle("LightsOut");
		setSize(400,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		this.arriba = new uniandes.dpoo.taller7.interfaz3.PSizeDif() ;
		this.add(arriba,BorderLayout.NORTH);
		this.derecha = new POptions();
		this.add(derecha,BorderLayout.EAST);
		this.centro = new PTablero();
		this.add(centro,BorderLayout.CENTER);
		this.abajo = new PTextField();
		this.add(abajo,BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		new FMain();
	}
}
