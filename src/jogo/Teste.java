package jogo;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import jogo.modelo.Menu;

public class Teste extends JFrame {

	private static final long serialVersionUID = 1L;
	public JFrame frame = new JFrame();
	public GraphicsDevice device;
	DisplayMode displayMode;

	public Teste() {
		super("Fullscreen");
		add(new Menu());
		getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		pack();
		setResizable(false);
		setVisible(true);
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Point p = new Point(0, 0);
				SwingUtilities.convertPointToScreen(p, getContentPane());
				Point l = getLocation();
				l.x -= p.x;
				l.y -= p.y;
				setLocation(l);
			}
		});	
	}

	

	public static void main(String[] args) {
		new Teste();
	}
}