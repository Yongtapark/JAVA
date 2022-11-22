package review11122;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextFieldEx extends JFrame {
	Container contentPane;
	TextFieldEx(){
		setTitle("TextFieldEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("이름"));
		contentPane.add(new TextField(10));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new TextField("컴퓨터공학과(수정)"));
		contentPane.add(new JLabel("주소"));
		contentPane.add(new TextField("서울시..",20));
		
		setVisible(true);
		setSize(320,200);
	}

	public static void main(String[] args) {
		new TextFieldEx();

	}

}
