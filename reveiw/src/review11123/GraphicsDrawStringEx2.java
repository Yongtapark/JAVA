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
			g.drawString("�ڹٰ� ����ֳ�", 20, 20);
			g.setColor(Color.BLUE);
			g.drawString("'���� ��̾���.'�� �ϵ� ���..", 40, 40);
			
			for(int i=1;i<5;i++) {
				g.drawString("�ڹٰ� �λ��� ���γ�?", 40, 60+60*i);
				g.setFont(new Font("���",Font.BOLD,i*10));
			}
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawStringEx2();

	}

}
