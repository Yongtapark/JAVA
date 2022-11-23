package review11123;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test extends JFrame{
	Container contentPane;
	test(){
		setTitle("test1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		MyPanel panel =new MyPanel();
		contentPane.add(panel,BorderLayout.CENTER);
		setSize(200,200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon imageIcon =new ImageIcon("src/image/a.jpg");
		Image image=imageIcon.getImage();
		@Override
		public void paintComponents(Graphics g) {
			
			super.paintComponents(g);
			g.drawImage(image,20,20,this);
		}
		
	}
	public static void main(String[]args) {
		new test();
	}
}
