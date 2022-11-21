package review11121;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListenerEx extends JFrame {
	AnonymousClassListenerEx(){
		setTitle("anonymousClassListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(btn.getText().equals("Action"))
					btn.setText("¾×¼Ç");
				else
					btn.setText("Action");
				
			}
		});
		
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String[] args) {
		new AnonymousClassListenerEx();

	}

}
