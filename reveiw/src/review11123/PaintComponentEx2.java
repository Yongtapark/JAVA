package review11123;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintComponentEx2 extends JFrame {
	Container c=getContentPane();
	PaintComponentEx2(){
		MP mp=new MP("new button");
		setVisible(true);
		setSize(500,500);
		add(mp);
		setLayout(new FlowLayout());
		mp.setOpaque(true);
		mp.setBackground(Color.yellow);
		mp.setForeground(Color.red);
		
	}
	class MP extends JButton{
		MP(String s){
			super(s);
		}
		@Override
		public void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawOval(0, 0, this.getWidth()-1, this.getWidth()-1);
		}
	}
	public static void main(String[] args) {
		new PaintComponentEx2();

	}

}
