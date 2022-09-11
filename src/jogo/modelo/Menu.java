package jogo.modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Menu extends JPanel {

	private static final long serialVersionUID = 1L;
	private Image fundo;

	public Menu() {
		setFocusable(true);
		setDoubleBuffered(true);
		ImageIcon referencia = new ImageIcon("texturas\\paisagem.jpg");
		fundo = referencia.getImage();
	}

	public void paint(Graphics g) {
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
		g.dispose();
	}

}
