package kiloboltgame;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StartingClass extends Applet implements Runnable, KeyListener {

	@Override
	public void init() {
		setSize(800, 480);
		setBackground(Color.BLACK);
		setFocusable(true);
		addKeyListener(this);
		Frame frame = (Frame) this.getParent().getParent();
		frame.setTitle("Q-Bot Alpha");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void stop() {

	}

	@Override
	public void destroy() {

	}

	// Pertains to the "implements Runnable" call at the top.
	// 'run' method is required for ALL threads.
	@Override
	public void run() {

		while (true) {
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			System.out.println("Move UP");
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("Move DOWN");
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("Move LEFT");
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("Move RIGHT");
			break;
		case KeyEvent.VK_SPACE:
			System.out.println("JUMP");
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			System.out.println("Stop moving UP");
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("Stop moving DOWN");
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("Stop moving LEFT");
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("Stop moving RIGHT");
			break;
		case KeyEvent.VK_SPACE:
			System.out.println("Stop JUMPING");
			break;
		}

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
