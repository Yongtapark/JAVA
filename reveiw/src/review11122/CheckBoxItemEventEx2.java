package review11122;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx2 extends JFrame {
	Container contentPane;
	JCheckBox[]fruits=new JCheckBox[3];
	String[]names= {"���","��","ü��"};
	JLabel sumLabel;
	int sum=0;
	CheckBoxItemEventEx2(){
	contentPane=getContentPane();
	contentPane.setLayout(new FlowLayout());
	
	contentPane.add(new JLabel("��� 100��, ��500�� ,ü�� 20000��"));
	for(int i=0;i<fruits.length;i++) {
		fruits[i] =new JCheckBox(names[i]);
		fruits[i].setBorderPainted(true);
		contentPane.add(fruits[i]);
		fruits[i].addItemListener(new Myitemlist());
		
	}
	sumLabel=new JLabel("���� 0���Դϴ�.");
	contentPane.add(sumLabel);
	setSize(500,500);
	setVisible(true);
	}
	
	class Myitemlist implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			int selected=1;
			if(e.getStateChange()==ItemEvent.SELECTED)
				selected=1;
			else {
				selected=-1;
			}
			if(e.getItem()==fruits[0])
				sum=sum+selected*100;
			else if(e.getItem()==fruits[1])
				sum=sum+selected*500;
			else
				sum=sum+selected*20000;
			
			sumLabel.setText("����"+ sum+"���Դϴ�.");
			
			
		}
		
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx2();

	}

}
