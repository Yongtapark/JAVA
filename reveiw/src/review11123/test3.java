package review11123;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test3 extends JFrame {
	Container contentPane;

	test3() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(250, 250);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		Vector<Point> vs = new Vector<Point>();
		Vector<Point> ve = new Vector<Point>();

		Point startP = null;
		Point endP = null;

		ImageIcon imageIcon = new ImageIcon("src/image/back.jpg");
		Image image = imageIcon.getImage();

		public MyPanel() {

			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					endP = e.getPoint();
					repaint();
				}

				@Override
				public void mouseReleased(MouseEvent e) {

					repaint();

				}
			});
			setLayout(new FlowLayout());
			JButton bj = new JButton("Hello");
			add(bj);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			
				g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
				g.setColor(Color.green);
	
				g.fillOval((int) endP.getX(), (int) endP.getY(), 20, 20);
			

		}
	}

	public static void main(String[] args) {
		new test3();
	}
}
