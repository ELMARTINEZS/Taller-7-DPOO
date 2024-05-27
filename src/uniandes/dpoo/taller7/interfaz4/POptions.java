package uniandes.dpoo.taller7.interfaz4;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class POptions extends JPanel {
	private JButton [] botones = new JButton[4];

	public POptions() {
		this.setLayout(new GridLayout(0,1));
		String[] opciones = {"NUEVO","REINICIAR","TOP-10","CAMBIAR JUGADOR"};
		for(int i = 0; i <4;i++) {
			this.botones[i] = new JButton(opciones[i]);
			this.add(this.botones[i]);
			this.botones[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String opcion = (String) e.getSource();
					if(opcion.equals("NUEVO")) {
						
					}
					else if(opcion.equals("REINICIAR")){
						
					}
					else if(opcion.equals("TOP-10")) {
						
					}
					else if(opcion.equals("CAMBIAR JUGADOR")) {
						
					}
				}
			});
		}
	}
}


