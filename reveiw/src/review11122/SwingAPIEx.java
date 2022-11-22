package review11122;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingAPIEx extends JFrame {
	Container contentPane;
	JLabel la;
	JButton b1, b2, b3, b4;

	SwingAPIEx() {
		setTitle("SwingAPI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();// <<요거 뭐징 //슬라이드 얻기라는데 이해안감
		contentPane.setLayout(new FlowLayout());

		b1 = new JButton("위치와 크기 정보");
		b1.addActionListener(new MyButtonListener());
		contentPane.add(b1);
		
		b2= new JButton("모양 정보");
		b2.setOpaque(true);
		b2.setForeground(Color.magenta);
		b2.setBackground(Color.yellow);
		b2.setFont(new Font("고딕체",Font.ITALIC,20));
		b2.addActionListener(new MyButtonListener());
		contentPane.add(b2);
		
		b3= new JButton("작동하지 않는 버튼");
		b3.setEnabled(false);
		b3.addActionListener(new MyButtonListener());
		contentPane.add(b3);
		
		b4=new JButton("숨기기/보이기");
		b4.addActionListener(new MyButtonListener());
		contentPane.add(b4);

		setVisible(true);
		setSize(250, 200);
	}

	class MyButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();//object로 만들어놔야 모든 버튼들을 비교가능
			if (source == b1) {
				System.out.println("버튼의 위치와 크기");
				System.out.println("위치 = (" + b1.getX() + "," + b1.getY() + ")");
				System.out.println("크기 = (" + b1.getWidth() + "," + b1.getHeight() + ")");

				JPanel c = (JPanel) b2.getParent();//머야이거 언제붙임
				//Container c = (Container) b2.getTopLevelAncestor();//이렇게도 가능 JFrame을 넣어도 됨
				System.out.println("..."+c);
				
				
				
				System.out.println("컨텐트팬의 위치와 크기");
				System.out.println("위치 = (" + c.getX() + "," + c.getY() + ")");
				System.out.println("크기 = (" + c.getWidth() + "," + c.getHeight() + ")");
			} else if (source == b2) {
				System.out.println("폰트 =" + b2.getFont());
				System.out.println("배경색 =" + b2.getBackground());
				System.out.println("글자색 =" + b2.getForeground());
			} else {
				if (b1.isVisible()) {
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
				} else {
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);

				}
			}

		}

	}

	public static void main(String[] args) {
		new SwingAPIEx();
	}

}
