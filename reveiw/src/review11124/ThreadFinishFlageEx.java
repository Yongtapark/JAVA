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
		boolean flag=false;//�������� ���� ����� ǥ���ϴ� �÷���
		
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
				JLabel label =new JLabel("jaba"	);//�� ���̺� ����
				label.setSize(80,30);
				label.setLocation(x,y);
				c.add(label);
				c.repaint(); //��� ������ �ѹ���������
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
	RandomThread th;//������ ���۷���
	ThreadFinishFlageEx(){
		setTitle("threadfisnish ����");
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
