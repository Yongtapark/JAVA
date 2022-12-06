package firstProject;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class FindPane extends JPanel implements ActionListener {
	// Swing ���� ���
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb;
	private JButton rsb;

	String[] caption = { "�� ��:", "�� �� :", "�� å :", "�� �� :", "�� �� :" };

	public FindPane() {
		setLayout(new GridLayout(7, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;
		// ���̺��� ����
		for (int i = 0; i < size; i++) {
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i] = new JPanel();
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
			// �ؽ�Ʈ�ʵ带 �Է� �Ұ����� ���·� �����.
			tf[i].setEditable(false);
			if (i == 0 || i == 1)
				// ����� �̸����� �˻��ؾ� �Է� ������ ���·� �����.
				tf[i].setEditable(true);

		}

		// �����ȸ, �ٽþ��� ��ư ���� �� �̺�Ʈ�� ó��, �гο� ����
		jp[size] = new JPanel();
		okb = new JButton("���������ȸ");
		okb.addActionListener(this);
		rsb = new JButton("�ٽþ���");
		rsb.addActionListener(this);
		jp[size].add(okb);
		jp[size].add(rsb);
		add(jp[size]);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// �̺�Ʈ�� �߻��� ��ư ĸ���� ���� ���´�.
		String ae_type = ae.getActionCommand();

		EmployeeVO evo = null;// �˻��� ��� ������ ������ VO��ü ����
		EmployeeDAO edvo = null;// ���ó���� ���� DAO��ü ����

		if (ae_type.equals(okb.getText())) {// �����ȸ ��ư�� Ŭ���Ǿ��� ���
			try {
				// ���ó���� ���� DAO��ü ����
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();

				// ����� �̸� �Է��� ��� �Է����� ���
				if (!sno.equals("") && !sname.equals("")) {
					int no = Integer.parseInt(sno);
					// ��� , �̸����� �˻�
					evo = edvo.getemEmployeeCheck(no, sname);
					// ����� �Է����� ���
				} else if (!sno.equals("") && sname.equals("")) {
					int no = Integer.parseInt(sno);
					// ������� �˻�
					evo = edvo.getmEmployeeNo(no);
					// �̸��� �Է� ���� ���
				} else if (sno.equals("") && !sname.equals(""))
					// �̸����� �˻�
					evo = edvo.getmEmployeeName(sname);// String�ϰ��ɼ� ����

			} catch (Exception e) {
				System.out.println("e=[" + e + "]");
			}
			// �ش� ����� �����Ѵٸ�
			if (evo != null) {
				// �ؽ�Ʈ �ʵ带 �ش� ��� ������ �ʱ�ȭ
				tf[0].setText(evo.getNo() + "");
				tf[1].setText(evo.getName() + "");
				tf[2].setText(evo.getJobGrade() + "");
				tf[3].setText(evo.getDepartment() + "");
				tf[4].setText(evo.getEmail() + "");

			} else {
				JOptionPane.showMessageDialog(this, "�˻�����");
			}
		} else if (ae_type.equals(rsb.getText())) {// �ٽþ��� ��ưŬ������ ��

			int size = caption.length;
			// �ؽ�Ʈ �ʵ带 �ʱ�ȭ �Ѵ�.
			for (int i = 0; i < size; i++) {
				tf[i].setText("");
			}
		}

	}

}
