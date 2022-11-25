package review11125;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolBarEx extends JFrame	{
	Container c=getContentPane();
	ToolBarEx(){
		setTitle("ToolBarEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		creatToolBar();
		setSize(400,200);
		setVisible(true);
	}
	
	void creatToolBar() {
		JToolBar toolBar=new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("src/image/a.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("src/image/a.jpg")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		JComboBox combo =new JComboBox();
		combo.addItem("JAVA");
		combo.addItem("JAVA2");
		combo.addItem("JAVA3");
		combo.addItem("JAVA4");
		toolBar.add(combo);
		c.add(toolBar,BorderLayout.NORTH);
		
		
	}

	public static void main(String[] args) {
		new ToolBarEx();

	}

}
