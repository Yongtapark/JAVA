package review11122;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioButtonItemEventEx extends JFrame {
	Container contentPane;
	JRadioButton [] radio =new JRadioButton[3];
	String[] text= {"사과","배","체리"};
	ImageIcon[] image= {
			new ImageIcon("src/image/a.jpg"),
			new ImageIcon("src/image/b.png"),
			new ImageIcon("src/image/images.jpg")
	};
	JLabel imageLabel =new JLabel();//이미지 표시용 라벨 생성
	
	public RadioButtonItemEventEx() {
		setTitle("RadioButtonItemEventEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JPanel panel =new JPanel();//패널 생성
		panel.setBackground(Color.gray);
		
		ButtonGroup g=new ButtonGroup();
		for(int i=0; i<radio.length;i++) {
			radio[i]= new JRadioButton(text[i]);
			g.add(radio[i]);
			panel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[2].setSelected(true);
		contentPane.add(panel,BorderLayout.NORTH);//container에 panel을 보더레이아웃방식으로 북쪽에 부착
		contentPane.add(imageLabel,BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.DESELECTED)
				return;
			if(radio[0].isSelected())
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else
				imageLabel.setIcon(image[2]);
			
		}
		
	}
	public static void main(String[] args) {
		new RadioButtonItemEventEx();

	}

}
