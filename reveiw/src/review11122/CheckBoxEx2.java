package review11122;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx2 extends JFrame{
	Container contentPane;
	
	CheckBoxEx2(){
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		ImageIcon pic=new ImageIcon("src/image/a.jpg");
		JCheckBox apple =new JCheckBox("사과");
		JCheckBox pear =new JCheckBox("배",true);
		JCheckBox cherry=new JCheckBox("체리",pic);
		
		cherry.setBorderPainted(true);
		contentPane.add(cherry);
		contentPane.add(pear);
		contentPane.add(apple);
		
		setVisible(true);
		setSize(500,500);
	}

	public static void main(String[] args) {
		 new CheckBoxEx2();

	}

}
