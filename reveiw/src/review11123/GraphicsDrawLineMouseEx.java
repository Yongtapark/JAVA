package review11123;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineMouseEx extends JFrame{
	Container contentPane;
	GraphicsDrawLineMouseEx(){
		setTitle("GraphicsDrawLineMouseEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		Mp mp =new Mp();
		contentPane.add(mp);
		setSize(500,500);
		setVisible(true);
	}
	
	class Mp extends JPanel{
		Vector<Point> vs=new Vector<Point>();
		Vector<Point> ve=new Vector<Point>();
		
		Point startP =null;
		Point endP = null;
		
		Mp(){
			//Mouse�����ʸ� ���
			//�� �����ʴ� ���콺 ��ư�� �������� ���콺 �����͸� vStart�����Ϳ� �����ϰ�
			//���콺 ��ư�� �������� ���콺�����͸� vENd ���Ϳ� �����Ѵ�.
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					startP =e.getPoint();
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					endP =e.getPoint();
					vs.add(startP);
					ve.add(endP);
					repaint();//�г��� �ٽñ׸��� ��û -> update() -->paint()
				}
			});
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.green);
			for(int i=0;i<vs.size();i++) {
				Point s= vs.elementAt(i);
				Point e= ve.elementAt(i);
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
		
	}
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();

	}

}
