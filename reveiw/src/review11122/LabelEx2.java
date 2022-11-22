package review11122;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.management.monitor.MonitorSettingException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx2 extends JFrame {
Container contentPane;
LabelEx2(){
	setTitle("s");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	contentPane=getContentPane();
	contentPane.setLayout(new FlowLayout());
	JLabel textJLabel =new JLabel("»ç¶ûÇÕ´Ï´Ù");
	ImageIcon a =new ImageIcon("src/image/a.jpg");
	JLabel imageLabel =new JLabel(a);
	ImageIcon normallcon =new ImageIcon("src/image/b.png");
	JLabel call =new JLabel("call me",normallcon,SwingConstants.CENTER);
	
	contentPane.add(textJLabel);
	contentPane.add(imageLabel);
	contentPane.add(call);
	
	setVisible(true);
	setSize(500,500);
}
	public static void main(String[] args) {
	new LabelEx2();

	}

}
