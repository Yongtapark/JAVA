package review11123;

import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineEx extends JFrame{
	Container c =getContentPane();
	public GraphicsDrawLineEx() {
		setTitle(getTitle());
		MP mp =new MP();
		c.add(mp);
		setVisible(true);
		setSize(500,500);
	}
	class MP extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawLine(20, 20, 500, 500);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawLineEx();

	}

}
