package review11121;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlyingTextEx2 extends JFrame {
	JPanel jp = new JPanel();
	JLabel jl = new JLabel("안녕");
	final int FLYING_UNIT = 10;

	FlyingTextEx2() {
		setTitle("상하좌우키이용하여 텍스트 무브무브");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);
		jl.setLayout(null);
		jp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_UP:
					jl.setLocation(jl.getX(), jl.getY() - FLYING_UNIT);break;
				case KeyEvent.VK_DOWN:
					jl.setLocation(jl.getX(), jl.getY() + FLYING_UNIT);break;
				case KeyEvent.VK_LEFT:
					jl.setLocation(jl.getX() - FLYING_UNIT, jl.getY());break;
				case KeyEvent.VK_RIGHT:
					jl.setLocation(jl.getX() + FLYING_UNIT, jl.getY());break;
				}
			}
		});
		jl.setLocation(50, 50);
		jl.setSize(100, 20);
		jp.add(jl);
		jl.setLayout(null);
		
		setSize(500, 500);
		setVisible(true);
		jp.requestFocus();
	}

	public static void main(String[] args) {
		new FlyingTextEx2();

	}

}
