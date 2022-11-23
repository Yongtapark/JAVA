package review11122;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test2 extends JFrame {
	String[] names = { "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };
	JLabel[] labels = new JLabel[8];
	JTextField[] text = new JTextField[8];
	int sum;

	public test2() {

		setVisible(true);
		setSize(500, 500);
		// 패널2개 만들기
		setBackground(Color.pink);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();

		// 패널을 위아래로부착
		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);

		// jp1에 붙일 요소들(라벨,텍스트,버튼),색상변경 /부착
		jp1.setBackground(Color.pink);
		JLabel head = new JLabel("금액");
		JTextField result = new JTextField(10);
		JButton btn = new JButton("계산");
		jp1.add(head);
		jp1.add(result);
		jp1.add(btn);
		// btn 속성

		// jp2(라벨,텍스트)/부착/grid?
		jp2.setBackground(Color.pink);
		jp2.setLayout(new GridLayout(8, 2));
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(names[i], JLabel.CENTER);
			text[i] = new JTextField(10);
			jp2.add(labels[i]);
			jp2.add(text[i]);
		}
		//text[0].addActionListener(new calc);
		
		class calc implements ActionListener{
			int[] a= {50000,10000,1000,500,100,50,10,1};
			int[] b=new int[8];
			int sum=0;
			
			@Override
			public void actionPerformed(ActionEvent e) {

//				for(int i=0; i<a.length;i++) {
//					b[i]=a[i]*(Integer.parseInt(b[i].))
//					}
				
			}
		}

		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				result.setText(String.valueOf(sum));
				System.out.println(sum);

			}
		});

	}

	public static void main(String[] args) {
		new test2();

	}

}
