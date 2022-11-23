package review11123;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsFillEx extends JFrame{
	Container contentPane;
	GraphicsFillEx(){
		setTitle("GraphicsFillEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		Mp mp=new Mp();
		contentPane.add(mp);
		setSize(500,500);
		setVisible(true);
	}
	class Mp extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.black);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.green);
			g.fillRoundRect(10, 130, 50, 50, 20, 20);
			g.setColor(Color.magenta);
			g.fillArc(10, 190, 50, 50, 0, 270);
			g.setColor(Color.orange);
			int []x = {30,10,30,50};
			int []y= {255,275,295,275};
			g.fillPolygon(x,y,4);
		}
	}

	public static void main(String[] args) {
		new GraphicsFillEx();

	}

}
