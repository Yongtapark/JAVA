package review11123;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import review11123.ThreadTimerEx.TimerThread;

public class ThreadTimerEx2 extends JFrame {
	class TimerThread extends Thread {
		JLabel timerLabel;

		TimerThread(JLabel timerLabel) {
			this.timerLabel = timerLabel;
		}

		public void run() {
			int n = 0;

			while (true) {
				timerLabel.setText(Integer.toString(n));
				n++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					return;
				}
			}
		}

	}

	Container c = getContentPane();

	ThreadTimerEx2() {
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		TimerThread tt=new TimerThread(timerLabel);
		c.add(timerLabel);
		
		setSize(500,500);
		setVisible(true);
		tt.start();
		
	}

	public static void main(String[] args) {
		new ThreadTimerEx2();

	}

}
