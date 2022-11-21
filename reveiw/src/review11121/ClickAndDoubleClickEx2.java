package review11121;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClickAndDoubleClickEx2 extends JFrame {
	JPanel jp = new JPanel();

	ClickAndDoubleClickEx2() {
		setTitle("ClickAndDoubleClickEx2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);
		jp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getClickCount() == 2) {
					int r = (int) (Math.random() * 256);
					int g = (int) (Math.random() * 256);
					int b = (int) (Math.random() * 256);
					jp.setBackground(new Color(r, g, b));
				}

			}
		});
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ClickAndDoubleClickEx2();

	}

}
