package review11123;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadInterruptEx2 extends JFrame{
	Thread th;
	public ThreadInterruptEx2() {
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel =new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		TimerRunnable runnable=new TimerRunnable(timerLabel);
		th =new Thread(runnable);
		c.add(timerLabel);
		
		JButton btn =new JButton("kill");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				JButton btn=(JButton)e.getSource();
				btn.setEnabled(false);
				
			}
		});
		c.add(btn);
		setSize(300,150);
		setVisible(true);
		th.start();
	}
	class TimerRunnable implements Runnable{
		JLabel timerLabel;
		public TimerRunnable(JLabel timerLabel) {
			this.timerLabel=timerLabel;
			// TODO Auto-generated constructor stub
		}
		@Override
		public void run() {
			int n=0;
			while(true) {
				timerLabel.setText(Integer.toString(n));
				n++;
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					// TODO: handle exception
					return;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		new ThreadInterruptEx2();

	}

}
