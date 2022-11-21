package review11121;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerSample extends JFrame {
	ListenerSample() {
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn1 = new JButton("Action");
		JButton btn2 = new JButton("문제");
		// btn2.setBackground(Color.yellow);
		JButton btn3 = new JButton("풀이");

		MyActionListener listener = new MyActionListener();
		// 외부클래스 처리기로 등록
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);

		// 마우스 이벤트 발생
		/*
		 * btn1.addMouseListener(new MouseListener() {
		 * 
		 * @Override public void mouseReleased(MouseEvent e) {
		 * 
		 * }
		 * 
		 * @Override public void mousePressed(MouseEvent e) {
		 * 
		 * }
		 * 
		 * @Override public void mouseExited(MouseEvent e) {
		 * btn1.setBackground(Color.yellow); }
		 * 
		 * @Override public void mouseEntered(MouseEvent e) {
		 * btn1.setBackground(Color.red); }
		 * 
		 * @Override public void mouseClicked(MouseEvent e) {
		 * 
		 * } });
		 */

		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setBackground(Color.yellow);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setBackground(Color.red);
			}

		});
		
		btn2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn2.getForeground().equals(Color.red))
					btn2.setForeground(Color.green);
				else
					btn2.setBackground(Color.red);
				
			}

		});
		add(btn1);
		add(btn2);
		add(btn3);
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListenerSample();

	}

}

//Action->액션, 문제-->결과, 풀이-->과정
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("action")) {
			b.setText("액션");
			System.out.println(b.getText());
		} else if (b.getText().equals("액션")) {
			b.setText("action");
			System.out.println(b.getText());
		} else if (b.getText().equals("문제")) {
			b.setText("결과");
			System.out.println(b.getText());
		} else if (b.getText().equals("풀이")) {
			b.setText("과정");
			System.out.println(b.getText());
		} else
			b.setText("풀이");
		System.out.println(b.getText());
	}

}
