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
		contentPane = getContentPane();//������ �����̵� ���
		
		contentPane.setLayout(new FlowLayout());//�÷ο췹�̾ƿ����� ����
		JLabel textLabel =new JLabel("����մϴ�");//���ڿ� ���̺�
		ImageIcon beauty = new ImageIcon("src/image/images.jpg");
		JLabel imageJLabel =new JLabel(beauty);//�̹������̺�
		ImageIcon normalIcon=new ImageIcon("src/image/images.jpg");
		JLabel label =new JLabel("��������� �����ϼ���",normalIcon,SwingConstants.CENTER);
		
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
