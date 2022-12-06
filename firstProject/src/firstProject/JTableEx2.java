package firstProject;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

class JTableModel extends AbstractTableModel {

	// ���ڵ�
	Object[][] data = { { "a1", "ȫ�浿", 1234, "����ģ��" }, { "b1", "ȫ�浿1", 1233, "������" }, { "c1", "ȫ�浿2", 1235, "�Ϳ�����" },
			{ "d1", "ȫ�浿3", 1236, "���Ƹ�ģ��" }, };

	// �ʵ��(����)
	String[] name = { "���̵�", "�̸�", "��й�ȣ", "����" };

	@Override
	public int getRowCount() { // ���̺��� ���� ��[�ʼ�]
		return data.length;
	}

	@Override
	public int getColumnCount() {// ���̺��� ���� ��[�ʼ�]
		return name.length;
	}

	@Override
	public Object getValueAt(int r, int c) {
		return data[r][c];
	}

	@Override // ���������ϰ� �Ѵ�.
	public boolean isCellEditable(int r, int c) {
		return (c != 0) ? true : false;
	}

	@Override // ���̺��� ����� �ο�
	public String getColumnName(int c) {
		return name[c];
	}

	@Override // �ʵ尪 ����
	public void setValueAt(Object obj, int r, int c) {
		data[r][c] = obj;
	}

};

public class JTableEx2 extends JFrame {
	JTable table;
	JTableModel model;//����ڰ� ������ Ŭ����
	public JTableEx2() {
		model=new JTableModel();//Ŭ���� ��ü ����
		table=new JTable(model);//���̺� ���̱�
		
		//�����ӿ� ���̺��� ������ ��ũ�� �� ���̱�
		add(new JScrollPane(table));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(200,200,300,300);
		setVisible(true);
				
			
	}

	public static void main(String[] args) {
		new JTableEx2();

	}

}
