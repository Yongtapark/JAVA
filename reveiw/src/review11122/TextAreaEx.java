package review11122;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
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

public class TextAreaEx extends JFrame {
	Container contentPane;

	public TextAreaEx() {

		setTitle("TextAreaEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		//����Ʈ�ҿ� MyCenterPanel, �� JPanel�� �����Ѵ�.
		contentPane.add(new MyCenterPannel(), BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}

	class MyCenterPannel extends JPanel {
		JTextField tf;
		JButton btn, btn1;
		JTextArea ta;

		public MyCenterPannel() {
			tf = new JTextField(20);
			btn = new JButton("�߰�");
			btn1 = new JButton("�����");
			btn1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					tf.setText("");
					ta.setText("");

				}
			});
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText() + "\n");
					tf.setText("");
				}
			});
			ta = new JTextArea("hello", 7, 20);
			add(new JLabel("�Ʒ� â�� ���ڿ��� �Է��ϰ� ��ư�� Ŭ���ϼ���"));
			add(tf);
			add(btn);
			add(btn1);
			add(new JScrollPane(ta));
		}

	}

	public static void main(String[] args) {
		new TextAreaEx();

	}

}
