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
		//�׵θ�
		la.setBorder(new LineBorder(Color.red,5));
		
		add(la);//�������� ���̺� �ޱ�
		
		for(int i=1; i<=9;i++) {
			//��ư ��ü ����
			JButton b= new JButton(Integer.toString(i));
			//������ 3���� : CMYK �þ�(û��),����Ÿ(����),���� ==>black
			//��(��)�� 3���� : RGBW ����0-225,�Ķ�0-225,�ʷ�0-255 ==>white
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
