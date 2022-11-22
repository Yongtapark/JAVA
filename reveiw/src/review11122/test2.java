package review11122;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test2 extends JFrame {
	String[] names = { "������", "����", "õ��", "500��", "100��", "50��", "10��", "1��" };
	JLabel[] labels = new JLabel[8];
	JTextField[] text = new JTextField[8];
	int sum;

	public test2() {

		setVisible(true);
		setSize(500, 500);
		// �г�2�� �����
		setBackground(Color.pink);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();

		// �г��� ���Ʒ��κ���
		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);

		// jp1�� ���� ��ҵ�(��,�ؽ�Ʈ,��ư),���󺯰� /����
		jp1.setBackground(Color.pink);
		JLabel head = new JLabel("�ݾ�");
		JTextField result = new JTextField(10);
		JButton btn = new JButton("���");
		jp1.add(head);
		jp1.add(result);
		jp1.add(btn);
		// btn �Ӽ�

		// jp2(��,�ؽ�Ʈ)/����/grid?
		jp2.setBackground(Color.pink);
		jp2.setLayout(new GridLayout(8, 2));
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(names[i], JLabel.CENTER);
			text[i] = new JTextField(10);
			jp2.add(labels[i]);
			jp2.add(text[i]);
		}
		text[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int input = Integer.parseInt(text[0].getText());
				sum = sum + input * 50000;

			}
		});

		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				result.setText(String.valueOf(sum));
				System.out.println(sum);

			}
		});

	}

	public static void main(String[] args) {
		new test2();

	}

}
