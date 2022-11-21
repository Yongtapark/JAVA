package review11121;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		// TODO Auto-generated constructor stub
		setTitle("FlowLayout sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(20,30));
		add(new JButton("add"),BorderLayout.NORTH);
		add(new JButton("sub"),BorderLayout.SOUTH);
		add(new JButton("mul"),BorderLayout.EAST);
		add(new JButton("div"),BorderLayout.WEST);
		add(new JButton("Calculate"),BorderLayout.CENTER);

		
		setSize(300,300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEx();
	}

}
