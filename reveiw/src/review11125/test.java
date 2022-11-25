package review11125;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test extends JFrame {

	test() {

		Container c = getContentPane();
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TextPanel tp = new TextPanel();
		MyPanel mp = new MyPanel();// 계산기 패널 선언

		add(tp, BorderLayout.NORTH);
		add(mp);
		
		setSize(300, 400);
		setVisible(true);
	}

	class TextPanel extends JPanel {
		TextPanel() {
			JTextField result = new JTextField(30); // 위의 텍스트창 선언
			add(result);
		}
	}

	class MyPanel extends JPanel {
		
		String[] padsString = { "c", "+/-", "%", "/", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+",
				"0", "000", ".", "=" };
		JButton[] pads = new JButton[20];
		
		public MyPanel() {
			setLayout(new GridLayout(5, 4, 2, 2));
			for (int i = 0; i < pads.length; i++) {
				pads[i] = new JButton(padsString[i]);

				add(pads[i]);
				String s= pads[i].getText();
//---------------------------------------------------------------------------------------------------
			pads[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						TextPanel mp =new TextPanel();
						System.out.println(s);
						if("c".equals(s)) {
							
							System.out.println("c");
						}
						
					}
		
				
			});
			
			}
			//-------------------------------------------------------------------
			
//			pads[0].addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					tp.result.setText("2");
					//System.out.println(pads[0].getText());
//
//				}
//			});
			//------------------------------------------------------------------
			
			
			
//			pads[0].addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					tp.result.setText("");
//					System.out.println("pads[0]");
//
//				}
//			});
//			pads[1].addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					tp.result.setText("");
//					System.out.println("pads[1]");
//
//				}
//			});
//			pads[2].addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					tp.result.setText("");
//					System.out.println("padsTop[2]"+pads[2].getText());
//
//				}
//			});
//			pads[3].addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					tp.result.setText("");
//					System.out.println("pads[3]");
//
//				}
//			});

		}

	}

	public static void main(String[] args) {
		new test();

	}

}
