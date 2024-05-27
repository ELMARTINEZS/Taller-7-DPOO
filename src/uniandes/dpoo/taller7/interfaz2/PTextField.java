package uniandes.dpoo.taller7.interfaz2;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PTextField extends JPanel {
	private JLabel jugadas;
	private JTextField text1;
	private JLabel jugador;
	private JTextField text2;
	
	public PTextField() {
		this.jugadas = new JLabel("Jugadas");
		this.text1 = new JTextField();
		this.jugador = new JLabel("Jugador");
		this.text2 = new JTextField();
		this.add(this.jugadas);
		this.add(this.text1);
		this.add(this.jugador);
		this.add(this.text2);
	}
}
