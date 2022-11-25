package review11125;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneEx extends JFrame{
	Container c=getContentPane();
	TabbedPaneEx(){
		
		JTabbedPane pane=createTabbedPane();
		c.add(pane,BorderLayout.CENTER);
		setSize(250,200);
		setVisible(true);
	}
	JTabbedPane createTabbedPane() {
		JTabbedPane pane= new JTabbedPane(JTabbedPane.LEFT);
		pane.addTab("tab1", new JLabel(new ImageIcon("src/image/b.png")));
		pane.addTab("tab2", new JLabel(new ImageIcon("src/image/SliderEx.txt")));
		pane.addTab("tab3", new MyPanel());
		return pane;
	}
	class MyPanel extends JPanel{
		MyPanel(){
			this.setBackground(Color.yellow);
		}
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.black);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.blue);
			g.drawString("tab 3d에 들어가는 JPanel 입니다",30,50	);
		}
	}

	public static void main(String[] args) {
		new TabbedPaneEx();

	}

}
