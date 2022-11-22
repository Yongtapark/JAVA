package review11122;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame{
	
	Container contentPane;
	RadioButtonEx(){
		setTitle("RadioButtonEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon =new ImageIcon("src/image/images.jpg");
		
		ButtonGroup g= new ButtonGroup();
		JRadioButton apple =new JRadioButton("사과");
		JRadioButton pear =new JRadioButton("배");
		JRadioButton cherry =new JRadioButton("체리",cherryIcon);
		cherry.setBorderPainted(true);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
	
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonEx();

	}

}
