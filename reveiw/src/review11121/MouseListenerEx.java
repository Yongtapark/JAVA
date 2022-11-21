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
		setTitle("mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane =new JPanel();
		//컨텐트 팬 변경
		setContentPane(contentPane);
		
		setLayout(null);//컨텐트 팬의 배치관리자 삭제
		
		//컨텐트팬의 이벤트 발생, 내부클래스로 처리
		//contentPane.addMouseListener(new MyMouseListener());
		contentPane.addMouseListener(new MyMouseListener());
		//hello 레이블생성,글꼴, 바탕색, 글자색
		la = new JLabel("Hello");
		la.setFont(new Font("궁서",Font.ITALIC,50));
		la.setForeground(Color.white);
		la.setOpaque(true);//투명 =>불투명으로 설정
		la.setBackground(Color.red);
		
		//hello 레이블 크기 설정, 위치설정
		la.setSize(200,50);
		la.setLocation(30,30);
		
		//컨텐트팬의 붙이기
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
