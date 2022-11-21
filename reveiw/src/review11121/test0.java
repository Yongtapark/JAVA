package review11121;

import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test0 extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel();;

	test0() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);

		contentPane.addMouseWheelListener(new MyMouseListener());

		la = new JLabel("자바 재미있어?");
		contentPane.add(la);
		setSize(300, 200);
		setVisible(true);
	}

	class MyMouseListener implements MouseWheelListener {

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int n = e.getWheelRotation();
			int size = la.getFont().getSize();
			if (n < 0) {
				size += 5;
				System.out.println(size);
			} else {
				size -= 5;
				System.out.println(size);
			}
			la.setFont(new Font("굴림",3, size));
		}

	}

	public static void main(String[] args) {
		new test0();

	}

}
