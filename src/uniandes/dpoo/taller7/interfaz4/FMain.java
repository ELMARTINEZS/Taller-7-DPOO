package uniandes.dpoo.taller7.interfaz4;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import uniandes.dpoo.taller7.modelo.Tablero;

public class FMain extends JFrame {
	private PSizeDif arriba;
	private POptions derecha;
	private PTablero centro;
	private PTextField abajo;
	private Tablero tablero;
	private int size;
	public FMain() {
		setTitle("LightsOut");
		setSize(400,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		this.arriba = new PSizeDif(this);
		this.add(arriba,BorderLayout.NORTH);
		this.derecha = new POptions();
		this.add(derecha,BorderLayout.EAST);
		this.centro = new PTablero();
		this.add(centro,BorderLayout.CENTER);
		this.abajo = new PTextField();
		this.add(abajo,BorderLayout.SOUTH);
		
	}
	
	public void nuevoJuego() {
        this.tablero = new Tablero(size);
        this.centro.setTamaño(size);
    }

    public void reiniciarJuego() {
        this.tablero.reiniciar();
        this.centro.repaint();
    }
    
    public Tablero getTablero() {
        return tablero;
    }
    
	public static void main(String[] args) {
		new FMain();
	}
}
