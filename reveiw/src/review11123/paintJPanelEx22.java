package review11123;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanelEx22 extends JFrame{
	Container contentPane;
	public paintJPanelEx22() {
		contentPane=getContentPane();
		Mp mp=new Mp();
		contentPane.add(mp);
		setSize(500,500);
		setVisible(true);
	}
	class Mp extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.drawRect(90, 90, 50, 50);
		}
	}
	public static void main(String[] args) {
		new paintJPanelEx22();

	}

}
