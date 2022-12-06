package firstProject;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class AddPane extends JPanel implements ActionListener, ItemListener {
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb;// �����ϱ�
	private JButton rsb;// �ٽþ���
	private int department = 10;
	// �Է� ���� �׸��� ����
	String[] caption = { "�� �� :", "�� å :", "�� �� :", "�� �� :" };

	public AddPane() {
		setLayout(new GridLayout(6, 1));
		EtchedBorder eb = new EtchedBorder();// ���鿡 ȿ�� �ֱ�
		// �� ���۳�Ʈ�� ��踦 �����մϴ�.
		setBorder(eb);

		// �Է� ���� �׸��� ������ ���Ѵ�.
		int size = caption.length;
		System.out.println(size);
		// �ؽ�Ʈ �ʵ�� ���̺��� �гο� ��� AddPane�� ���δ�.

		int i, j = 1;
		for (i = 0; i < size - 1; i++) {
			j++;
			System.out.print(i + " ");
			System.out.print(caption[i]);

			jp[i] = new JPanel();
			jp[i].setBackground(new Color(j * 60, j * 50, j * 30));
			jl[i] = new JLabel(caption[i]); // �Է¹��� ������ ���� ���̺�
			tf[i] = new JTextField(15); // ��� ���� �Է��� ���� �ؽ�Ʈ �ʵ�

			jp[i].add(jl[i]);// �гο� ���̺� ���̱�
			jp[i].add(tf[i]); // �гο� �ؽ�Ʈ�ʵ� ���̱�

			System.out.println(this + ".....");
			setBackground(Color.yellow);
			add(jp[i]); // �г� ���̱�
		}

		// ȭ���� �̷��ϰ� ����� ���� ������ Ȯ���ϱ� ���� �г� �߰�//������ 4��° �г�
		System.out.println("\n�������г� " + i);
		jp[i] = new JPanel();
		jp[i].setBackground(Color.cyan);
		jl[i] = new JLabel(caption[i]);
		jp[i].add(jl[i]); // ȭ���� ������ Ȯ���Ѵ�.
		add(jp[i]);
		// �μ� ������ ���� �޺��ڽ� ����
		JComboBox combo = new JComboBox();
		combo.addItem("�μ���ȣ�� �����ϼ���");

		// 10~50������ �μ���ȣ�� �޺��ڽ� �׸����� �߰�
		for (int c = 1; c <= 5; c++)
			combo.addItem(c * 10);// �μ� ��ȣ �߰�

		System.out.println("\n�޺��� �г���ġ: " + i);
		jp[i].add(combo); // �޺��ڽ��� �гο� �߰�
		// combo.addActionListener(this);//�޺��ڽ� �̺�Ʈ ó��
		combo.addItemListener(this);

		jp[size] = new JPanel();// �г� �迭�� ������ ���� ���� 5��° �г�
		// ��ư ����/ �̺�Ʈ ó��
		okb = new JButton("�����ϱ�");
		okb.addActionListener(this);
		rsb = new JButton("�ٽþ���");
		rsb.addActionListener(this);
		jp[size].setBackground(Color.pink);
		// �гο� ��ư �߰�
		jp[size].add(okb); // size �Է� ���� �׸��� ������ ���Ѵ�.
		jp[size].add(rsb);
		add(jp[size]);// ��ư�� ������ �г��� AppPane�� �߰�

	}

	// ��ư�� ���� �̺�Ʈ ó��
	public void actionPerformed(ActionEvent ae) {
		String ae_type = ae.getActionCommand();
		EmployeeVO evo = null;
		EmployeeDAO edvo = null;

		if (ae_type.equals(okb.getText())) {// �����ϱ� ��ư�� Ŭ���Ǿ��� ���
			try {
				evo = new EmployeeVO(0, tf[0].getText(), tf[1].getText(), department, tf[2].getText());

				// �Է¹��� ��� ������ ��� �߰��ϱ� ���� DAO��ü ����
				edvo = new EmployeeDAO();

				// ��� �߰��ϱ� ���� �޼ҵ� ȣ�� -------����
				evo = edvo.getEmployeeRegist(evo);
			} catch (Exception e) {
				System.out.println("���� �����ư Ŭ���� e=[" + e + "]");
			}
			if (edvo != null)
				JOptionPane.showMessageDialog(this, tf[0].getText() + "���� ���������� �߰���");
		} else if (ae_type.equals(rsb.getText())) {// �ٽþ��� ��ư�� Ŭ���Ǿ�����
			int size = caption.length;

			// �ؽ�Ʈ �ʵ带 �ʱ�ȭ �Ѵ�.
			for (int i = 0; i < size - 1; i++) {
				tf[i].setText("");
			}
		}
		System.out.println(evo.toString());

	}
	// �޺��ڽ��� ���õǾ����� ȣ��Ǵ� �̺�Ʈ ó�� �޼ҵ�

	public void itemStateChanged(ItemEvent ie) {
		System.out.println("���õ� ������=" + ie.getItem());
		if (ie.getStateChange() == ItemEvent.SELECTED)// �׸��� ���õǸ�
			department = Integer.parseInt(ie.getItem().toString());// ���õ� �׸��� ������ ��ȯ �� ����
	}

}