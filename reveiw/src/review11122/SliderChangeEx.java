package review11122;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeEx extends JFrame {
	Container contentPane;
	JLabel colorLabel;
	JSlider[]sl=new JSlider[3];
	
	SliderChangeEx(){
		
		
		setTitle("slider");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		colorLabel=new JLabel("slider example");
		for(int i=0; i<sl.length;i++) {
			sl[i]=new JSlider(JSlider.HORIZONTAL,0,255,128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].setBackground(Color.black);
			sl[i].addChangeListener(new MyChangeListener());
			contentPane.add(sl[i]);
		}
		sl[0].setForeground(Color.red);
		sl[1].setForeground(Color.green);
		sl[2].setForeground(Color.blue);
		contentPane.add(colorLabel);
		colorLabel.setSize(300,300);
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(sl[0].getValue(),sl[1].getValue(),sl[2].getValue()));
		setSize(500,500);
		setVisible(true);
	}
		class MyChangeListener implements ChangeListener{

			@Override
			public void stateChanged(ChangeEvent e) {
				colorLabel.setBackground(new Color(sl[0].getValue(),sl[1].getValue(),sl[2].getValue()));
				
			}
			
		}
	

	public static void main(String[] args) {
		new SliderChangeEx();

	}

}
