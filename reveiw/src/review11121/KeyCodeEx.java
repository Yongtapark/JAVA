package review11121;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
JPanel contentPane =new JPanel();
JLabel la=new JLabel();

KeyCodeEx(){
	setTitle("asd");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setContentPane(contentPane);
	contentPane.addKeyListener(new MyKeyListener());
	contentPane.add(la);
	setSize(300,150);
	setVisible(true);
	contentPane.requestFocus();
}

class MyKeyListener extends KeyAdapter{
	@Override
	public void keyPressed(KeyEvent e) {
		la.setText(e.getKeyText(e.getKeyCode()));
		if(e.getKeyChar()=='%')
			contentPane.setBackground(Color.yellow);
		else if(e.getKeyCode() == KeyEvent.VK_F1)
			contentPane.setBackground(Color.green);
	}
}

	public static void main(String [] args) {
		new KeyCodeEx();
	}
}