package review11125;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyModalDialog extends JDialog {

	JTextField tf = new JTextField(10);
	JButton okButton = new JButton("OK");
	
	
	MyModalDialog(JFrame frame, String title) {
		
		super(frame,title,true);//true를 없애면 작은 창을 없애기 전엔 큰창 제어 불가
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);

		okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

			}
		});
	}

	String getinput() {
		if (tf.getText().length() == 0)//텍스트필드의 길이를 봣을때 길이가 0이면 아무것도 하지 않음
			return null;
		else
			return tf.getText();
	}

}
