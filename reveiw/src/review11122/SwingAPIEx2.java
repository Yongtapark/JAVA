package review11122;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingAPIEx2 extends JFrame {
	Container contentPane;
	JLabel la;
	JButton b1, b2, b3, b4;

	public SwingAPIEx2() {
		setTitle("Swing 공통 메소드 예쩨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		b1 = new JButton("위치와 크기 정보");
		b2 = new JButton("모양정보");
		b3 = new JButton("작동하지 않는 버튼");
		b4 = new JButton("숨기기/보이기");

		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);
		
		//버튼설정
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.red);
		b2.setFont(new Font("고딕체",Font.ITALIC,20));
		b3.setEnabled(false);

		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(contentPane.getX() + "," + contentPane.getY() + contentPane.getSize());
			}
		});

		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(b2.getFont());
				System.out.println(b2.getBackground());
				System.out.println(b2.getForeground());
			}

		});
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(b1.isVisible()) {
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);	
				}else {
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
				}
			}
		});

		setVisible(true);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new SwingAPIEx2();

	}

}
