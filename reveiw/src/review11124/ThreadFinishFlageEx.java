package review11124;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadFinishFlageEx extends JFrame {
	
	class RandomThread extends Thread{
		Container c=getContentPane();
		boolean flag=false;//스레드의 종료 명령을 표시하는 플래그
		
		public RandomThread(Container c) {
			this.c=c;
		}
		void finish() {
			flag=true;
		}
		
		@Override
		public void run() {
			while(true) {
				int x= ((int)(Math.random()*c.getWidth()));
				int y= ((int)(Math.random()*c.getHeight()));
				JLabel label =new JLabel("jaba"	);//새 레이블 생성
				label.setSize(80,30);
				label.setLocation(x,y);
				c.add(label);
				c.repaint(); //요게 없으면 한번만생성됨
				try {
					Thread.sleep(300);
					if(flag==true) {
						c.removeAll();
						label=new JLabel("finish");
						label.setSize(80,30);
						label.setLocation(0,0);
						label.setForeground(Color.red);
						c.add(label);
						c.repaint();
						return;
					}
				}
				catch(InterruptedException e) {
					return;
				}
			}
		}
	}
	RandomThread th;//스레드 레퍼런스
	ThreadFinishFlageEx(){
		setTitle("threadfisnish 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		th =new RandomThread(c);
		th.start();
	}

	public static void main(String[] args) {
		new ThreadFinishFlageEx();

	}

}
