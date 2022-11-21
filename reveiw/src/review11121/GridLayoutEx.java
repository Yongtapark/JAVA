package review11121;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GridLayoutEx extends JFrame{
	GridLayoutEx(){
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid= new GridLayout(5,2);
		grid.setVgap(5);
		setLayout(grid);//��ġ������ ����
		//���̺� ��ü ����
		JLabel jb1=new JLabel("�̸�",JLabel.CENTER);
		JLabel jb2=new JLabel("�а�");
		JLabel jb3=new JLabel("����");
		JLabel jb4=new JLabel("�й�");
		
	
		
		//�ؽ�Ʈ ��ü ����
		JTextField jt1=new JTextField("ȫ�浿");
		JTextField jt2=new JTextField("");
		JTextField jt3=new JTextField("");
		JTextField jt4=new JTextField("");
		
		//��ư ��ü ����
		JButton btn1 =new JButton("Ȯ��");
		JButton btn2 =new JButton("���");
		btn1.setFont(new Font("����",Font.BOLD,20));
		btn2.setFont(new Font("����",Font.BOLD,20));
		
		//������ ���� ���� ���̺�/�ؽ�Ʈ ���� ���̱�
		add(jb1); add(jt1);
		add(jb2); add(jt2);
		add(jb3); add(jt3);
		add(jb4); add(jt4);
		add(btn1); add(btn2);
		//�̺�Ʈ ���� �ҽ�=������Ʈ.�̺�Ʈ �����(addXXListener)(�̺�Ʈ ó����(){�����Ҹ޼ҵ�})
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(e);
				System.out.println("�̸� :"+jt1.getText());
				System.out.println("�й� :"+jt2.getText());
				System.out.println("�а� :"+jt3.getText());
				System.out.println("���� :"+jt4.getText());
				
			}
		});
		
		//��Ҹ� ���� ĭ ����
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
				jt4.setText("");
				
				
			}
		});
		
		//�̸��� ������ �ֱ�/ �׳� �ָ� ����ȵ�, ���� ���̺��� ������ ������
		jb1.setOpaque(true);//�������ϰ� ����� �� �ֱ�
		jb1.setBackground(Color.blue);
		jb1.setForeground(Color.white);
		
		
		jt1.setBackground(Color.orange);
		jt2.setBackground(Color.orange);
		jt2.setBackground(Color.orange);
		jt2.setBackground(Color.orange);
		
		
		
//		add(new JLabel("�̸�"));
//		add(new JTextField(""));
//		add(new JLabel("�й�"));
//		add(new JTextField(""));
//		add(new JLabel("�а�"));
//		add(new JTextField(""));
//		add(new JLabel("����"));
//		add(new JTextField(""));
		
		setSize(300,200); //������ ũ������
		setVisible(true); //������ ȭ�鿡 ���̱�
	}
	public static void main (String[] args) {
		new GridLayoutEx();
	}

}
