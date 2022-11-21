package review11121;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import review11121.MouseListenerEx.MyMouseListener;

public class MouseListenerAllEx extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la;

	MouseListenerAllEx() {
		setTitle("MouseListenter�� MouseMotionListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.addMouseListener(new MyMouseListener());
		contentPane.addMouseMotionListener(new MyMouseListener());
		la = new JLabel("no Mouse Event");
		la.setBackground(Color.darkGray);
		contentPane.add(la);
		setSize(300, 200);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged (" + e.getX() + "," + e.getY() + ")");
			System.out.println("MouseDragged("+e.getX()+ "," + e.getY() + ")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved (" + e.getX() + "," + e.getY() + ")");
			System.out.println("MouseMoved("+e.getX()+ "," + e.getY() + ")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("MousePressed (" + e.getX() + "," + e.getY() + ")");
			System.out.println("MousePressed("+e.getX()+ "," + e.getY() + ")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased (" + e.getX() + "," + e.getY() + ")");
			System.out.println("MouseReleased("+e.getX()+ "," + e.getY() + ")");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			JPanel p = (JPanel) e.getSource();
			p.setBackground(Color.cyan);
			System.out.println(p.getBackground());

		}

		@Override
		public void mouseExited(MouseEvent e) {
			JPanel p = (JPanel) e.getSource();
			p.setBackground(Color.yellow);
			System.out.println(p.getBackground());
			
		}
		
	}
	
	public static void main(String [] args) {
		new MouseListenerAllEx();

	}

}
