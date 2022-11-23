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
		
		//�����̴� ���̺� ����
		FlickeringLabel fLabel =new FlickeringLabel("����");
		
		//�������� �ʴ� ���̺� ����
		JLabel label =new JLabel("�ȱ���");
		
		//�����̴� ���̺� ����
		FlickeringLabel fLabel2 =new FlickeringLabel("���⵵ ����");
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
	}

	class FlickeringLabel extends JLabel implements Runnable {
		FlickeringLabel(String text) {
			super(text);// JLabel ������ ȣ��
			setOpaque(true);// ���� ������ �����ϵ��� ����
			//������ ��ü ����

			Thread th = new Thread(this);
			th.start(); //run ȣ��
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
					Thread.sleep(500);// 0.5�ʵ��� ����
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
