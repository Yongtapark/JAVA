package review11121;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx2 extends JFrame{

	MouseListenerEx2(){
		setTitle("mouseListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pn=new JPanel();
		setContentPane(pn);
		JLabel la=new JLabel("¾È³ç¾È³ç ³ª´Â ºüµÎ¾ß");
		la.setSize(500,20);
		la.setLocation(30, 30);
		pn.add(la);
		setLayout(null);
		pn.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x,y);
		}
		});
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String[] args) {
		new MouseListenerEx2();

	}

}
