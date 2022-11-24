package review11123;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test2 extends JFrame {
	Container contentPane;
	test2() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(250, 250);
		setVisible(true);
		
	}

	class MyPanel extends JPanel {
		
		Vector<Point> ve=new Vector<Point>();
		
		Point startP =null;
		Point endP =null;
		
		ImageIcon imageIcon = new ImageIcon("src/image/back.jpg");
		Image image = imageIcon.getImage();
		
		public MyPanel() {
			Dot dot =new Dot();
			add(dot);
			addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				startP =e.getPoint();
				System.out.println(e.getPoint().x+","+e.getPoint().y);
				
			}
			});
			setLayout(new FlowLayout());
			JButton bj =new JButton("Hello");
			add(bj);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0,0,this.getWidth(),this.getHeight(), this);
			g.setColor(Color.green);
			g.fillOval(10, 70, 20, 20);
			//g.drawOval(startP.x, startP.y, 20, 20);
			
			
		}
		class Dot extends JButton{
		
			Dot(){
				setLayout(null);
				this.setSize(20,40);
				setBackground(Color.blue);
			}
		}
		
		
	}

	public static void main(String [] args) {
		new test2();
	}
} 
