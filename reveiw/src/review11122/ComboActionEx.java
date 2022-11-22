package review11122;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboActionEx  extends JFrame{
	Container contentPane;
	String[] fruits= {"apple","banana","kiwi"};
	ImageIcon [] images ={
		new ImageIcon("src/image/a.jpg"),
		new ImageIcon("src/image/b.png"),
		new ImageIcon("src/image/images.jpg")
	};
	JLabel imageLabel=new JLabel(images[0]);
	
	ComboActionEx(){
		setTitle("comboactioex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox fruitName =new JComboBox(fruits);
	    JComboBox fruitPict =new JComboBox(images);
		
		
		fruitName.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox fruitName = (JComboBox)e.getSource();
				int index = fruitName.getSelectedIndex();
				imageLabel.setIcon(images[index]);
				
			}
		});
		contentPane.add(fruitName);
		contentPane.add(fruitPict);
		
		setVisible(true);
		setSize(500,500);
	}

	
	
	public static void main(String[] args) {
		new ComboActionEx();

	}

}
