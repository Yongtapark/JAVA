package review11122;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame {
	String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", 
			"peach", "berry", "strawberry", "blackberry"};

	String [] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
	
	Container contentPane;
	ComboBoxEx(){
		setTitle("ComboBoxEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox jc1= new JComboBox(fruits);
		JComboBox jc2= new JComboBox();
		for (int i=0; i<names.length;i++) {
			jc2.addItem(names[i]);
		}
		
		contentPane.add(jc1).addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println(jc1.getSelectedItem());
		}
		
		});;
		contentPane.add(jc2);
		
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String[] args) {
		new ComboBoxEx();

	}

}
