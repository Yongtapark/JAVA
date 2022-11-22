package review11122;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class test extends JFrame {
	Container contentPane;

	public test() {

		setTitle("TextAreaEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		//contentPane.setBackground(Color.pink);

		// ����Ʈ�ҿ� MyCenterPanel, �� JPanel�� �����Ѵ�.
		contentPane.add(new MyCenterPannel(), BorderLayout.NORTH);

		//contentPane.add(new MyCenterPannel2())

		setSize(300, 300);
		setVisible(true);

	}

	class MyCenterPannel extends JPanel {
		JTextField tf;
		JButton btn;

		public MyCenterPannel() {
			tf = new JTextField(10);
			btn = new JButton("���");

			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// ta.append(tf.getText() + "\n");
					tf.setText("");
				}

			});
			// ta = new JTextArea("hello", 7, 20);
			add(new JLabel("�ݾ�"));
			add(tf);
			add(btn);
			setBackground(Color.pink);
			// add(new JScrollPane(ta));

			// ��

		}
	}

	class MyCenterPannel2 {
		String[] names = { "������", "����", "õ��", "500��", "100��", "50��", "10��", "1��" };
		JLabel[] labels = new JLabel[8];
		JTextField[] text = new JTextField[8];

		public MyCenterPannel2() {
			for (int i = 0; i < labels.length; i++) {
				labels[i] = new JLabel(names[i]);
				text[i] = new JTextField(10);
				add(labels[i]);
				add(text[i]);
			}
		}
	}

	public static void main(String[] args) {
		new test();

	}

}
