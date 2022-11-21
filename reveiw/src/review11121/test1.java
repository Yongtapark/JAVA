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
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Action");
		JButton btn1 = new JButton("문제");
		JButton btn2 = new JButton("풀이");
		//외부클래스 호출
		MyActionListener2 listener=new MyActionListener2();
		//외부클래스 처리기로 등록
		btn.addActionListener(listener);//외부클래스 처리기로 등록
		btn1.addActionListener(listener);//외부클래스 처리기로 등록
		btn2.addActionListener(listener);//외부클래스 처리기로 등록
		
		//마우스 이벤트 발생
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
//이벤트 처리기
//Action->액션, 문제-->결과, 풀이-->과정
class MyActionListener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton) e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("액션");
			System.out.println(b.getText());
		}else if(b.getText().equals("액션")) {
			b.setText("Action");
			System.out.println(b.getText());
		}else if(b.getText().equals("문제")) {
			b.setText("결과");
			System.out.println(b.getText());
		}else if(b.getText().equals("풀이")) {
			b.setText("과정");
			System.out.println(b.getText());
		}else  {
			b.setText("풀이");
			System.out.println(b.getText());
		}
	}
}