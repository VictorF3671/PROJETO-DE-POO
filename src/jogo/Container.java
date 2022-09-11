package jogo;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import jogo.modelo.Menu;

public class Container extends JFrame {

	private static final long serialVersionUID = 1L;
	public GraphicsDevice device;

	public void setFullScreen(DisplayMode displayMode) {
		GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		device = environment.getDefaultScreenDevice();

		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Menu());
		frame.setUndecorated(true);
		frame.setIgnoreRepaint(false);
		frame.setResizable(false);

		device.setFullScreenWindow(frame);

		if (displayMode != null && device.isDisplayChangeSupported()) {
			setDisplayMode(displayMode);
			frame.setSize(displayMode.getWidth(), displayMode.getHeight());
		}

		frame.createBufferStrategy(2);
		sleep(500);
	}

	private void sleep(int i) {
	}

	private void setDisplayMode(DisplayMode displayMode) {
	}

	public static void main(String[] args) {
		Container teste = new Container();
		teste.setFullScreen(null);

	}
}
