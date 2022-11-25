package review11125;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDiaog extends JDialog {
	JTextField tf = new JTextField(10);
	JButton okButton = new JButton("ok");

	public MyDiaog(JFrame frame, String title) {
		super(frame, title);
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
	}}

	public class DialogEx extends JFrame {
		MyDiaog dialog = new MyDiaog(this, "test dialog");

		DialogEx() {
			super("Dialog ex ed");
			JButton btn = new JButton("show Dialog");
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					dialog.setVisible(true);

				}
			});
			getContentPane().add(btn);
			setSize(250,200);
			setVisible(true);

		
	}

	public static void main(String[] args) {
		new DialogEx();

	}

}
