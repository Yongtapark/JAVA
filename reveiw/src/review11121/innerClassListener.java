package review11121;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class innerClassListener extends JFrame {
	innerClassListener(){
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		JButton btn=new JButton("Acton");
		//btn.addActionListener(new MyActionListener1());
		
		//�͸�Ŭ������ �̺�Ʈ ó���ϱ�
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b= (JButton)e.getSource();
				if(b.getText().equals("action"))
					b.setText("�׼�");
				else
					b.setText("action");
				setTitle(b.getText());
				
			}
		});
		add(btn);
		
		
	}
	
//	private class MyActionListener1 implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			JButton b= (JButton)e.getSource();
//			if(b.getText().equals("Action"))
//				b.setText("�׼�");
//			else
//				b.setText("Action");
//		}
//	}

	public static void main(String[] args) {
		new innerClassListener();
	}

}
