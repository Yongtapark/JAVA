package review11124;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomThread extends Thread {
	Container c;
	boolean flag = false;// 스레드의 종료 명령을 표시하는 플래그

	RandomThread(Container c) {
		this.c = c;
	}

	void finish() {// 스레드 종료 명령을 flag에 표시
		flag = true;
	}

	@Override
	public void run() {
		while (true) {
			int x = ((int) (Math.random() * c.getWidth()));
			int y = ((int) (Math.random() * c.getHeight()));
			JLabel label = new JLabel("java");
			label.setSize(80, 30);
			label.setLocation(x, y);
			c.add(label);
			c.repaint();

			try {
				Thread.sleep(3);
				if (flag == true) {
					c.removeAll();
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.red);
					c.add(label);
					c.repaint();
					return;
				}

			} catch (Exception e) {
			
			}

		}
	}}

public class ThreadFinishFlagEx2 extends JFrame {
	RandomThread th;
	
	ThreadFinishFlagEx2(){
		Container c=getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			th.finish();
		}
		});
		setSize(300,200);
		setVisible(true);
		th=new RandomThread(c);
		th.start();
	}
	
	public static void main(String[] args) {
		new ThreadFinishFlagEx2();

	}

}
