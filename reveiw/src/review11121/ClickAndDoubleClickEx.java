package review11121;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClickAndDoubleClickEx extends JFrame {
	JPanel contentpane =new JPanel();
	public ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentpane);
		contentpane.addMouseListener(new MyMouseListener());
		setSize(300,200);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==2) {
				int r= (int)(Math.random()*256);
				int g= (int)(Math.random()*256);
				int b= (int)(Math.random()*256);
				
				JPanel p =(JPanel)e.getSource();//요거머임?
				contentpane.setBackground(new Color(r,g,b));
				System.out.println(p);
				
			}
		}
	}
			
	public static void main(String[] args) {
	new ClickAndDoubleClickEx();

	}

}
