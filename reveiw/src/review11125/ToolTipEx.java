package review11125;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolTipEx extends JFrame{
	Container c=getContentPane();
	
	ToolTipEx(){
		setTitle("ToolTipEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createToolBar();
		setSize(400,200);
		setVisible(true);
	}
	
	void createToolBar() {
		JToolBar jt=new JToolBar();
		jt.setBackground(Color.lightGray);
		JButton NewBtn=new JButton("new");
		NewBtn.setToolTipText("������ �����մϴ�.");
		jt.add(NewBtn);
		
		JButton openBtn=new JButton(new ImageIcon("src/image/a.jpg"));
		openBtn.setToolTipText("������ ���ϴ�");
		jt.add(openBtn);
		jt.addSeparator();
		
		
		
		JButton saveBtn=new JButton(new ImageIcon("src/image/a.jpg"));
		saveBtn.setToolTipText("������ �����մϴ�.");
		jt.add(saveBtn);
		
		jt.add(new JLabel("search"));
		
		JTextField tf=new JTextField("text field");
		tf.setToolTipText("ã���� �ϴ� ���ڿ��� �Է��ϼ�Ŀ�");
		jt.add(tf);
		c.add(jt,BorderLayout.NORTH);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToolTipEx();
	}

}
