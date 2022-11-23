package review11123;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadInterruptEx extends JFrame{
	Thread th;
	ThreadInterruptEx() {
		setTitle("ThreadInterruptEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel =new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		TimerRunnable runnable =new TimerRunnable(timerLabel);
		th =new Thread(runnable);//스레드 생성
		c.add(timerLabel);
		
		//버튼을 생성하고 Action 리스너 등록
		JButton btn =new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();//타이머스레드 강제종료
				System.out.println("날 잊었니.. ");
				JButton btn=(JButton)e.getSource();
				btn.setEnabled(false);//버튼 비활성화
			}
		});
		c.add(btn);
		setSize(300,150);
		setVisible(true);
		th.start();//스레드 동작시킴// 이거 없으니까 버튼만나옴ㅋㅋ;
	}

	class TimerRunnable implements Runnable {
		JLabel timerLabel;

		public TimerRunnable(JLabel timerLabel) {
			this.timerLabel = timerLabel;
		}

		@Override
		public void run() {
			int n = 0;
			while (true) {
				timerLabel.setText(Integer.toString(n));
				n++;
				try {
					Thread.sleep(1000);// 1초 슬립
				} catch (InterruptedException e) {
					return; // 예외가 발생하면 스레드 종료
				}
			}
		}

	}

	public static void main(String[] args) {
		new ThreadInterruptEx();

	}

}
