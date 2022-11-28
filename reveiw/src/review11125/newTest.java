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

public class newTest extends JFrame {

	newTest() {

		Container c = getContentPane();
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyPanel mp = new MyPanel();// 계산기 패널 선언

		JTextField result = new JTextField(30); // 위의 텍스트창 선언
		result.setText("tq");
		add(result, BorderLayout.NORTH);
		add(mp);

		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {

		String[] padsString = { "c", "+/-", "%", "/", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "0",
				"000", ".", "=" };
		JButton[] pads = new JButton[20];

		public MyPanel() {
			setLayout(new GridLayout(5, 4, 2, 2));
			for (int i = 0; i < pads.length; i++) {
				pads[i] = new JButton(padsString[i]);

				add(pads[i]);
				String s = pads[i].getText();

//---------------------------------------------------------------------------------------------------
				pads[i].addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						System.out.println(s);
						if ("c".equals(s)) {
							System.out.println("tq");
							
						}

					}

				});

			}

		}

	}

	public static void main(String[] args) {
		new newTest();

	}

}
