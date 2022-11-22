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
		//컨탠트팬에 MyCenterPanel, 즉 JPanel을 부착한다.
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
			btn = new JButton("추가");
			btn1 = new JButton("지우기");
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
			add(new JLabel("아래 창에 문자열을 입력하고 버튼을 클릭하세요"));
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
