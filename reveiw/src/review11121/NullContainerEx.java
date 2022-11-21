package review11121;

import java.awt.Color;

import javax.sound.sampled.Line;
import javax.sound.sampled.LineListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class NullContainerEx extends JFrame {
	NullContainerEx(){
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JLabel la =new JLabel("Hello, Press Buttons!",JLabel.CENTER);
		la.setLocation(130,50);
		la.setSize(200,20);
		//테두리
		la.setBorder(new LineBorder(Color.red,5));
		
		add(la);//프레임의 레이블 달기
		
		for(int i=1; i<=9;i++) {
			//버튼 객체 생성
			JButton b= new JButton(Integer.toString(i));
			//색료의 3원색 : CMYK 시안(청록),마젠타(자주),옐로 ==>black
			//색(광)의 3원색 : RGBW 빨강0-225,파랑0-225,초록0-255 ==>white
			b.setBackground(new Color(i*25,200,i*25));
			
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			add(b);
		}
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainerEx();
	}

}
