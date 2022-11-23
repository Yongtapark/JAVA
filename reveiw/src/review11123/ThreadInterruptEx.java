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
		th =new Thread(runnable);//������ ����
		c.add(timerLabel);
		
		//��ư�� �����ϰ� Action ������ ���
		JButton btn =new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();//Ÿ�̸ӽ����� ��������
				System.out.println("�� �ؾ���.. ");
				JButton btn=(JButton)e.getSource();
				btn.setEnabled(false);//��ư ��Ȱ��ȭ
			}
		});
		c.add(btn);
		setSize(300,150);
		setVisible(true);
		th.start();//������ ���۽�Ŵ// �̰� �����ϱ� ��ư�����Ȥ���;
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
					Thread.sleep(1000);// 1�� ����
				} catch (InterruptedException e) {
					return; // ���ܰ� �߻��ϸ� ������ ����
				}
			}
		}

	}

	public static void main(String[] args) {
		new ThreadInterruptEx();

	}

}
