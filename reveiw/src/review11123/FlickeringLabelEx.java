package review11123;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		//깜빡이는 레이블 생성
		FlickeringLabel fLabel =new FlickeringLabel("깜빡");
		
		//깜빡이지 않는 레이블 생성
		JLabel label =new JLabel("안깜빡");
		
		//깜빡이는 레이블 생성
		FlickeringLabel fLabel2 =new FlickeringLabel("여기도 깜빡");
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
	}

	class FlickeringLabel extends JLabel implements Runnable {
		FlickeringLabel(String text) {
			super(text);// JLabel 생성자 호출
			setOpaque(true);// 배경색 변경이 가능하도록 설정
			//스레드 객체 생성

			Thread th = new Thread(this);
			th.start(); //run 호출
		}

		@Override
		public void run() {
			int n = 0;
			while (true) {
				if (n == 0)
					setBackground(Color.yellow);
				else
					setBackground(Color.green);
				if (n == 0)
					n = 1;
				else
					n = 0;
				try {
					Thread.sleep(500);// 0.5초동안 슬립
				} catch (InterruptedException e) {
					return;//==break;
				}

			}

		}
	}

	public static void main(String[] args) {
		new FlickeringLabelEx();

	}

}
