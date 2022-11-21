package review11121;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx extends JFrame{
	JLabel la;
	MouseListenerEx(){
		setTitle("mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane =new JPanel();
		//����Ʈ �� ����
		setContentPane(contentPane);
		
		setLayout(null);//����Ʈ ���� ��ġ������ ����
		
		//����Ʈ���� �̺�Ʈ �߻�, ����Ŭ������ ó��
		//contentPane.addMouseListener(new MyMouseListener());
		contentPane.addMouseListener(new MyMouseListener());
		//hello ���̺����,�۲�, ������, ���ڻ�
		la = new JLabel("Hello");
		la.setFont(new Font("�ü�",Font.ITALIC,50));
		la.setForeground(Color.white);
		la.setOpaque(true);//���� =>���������� ����
		la.setBackground(Color.red);
		
		//hello ���̺� ũ�� ����, ��ġ����
		la.setSize(200,50);
		la.setLocation(30,30);
		
		//����Ʈ���� ���̱�
		contentPane.add(la);
		
		setSize(800,500);
		setVisible(true);
		}
	
	class MyMouseListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x,y);
		}
//		
//		
	}
	public static void main(String[] args) {
		new MouseListenerEx();
		
		
		
		

	}

}
