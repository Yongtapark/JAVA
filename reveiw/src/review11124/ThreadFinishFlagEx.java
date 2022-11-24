package review11124;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class ThreadFinishFlagEx extends JFrame{
	RandomThread th;
	
	public ThreadFinishFlagEx() {
		Container c=getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				th.finish();
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th=new RandomThread(c);
		th.start();
	}
	

	class RandomThread extends Thread{
		Container c;
		boolean flag=false;
		RandomThread(Container c){
			this.c=c;
		}
	void finish() {
		flag=true;
	}
	public void run() {
		while(true) {
			int x=((int)(Math.random()*c.getWidth()));
			int y=((int)(Math.random()*c.getHeight()));
			JLabel label=new JLabel("ÀÚ¹Ù ¤Ñ¤Ñ");
			label.setSize(80,30);
			label.setLocation(x,y);
			c.add(label);
			c.repaint();
			try {
				Thread.sleep(300);
				if(flag==true) {
					c.removeAll();
					label=new JLabel("finish");
							label.setSize(80,30);
					label.setLocation(100,100);
					label.setForeground(Color.red);
					c.add(label);
					c.repaint();
					return;
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	}
	public static void main(String[] args) {
		new ThreadFinishFlagEx();

	}

}
