package review11122;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame{
	Container contentPane;
	CheckBoxEx(){
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon =new ImageIcon("src/image/images.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("src/image/b.png");
		
		JCheckBox apple =new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��",true);
		JCheckBox cherry =new JCheckBox("ü��",cherryIcon);
		
		cherry.setBorderPainted(true);
		apple.setBorderPainted(true);
		pear.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		setSize(500,500);
		setVisible(true);
		

	}

	public static void main(String[] args) {
		new CheckBoxEx();

	}

}
