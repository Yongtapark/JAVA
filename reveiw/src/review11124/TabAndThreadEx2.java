package review11124;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyLabel extends JLabel {
	int barSize = 0;
	int maxBarSize;

	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.magenta);
		int width = (int) ((double) (this.getWidth())) / maxBarSize * barSize;
		if (width == 0)
			return;
		g.fillRect(0, 0, width, this.getHeight());
	}

	synchronized void fill() {
		if (barSize == maxBarSize) {
			try {
				wait();
			} catch (InterruptedException e) {
				return;
			}
		}
		barSize++;
		repaint();
		notify();

	}

	synchronized void consume() {
		if (barSize == 0) {
			try {
				wait();
			} catch (Exception e) {
				return;
			}

		}
		barSize--;
		repaint();
		notify();

	}

}
class ConsumerThread2 extends Thread{
	MyLabel bar;
	
	public ConsumerThread2(MyLabel bar) {
		this.bar=bar;
	}
	@Override
	public void run() {
		while(true) {
			try {
				sleep(200);
				bar.consume();
			}catch (Exception e) {
				return;
			}
			
		}
	}
}
public class TabAndThreadEx2 extends JFrame{
	MyLabel bar=new MyLabel(100);
	public TabAndThreadEx2(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.orange);
		bar.setOpaque(true);
		bar.setLocation(20,50);
		bar.setSize(300,20);
		c.add(bar);
		c.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			bar.fill();
		}
		});
		setSize(350,200);
		setVisible(true);
		
		c.requestFocus();
		ConsumerThread th =new ConsumerThread2(bar);
		th.start();
	}
	public static void main(String[] args) {
		new TabAndThreadEx2("酔形ちけいし");

	}

}
