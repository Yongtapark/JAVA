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

public class tes2 extends JFrame {

	tes2() {

		Container c = getContentPane();
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(300, 400);
		setVisible(true);

		class MyPanel1 extends JPanel {

			String[] padsString = { "c", "+/-", "%", "/", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+",
					"0", "000", ".", "=" };
			JButton[] pads = new JButton[20];
			JTextField text;

			public MyPanel1() {

				text = new JTextField(20); // 위의 텍스트창 선언
				text.setText("바버ㅗ");

				add(text, BorderLayout.NORTH);

				setLayout(new GridLayout(5, 4, 2, 2));
				for (int i = 0; i < pads.length; i++) {
					pads[i] = new JButton(padsString[i]);

					add(pads[i]);
					String s = pads[i].getText();

					pads[i].addActionListener(new ActionListener() {
						tes2 a = new tes2();

						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println(s);
							if ("c".equals(s)) {
								System.out.println("?");
							}
							else if("+".equals(s)) {
								int a= Integer.parseInt(text.getText());
								System.out.println("tlqkf");
								
							}

						}

					});

				}

			}

		}
		// add(result, BorderLayout.NORTH);
		add(new	MyPanel1());
	}

	public static void main(String[] args) {
		new tes2();

	}

}
