package review11125;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuAndFileDialogEx extends JFrame {
	Container c = getContentPane();
	JLabel imageLabel = new JLabel();

	MenuAndFileDialogEx() {
		c.add(imageLabel);
		creatMenu();
		setSize(250, 200);
		setVisible(true);
	}

	void creatMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("open");
		openItem.addActionListener(new OpenActionListener());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}

	class OpenActionListener implements ActionListener{
		JFileChooser chooser;
		OpenActionListener(){
			chooser=new JFileChooser();
			}
		@Override
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter=new FileNameExtensionFilter("JPG & GIF Images","jpg","gif");
			chooser.setFileFilter(filter);
			int ret=chooser.showOpenDialog(null);
			if(ret!=JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null,"파일을 선택하지 않았습니다","경고",JOptionPane.WARNING_MESSAGE);
			return;
		}
		String filePath =chooser.getSelectedFile().getPath();
		imageLabel.setIcon(new ImageIcon(filePath));
		pack();
		
	}}

	public static void main(String[] args) {
		new MenuAndFileDialogEx();

	}

}
