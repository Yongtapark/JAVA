package review11123;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawStringEx2 extends JFrame{
	Container c=getContentPane();
	GraphicsDrawStringEx2(){
		setVisible(true);
		setSize(500,500);
		MP mp=new MP();
		c.add(mp);
	}
	class MP extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("자바가 재미있냐", 20, 20);
			g.setColor(Color.BLUE);
			g.drawString("'별로 재미없다.'에 일동 경악..", 40, 40);
			
			for(int i=1;i<5;i++) {
				g.drawString("자바가 인생의 전부냐?", 40, 60+60*i);
				g.setFont(new Font("고딕",Font.BOLD,i*10));
			}
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawStringEx2();

	}

}
