package review11122;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame {
	Container contentPane;
	String[] fruits = { "apple", "grape", "banan", "mango", "pear", "peach", "berry", "strawberry", "grape", "banan",
			"mango", "pear", "grape", "banan", "mango", "pear" };
	ImageIcon[] images = { new ImageIcon("src/image/a.jpg"), new ImageIcon("src/image/b.png"),
			new ImageIcon("src/image/images.jpg") };

	public ListEx() {
		setTitle("ListEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JList strList = new JList(fruits);
		contentPane.add(strList).addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("인덱스 :"+strList.getSelectedIndex());
			}
		});;

		JList imageList = new JList();
		imageList.setListData(images);
		contentPane.add(imageList).addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(images[imageList.getSelectedIndex()]);
				System.out.println(images[0]);// 이렇게 직접적으로 써도 값이 나오네
			}
		});;

		JList scrolList = new JList(fruits);
		contentPane.add(new JScrollPane(scrolList));

		setSize(300, 300);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new ListEx();

	}

}
