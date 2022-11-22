package image;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class SliderEx extends JFrame{
	Container contentPane;
	SliderEx(){
		setTitle("sliderEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JSlider slide=new JSlider(JSlider.HORIZONTAL,0,200,100);
		slide.setPaintLabels(true);
		slide.setPaintTicks(true);
		slide.setPaintTrack(true);
		slide.setMajorTickSpacing(50);
		slide.setMinorTickSpacing(10);
		slide.setForeground(Color.green);
		slide.setBackground(Color.black);
		
		contentPane.add(slide);
		
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
	new SliderEx();

	}

}
