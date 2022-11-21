package review11121;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	ContentPaneEx(){
		setTitle("ContentPane이 무엇인고");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x를 누르면 종료하도록
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
		// TODO Auto-generated method stub

	}

}
