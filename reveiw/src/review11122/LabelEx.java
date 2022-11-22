package review11122;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	Container contentPane;
	LabelEx(){
		setTitle("LabelEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();//프레임 슬라이드 얻기
		
		contentPane.setLayout(new FlowLayout());//플로우레이아웃으로 변경
		JLabel textLabel =new JLabel("사랑합니다");//문자열 레이블
		ImageIcon beauty = new ImageIcon("src/image/images.jpg");
		JLabel imageJLabel =new JLabel(beauty);//이미지레이블
		ImageIcon normalIcon=new ImageIcon("src/image/images.jpg");
		JLabel label =new JLabel("보고싶으면 연락하세용",normalIcon,SwingConstants.CENTER);
		
		contentPane.add(textLabel);
		contentPane.add(imageJLabel);
		contentPane.add(label);
		
		setSize(400,600);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new LabelEx();

	}

}
