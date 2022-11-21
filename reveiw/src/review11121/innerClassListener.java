package review11121;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class innerClassListener extends JFrame {
	innerClassListener(){
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		JButton btn=new JButton("Acton");
		//btn.addActionListener(new MyActionListener1());
		
		//익명클래스로 이벤트 처리하기
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b= (JButton)e.getSource();
				if(b.getText().equals("action"))
					b.setText("액션");
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
//				b.setText("액션");
//			else
//				b.setText("Action");
//		}
//	}

	public static void main(String[] args) {
		new innerClassListener();
	}

}
