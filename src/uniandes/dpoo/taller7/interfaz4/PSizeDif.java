package uniandes.dpoo.taller7.interfaz4;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class PSizeDif extends JPanel{
	private JLabel Tama�o;
	private JComboBox<String> opciones;
	private JRadioButton [] botones = new JRadioButton [3];
	
	
	public PSizeDif() {
		setLayout(new FlowLayout());
		Tama�o = new JLabel("Tama�o");
		this.add(Tama�o,FlowLayout.LEFT);
		String [] tama�os = {"5x5", "6x6", "7x7"};
		this.opciones = new JComboBox<String>(tama�os);
		this.add(this.opciones);
		String[] tipos = {"Facil","Medio","Dificil"};
		for (int i = 0; i<3; i++) {
			this.botones[i] = new JRadioButton(tipos[i]);
			add(botones[i]);
		}
	
	}
}
