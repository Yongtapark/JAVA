package review11125;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class MenuAndColorChooserEx extends JFrame {
	Container c = getContentPane();
	JLabel label = new JLabel("heoo");

	public MenuAndColorChooserEx() {

		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label, BorderLayout.CENTER);
		creatMenu();
		setSize(250, 200);
		setVisible(true);
	}

	void creatMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem colorMenuItem = new JMenuItem("Color");
		JMenu fileMenu = new JMenu("TExt");
		colorMenuItem.addActionListener(new MenuActionListener());
		fileMenu.add(colorMenuItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}

	class MenuActionListener implements ActionListener {
		JColorChooser chooser = new JColorChooser();

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if (cmd.equals("Color")) {
				Color selectedColor = chooser.showDialog(null, "Color", Color.yellow);
				if (selectedColor != null)
					label.setForeground(selectedColor);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuAndColorChooserEx();
	}

}
