package review11125;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DialogEx2 extends JFrame{
	MyModalDialog dialog =new MyModalDialog(this,"Test Modal Dialog");
	public DialogEx2() {
		super("DialogEx ¿¹Á¦"	);
		JButton btn =new JButton("Show Modal dialog");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				String text=dialog.getinput();
				if(text==null)return;
				JButton btn=(JButton)e.getSource();
				btn.setText(text);
				
			}
		});
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DialogEx2();

	}

}
