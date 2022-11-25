package review11125;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class MenuActionEventEx extends JFrame{
	Container contentPane;
	JLabel label= new JLabel("heloo");
	
	public MenuActionEventEx() {
		setTitle("MenuActionEventEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane=getContentPane();
		contentPane.add(label,BorderLayout.CENTER);
		creatMenu();
		setSize(250,200);
		setVisible(true);
	}
	
	void creatMenu() {
		JMenuBar mb=new JMenuBar();
		JMenuItem [] menuItem =new JMenuItem[5];
		String[] itemTitle= {"Color","Font","Top","Bottom","center"};
		JMenu FileMenu =new JMenu("Text");
		for(int i=0; i<menuItem.length;i++) {
			menuItem[i]=new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(new MenuActionListener());
			FileMenu.add(menuItem[i]);
		}
		mb.add(FileMenu);
		this.setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd=e.getActionCommand();
			if(cmd.equals("Color"))
				label.setForeground(Color.blue);
			else if (cmd.equals("Font")) 
				label.setFont(new Font("Ravie",Font.ITALIC,30));
			else if(cmd.equals("Top"))
				label.setVerticalAlignment(SwingConstants.TOP);
			else if(cmd.equals("Bottom"))
				label.setVerticalAlignment(SwingConstants.BOTTOM);
			else
				label.setVerticalAlignment(SwingConstants.CENTER);
			}
			
		}
		
	

	public static void main(String[] args) {
	new MenuActionEventEx();

	}

}
