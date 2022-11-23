package review11123;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx1 extends JFrame{
	Container contentPane;
	GraphicsDrawImageEx1(){
		setTitle("GraphicsDrawImageEx1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		Mp mp=new Mp();
		contentPane.add(mp,BorderLayout.CENTER);
		setSize(500,500);
		setVisible(true);
	}
	
	class Mp extends JPanel{
		ImageIcon imageIcon =new ImageIcon("src/image/a.jpg");//���Ϸκ��� �̹��� ��ü �ε�
		Image image = imageIcon.getImage();//�̹��� ��ü ����
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			//(Image img, int dx1, int dy1, ImageObserver obeserver)
			//g.drawImage(image, 50, 20, this);//this : �̹��� �׸����� �ϷḦ �뺸�޴� ��ü
			//g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);//ȭ�鿡 ���߾� ü���
			//g.drawImage(image, 20, 20, 250, 100, 100, 50, 10, 10, this);//�߶� �׸���
			g.setClip(100,20,200,200);
			g.drawImage(image,0,0, getWidth(), getHeight(),this);
			g.setColor(Color.blue);
			g.setFont(new Font("����",Font.ITALIC,40));
			g.drawString("ji sung park",20,150);
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawImageEx1();

	}

}
