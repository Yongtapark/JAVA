package review11125;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame{
	MenuEx(){
		setTitle("MenuEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		creatMenu();
		setSize(250,200);
		setVisible(true);
	}
	void creatMenu() {
		JMenuBar mb=new JMenuBar();
		JMenu fileMenu=new JMenu("file");
		
		fileMenu.add(new JMenuItem("new"));
		fileMenu.add(new JMenuItem("OPen"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("save"));
		fileMenu.add(new JMenuItem("saveAs"));
		
		mb.add(fileMenu);
		
		mb.add(new JMenu("edit"));
		mb.add(new JMenu("source"));
		mb.add(new JMenu("project"));
		mb.add(new JMenu("run"));
		this.setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new MenuEx();

	}

}
