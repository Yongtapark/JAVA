package review11123;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * -���μ���		:�������� ���α׷�
 * -��Ƽ���μ���	:�ΰ� �̻��� ���μ����� ����Ǵ°��� ����
 * -��Ƽ �׽�ŷ�̶� :�ΰ� �̻��� ���μ����� ����ƿ� ���� ó���Ѵ����� ����
 * -��Ƽ ���μ��� �ý��� : ��ǻ�� �ý����� ���ÿ� ���� �۾��� �����ϴ� 
 *                    �ý����� ���ϸ�, ������ �ð� ���ȿ� �� ���μ����� ����
 *                    ��������, ���� ���μ����� ������ȯ�� ���� �̷������.(ó���� ������)
 * -������ȯ�̶�? �������� ���μ����� ���¸� �����ϰ� ���ο� ���μ����� ���¸� cpu�� ����(�ε�)�ϴ� ����
 * -������
 * 	�������? ���μ��� ������ ����Ǵ� ���� �۾� ����
 * 			���� �ٸ� ���μ����� ���� ��ȯ��ſ� �ܼ��� ���� ���μ��� ������ 
 *          ���ÿ� ����Ǵ� ���� �ٸ� �Լ�(�޼ҵ�)�� ���� ��ȯ���� �� ������ Ȯ���� ���̴�.
 *          �������� ����, �׸��� �������� ������ �Ϸõ� �ϳ��� �۾��帧
 *          
 *  ��Ƽ �������? �ϳ��� ���μ������� ���� ���� �����尡 ���������� ó���Ǵ� ���� ����.
 *              �޸��� ���ÿ����� ������ ���� ��ŭ ���� ����ƽ, �� �����ؼ� ���
 * -�������� ���� �ֱ�
 * ������� Thread ��ü�� �����Ǹ� �����ֱ⸦ ���� �Ǵµ�
 * ũ�� 5������ ������.
 * 1. new - �����尡 ������� ����
 * 2. Runnable - ������ ��ü�� ������ �Ŀ� start() �޼ҵ带
 *               ȣ���ϸ� Runnable ���·� �̵��ϰ� �ȴ�.
 * 3. Running  - Runnable ���¿��� ������ �����ٷ��� ���� 
 *               Running ���·� �̵�.
 * 4. Blocked  - �����尡 �ٸ� Ư���� ������ Running ���¿���
 *               Blocked ���·� �̵�.
 * 5. Dead	   - �����尡 ����Ǹ� �� ������� �ٽ� ���� �� �� ���� �ȴ�.           
*/
public class ThreadTimerEx extends JFrame{
	ThreadTimerEx(){
		setTitle("ThreadTimerEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel =new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		TimerThread th =new TimerThread(timerLabel);
		c.add(timerLabel);
		
		setSize(300,150);
		setVisible(true);
		th.start();
	}
	class TimerThread extends Thread{
		JLabel timerLabel;
		
		public TimerThread(JLabel timerLabel) {
			this.timerLabel =timerLabel;
		}
		//������ �ڵ�
		//run()�� ����Ǹ� ������ ����
		@Override
		public void run() {
			int n=0; //Ÿ�̸� ī��Ʈ ��
			
			while(true) {
				timerLabel.setText(Integer.toString(n));
				n++;
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					return;
				}
			}
		}
	}
	public static void main(String[] args) {
		new ThreadTimerEx();

	}

}
