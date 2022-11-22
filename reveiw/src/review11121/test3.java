package review11121;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test3 extends JFrame {
	JPanel jp=new JPanel();
	JLabel cell;
	
	test3(){
		setTitle("test3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,4));
		
		
		
		for(int i=0; i<16;i++) {
			cell =new JLabel(Integer.toString(i));
			cell.setOpaque(true);
			add(cell);
			int r= (int)(Math.random()*256);
			int g= (int)(Math.random()*256);
			int b= (int)(Math.random()*256);
			cell.setBackground(new Color(r,g,b));
			
		}
		
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new test3();

	}

}
