package review11121;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx2 extends JFrame{
public GridLayoutEx2() {
	setTitle("gridLayout");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GridLayout grid = new GridLayout(5,2);
	grid.setVgap(5);
	setLayout(grid);
	
	JLabel jb1= new JLabel("�̸�",JLabel.CENTER);
	JLabel jb2= new JLabel("�й�",JLabel.CENTER);
	JLabel jb3= new JLabel("�а�",JLabel.CENTER);
	JLabel jb4= new JLabel("����",JLabel.CENTER);
	
	JTextField tf1=new JTextField("");
	JTextField tf2=new JTextField("");
	JTextField tf3=new JTextField("");
	JTextField tf4=new JTextField("");
	
	JButton jt1=new JButton("Ȯ��");
	JButton jt2=new JButton("���");
	
	add(jb1); add(tf1);
	add(jb2); add(tf2);
	add(jb3); add(tf3);
	add(jb4); add(tf4);
	add(jt1); add(jt2);
	
	jt1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("�̸� :"+tf1.getText());
			System.out.println("�й� :"+tf2.getText());
			System.out.println("�а� :"+tf3.getText());
			System.out.println("���� :"+tf4.getText());
			
		}
	});
	
jt2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			
		}
	});
	
	
	setSize(300,200);
	setVisible(true);
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
		new GridLayoutEx2();

	}

}
