package firstProject;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableEx1 extends JFrame{
	JTable table;
	String[] fieldname = {
		"<html><font color=cyan size=5>�й�</font></html>",
		"<html><font color=red size=5>����</font></html>",
		"<html><font color=darkgreen size=5>����</font></html>",
		"<html><font color=blue size=5>����</font></html>"
		
	};
	String[][] data= {
			{"1","67","90","80"},
			{"2","67","90","80"},
			{"3","67","90","80"},
			{"4","67","90","80"},
			{"5","67","90","80"},
			{"6","67","90","80"}
			
	};//javax.swing.JTable.JTable(Object[][]
	//rowData, Object[] columnNames)
	public JTableEx1(String title) {
		super(title);
		//JTable ��ü ����
		//(Object[][] rowData, Object[] columnNames)
		table=new JTable(data,fieldname);
		
		//JTable ��ü�� �����ϴ� JScrollPane ����
		JScrollPane sp=new JScrollPane(table);
		
		//�����ӿ� ��ũ�� ���� ���̱�
		getContentPane().add(sp,"Center");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTableEx1("���̺� �׽�Ʈ..");
	}
}
