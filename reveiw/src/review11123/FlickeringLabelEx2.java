package review11123;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx2 extends JFrame{
	Container c=getContentPane();
	FlickeringLabelEx2(){
		
	
		setVisible(true);
		setSize(500,500);
		c.setLayout(new FlowLayout());
		
		FlickeringLabel flabel=new FlickeringLabel("±ôºý");
		JLabel label=new JLabel("¾È±ôºý");
		FlickeringLabel flabel2=new FlickeringLabel("±ôºý");
		c.add(flabel);
		c.add(flabel2);
		c.add(label);
	}
	class FlickeringLabel extends JLabel implements Runnable{
		public FlickeringLabel(String s) {
			super(s);
			Thread th=new Thread(this);
			th.start();
		}
		@Override
		public void run() {
			setOpaque(true);
			int n=0;
			while(true) {
				if(n==0) {
					setBackground(Color.yellow);
				}else {
					setBackground(Color.green);
				}
				if(n==0) {
					n=1;
				}else {
					n=0;
				}try {
					Thread.sleep(500);
				}catch (InterruptedException e) {
					return;
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		new FlickeringLabelEx2();

	}

}
