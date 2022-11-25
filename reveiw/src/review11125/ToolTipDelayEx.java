package review11125;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ToolTipManager;

public class ToolTipDelayEx extends JFrame{
	Container c=getContentPane();
	ToolTipDelayEx(){
		c.setLayout(new FlowLayout());
		JLabel cherryLabel=new JLabel(new ImageIcon("src/image/a.jpg"));
		cherryLabel.setToolTipText("체리 이미지 어때요");
		JLabel appleLabel =new JLabel(new ImageIcon("src/image/a.jpg"));
		appleLabel.setToolTipText("수지 이미지어때요");
		c.add(appleLabel);
		c.add(cherryLabel);
		
		ToolTipManager m= ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		
		setSize(400,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ToolTipDelayEx();

	}

}
