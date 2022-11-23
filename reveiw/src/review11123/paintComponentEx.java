package review11123;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

public class paintComponentEx extends JFrame{
	Container contentPane;
	public paintComponentEx() {
		setTitle("paintComponentEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		MB b=new MB("new Button");
		b.setOpaque(true);
		b.setBackground(Color.cyan);
		contentPane.add(b);
		setSize(250,200);
		setVisible(true);
	}
	class MB extends JButton{
		MB(String s){
			super(s);
		}
		@Override
		public void paintComponents(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponents(g);
			g.setColor(Color.red);
			g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1);
		}
	}

	public static void main(String[] args) {
		new paintComponentEx();

	}

}
