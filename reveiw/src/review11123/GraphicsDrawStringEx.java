package review11123;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawStringEx extends JFrame{
	Container contentPane;
	GraphicsDrawStringEx(){
		setTitle("GraphicsDrawStringEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		MyPanel mp=new MyPanel();
		contentPane.add(mp,BorderLayout.CENTER);
		setSize(500,500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.CYAN);
			g.setFont(new Font("���",Font.BOLD,30));
			g.drawString("�ڹٴ� ����ִ�", 30, 30);
			g.setColor(Color.red);
			for(int i=1;i<5;i++) {
				g.setFont(new Font("���",Font.ITALIC,i*10));
				g.drawString("����", 60, 60+60*i);
			}
			g.setColor(Color.red);
			g.drawLine(20, 320, 400, 400);
			g.drawLine(20, 400, 400, 320);
			
			
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}

}
