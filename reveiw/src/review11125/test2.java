package review11125;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test2 extends JFrame {

	test2() {

		Container c = getContentPane();
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel wholeFrame =new JPanel();//Ȧ������
		
		TextPanel tp = new TextPanel();
		MyPanel mp = new MyPanel();// ���� �г� ����
		MyPanelCenter mpCenter= new MyPanelCenter();
		MyPanelEast mpEast=new MyPanelEast();

		add(tp, BorderLayout.NORTH);//�� �� �г�
		add(wholeFrame);//�� ���� �г�
		
		wholeFrame.add(mp,BorderLayout.NORTH);
		wholeFrame.add(mpCenter,BorderLayout.CENTER);
		wholeFrame.add(mpEast,BorderLayout.EAST);

		setSize(200, 300);
		setVisible(true);
	}

	class TextPanel extends JPanel {
		JTextField result = new JTextField(30); // ���� �ؽ�Ʈâ ����

		TextPanel() {
			add(result);
		}
	}

	//---------------------------------------�����е�---------------------------------------------
	class MyPanel extends JPanel {
		TextPanel tp = new TextPanel();
		String[] padsStringTop = { "c", "+/-", "%", "/" };
		String[] padsStringCenter = { "7", "8", "9", "4", "5", "6", "1", "2", "3" };
		JButton[] padsTop = new JButton[4];

		public MyPanel() {
			setLayout(new GridLayout(1, 4));
			for (int i = 0; i < padsTop.length; i++) {
				padsTop[i] = new JButton(padsStringTop[i]);

				add(padsTop[i]);
			}
			;

		}

	}
//--------------------------------�����е�-----------------------------------------------------
	class MyPanelCenter extends JPanel {
		TextPanel tp = new TextPanel();
		String[] padsStringCenter = { "7", "8", "9", "4", "5", "6", "1", "2", "3" };
		// "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "0",
		// "000", ".", "=" };
		JButton[] padsCenter = new JButton[9];

		public MyPanelCenter() {
			setLayout(new GridLayout(3, 3));
			for (int i = 0; i < padsCenter.length; i++) {
				padsCenter[i] = new JButton(padsStringCenter[i]);

				add(padsCenter[i]);
			}
			;

		}

	}
//			padsTop[].addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					tp.result.setText("7");
//					
//					
//				}
//			});
	class MyPanelEast extends JPanel {
		TextPanel tp = new TextPanel();
		String[] padsStringEast = { "x", "-", "+", "="};
		JButton[] padsEast = new JButton[4];

		public MyPanelEast() {
			setLayout(new GridLayout(4, 1));
			for (int i = 0; i < padsEast.length; i++) {
				padsEast[i] = new JButton(padsStringEast[i]);

				add(padsEast[i]);
			}
			;

		}

	}
	public static void main(String[] args) {
		new test2();

	}

}
