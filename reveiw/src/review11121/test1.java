package review11121;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test1 extends JFrame {
	public test1() {
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Action");
		JButton btn1 = new JButton("����");
		JButton btn2 = new JButton("Ǯ��");
		//�ܺ�Ŭ���� ȣ��
		MyActionListener2 listener=new MyActionListener2();
		//�ܺ�Ŭ���� ó����� ���
		btn.addActionListener(listener);//�ܺ�Ŭ���� ó����� ���
		btn1.addActionListener(listener);//�ܺ�Ŭ���� ó����� ���
		btn2.addActionListener(listener);//�ܺ�Ŭ���� ó����� ���
		
		//���콺 �̺�Ʈ �߻�
/*		btn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) { }
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn.setBackground(Color.YELLOW);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setBackground(Color.RED);
            }	
			@Override
			public void mouseClicked(MouseEvent e) {	}
		}); */
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btn.setBackground(Color.YELLOW);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setBackground(Color.RED);
			}
		});
       btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn1.getForeground().equals(Color.red)) {
						btn1.setForeground(Color.green);
				}else {
					btn1.setForeground(Color.red);
				}
			}
		});
		add(btn);
		add(btn1);
		add(btn2);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListenerSample();
	}
};
//�̺�Ʈ ó����
//Action->�׼�, ����-->���, Ǯ��-->����
class MyActionListener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton) e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("�׼�");
			System.out.println(b.getText());
		}else if(b.getText().equals("�׼�")) {
			b.setText("Action");
			System.out.println(b.getText());
		}else if(b.getText().equals("����")) {
			b.setText("���");
			System.out.println(b.getText());
		}else if(b.getText().equals("Ǯ��")) {
			b.setText("����");
			System.out.println(b.getText());
		}else  {
			b.setText("Ǯ��");
			System.out.println(b.getText());
		}
	}
}