package uniandes.dpoo.taller7.interfaz4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import uniandes.dpoo.taller7.modelo.Tablero;

@SuppressWarnings("serial")
public class PTablero extends JPanel {
    private Tablero tablero;
    private int tamaño;

    public PTablero() {
        this.tablero = new Tablero(5);
        this.tamaño = 5;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                int squareSize = Math.min(getWidth(), getHeight()) / tamaño;
                int row = y / squareSize;
                int col = x / squareSize;
                tablero.jugar(row, col);
                repaint();
            }
        });
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
        tablero = new Tablero(tamaño);
        tablero.desordenar(10);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int squareSize = Math.min(panelWidth, panelHeight) / tamaño;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                Rectangle2D square = new Rectangle2D.Double(i * squareSize, j * squareSize, squareSize, squareSize);
                if (tablero.darTablero()[i][j]) {
                    g2d.setColor(Color.YELLOW);
                } else {
                    g2d.setColor(Color.BLACK);
                }
                g2d.fill(square);
                g2d.setColor(Color.BLACK);
                g2d.draw(square);
            }
        }
    }
    
    public void nuevoJuego() {
        this.tablero = new Tablero(tamaño);
        this.setTamaño(tamaño);
    }

    public void reiniciarJuego() {
        this.tablero.reiniciar();
        this.repaint();
    }
}
