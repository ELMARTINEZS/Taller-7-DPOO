package uniandes.dpoo.taller7.interfaz4;

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
		this.text1.setPreferredSize(new Dimension(100,20));
		this.jugador = new JLabel("Jugador");
		this.text2 = new JTextField();
		this.text2.setPreferredSize(new Dimension(100,20));
		this.add(this.jugadas);
		this.add(this.text1);
		this.add(this.jugador);
		this.add(this.text2);
	}
}
