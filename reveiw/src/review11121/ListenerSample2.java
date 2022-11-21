package review11121;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerSample2 extends JFrame {
	ListenerSample2() {
		setTitle("ListenerSample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(5, 5));
		JButton jb = new JButton("Mouse Event 테스트");
		JButton jb2 = new JButton("Mouse Event 테스트");
		JButton jb3 = new JButton("Mouse Event 테스트");
		jb.setBackground(Color.yellow);
		MyActionListener listener = new MyActionListener();
		jb.addActionListener(listener);
		//jb.addMouseListener(listener);//요걸 해줘야 기능을 함
		jb.addMouseListener(new MouseAdapter() {//이렇게 해도 됨
			@Override
			public void mouseEntered(MouseEvent e) {
				jb.setBackground(Color.blue);
				System.out.println(jb.getBackground());
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				jb.setBackground(Color.green);
				System.out.println(jb.getBackground());
			}
		});
		add(jb);add(jb3);add(jb2);
		setVisible(true);
		setSize(500, 500);
	}

	class MyActionListener implements /* MouseListener ,*/ ActionListener {

		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();// getsource 요거 질문하고싶다.
			if (b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");

		}

//		@Override
//		public void mouseClicked(MouseEvent e) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			JButton jb = (JButton) e.getSource();
//			jb.setBackground(Color.red);
//
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			JButton jb = (JButton) e.getSource();
//			jb.setBackground(Color.green);
//
//		}

	}

	public static void main(String[] args) {
		new ListenerSample2();

	}

}
