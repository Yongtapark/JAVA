package review11122;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame {
	Container contentPane;
	public ButtonImageEx() {
		// TODO Auto-generated constructor stub
		setTitle("ButtonImage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane =getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon normalIcon=new ImageIcon("src/image/images.jpg");
		ImageIcon rolloverIcon=new ImageIcon("src/image/b.png");
		ImageIcon pressedIcon=new ImageIcon("src/image/a.jpg");
		
		JButton btn=new JButton("call~~",normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);
		btn.setSize(500,500);
		
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ButtonImageEx();

	}

}
