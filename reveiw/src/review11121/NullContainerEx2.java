package review11121;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx2 extends JFrame{
	NullContainerEx2(){
		setTitle("NullContainer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);//배치관리자 없음
		
		JLabel la= new JLabel("안녕, 버튼 눌러"	);
		la.setLocation(130,50);
		la.setSize(200,20);
		add(la);
		for(int i=1;i<22;i++) {
			JButton bt =new JButton(Integer.toString(i));
			bt.setBackground(new Color(i*10,i*10,i*10));
			bt.setLocation(i*15,i*15);
			bt.setSize(50,20);
			add(bt);
			
		}
		
		setVisible(true);
		setSize(500,500);
	}

	public static void main(String[] args) {
		new NullContainerEx2();

	}

}
