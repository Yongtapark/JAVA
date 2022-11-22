package review11122;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame{
	Container contentPane;
	JCheckBox [] fruits =new JCheckBox[3];
	String [] names= {"���","��","ü��"};
	JLabel sumLabel;
	int sum=0;
	//�ʱ�ȭ
	
	CheckBoxItemEventEx(){
		setTitle("üũ�ڽ��� Item event ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane= getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("��� 100��, �� 500��, ü�� 20000��")); // JLabel ����2
		for(int i=0; i<fruits.length;i++) {
			fruits[i]=new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			contentPane.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
		}
		sumLabel =new JLabel("���� 0�� �Դϴ�.");//JLabel ����3
		contentPane.add(sumLabel);
		setSize(250,200);
		setVisible(true);
				
	}

	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			int selected =1;
			System.out.println(e.getStateChange()+"...");
			if(e.getStateChange()==ItemEvent.SELECTED)
				selected=1;//üũ
			else
				selected=-1;//üũ����
			if(e.getItem()==fruits[0])
				sum=sum+selected*100;
			else if(e.getItem() == fruits[1])
				sum= sum+selected*500;
			else
				sum = sum+selected*20000;
					
			
			sumLabel.setText("����"+sum+"�� �Դϴ�.");
			System.out.println(sum);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
