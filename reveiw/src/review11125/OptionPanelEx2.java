package review11125;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class OptionPanelEx2 extends JFrame{
 Container c;
	public OptionPanelEx2() {
		c=getContentPane();
		setSize(500,200);
		c.add(new MyPanel(),BorderLayout.NORTH);
		setVisible(true);
	}
	
	class MyPanel extends Panel{
		JButton inputBtn =new JButton("input button");
		JTextField tf=new JTextField(10);
		JButton confirmBtn =new JButton("confirem");
		JButton messageBtn=new JButton("message");
		
		MyPanel(){
			setBackground(Color.gray);
			add(inputBtn);
			add(confirmBtn);
			add(messageBtn);
			add(tf);
		}
	}

	public static void main(String[] args) {
		new OptionPanelEx2();

	}

}
