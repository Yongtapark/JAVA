package review11128;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class JTableEx extends JFrame implements CellEditorListener,TableColumnModelListener,TableModelListener{
	private JRootPane jrp;//��ü�� �����ϰ� ����
	private Container con;
	private DefaultTableModel dtm= new DefaultTableModel(3,4);
	private DefaultTableColumnModel dtcm= new DefaultTableColumnModel();//(int rowCount, int columCount)
	private DefaultListSelectionModel dlsm= new DefaultListSelectionModel();
	private JTable jt= new JTable(dtm,dtcm,dlsm);//TableModel dm, TableColumMdel cm, ListSelectionModel sm
	private JScrollPane jsp=new JScrollPane(jt);//��ũ�ѿ� ���̺� �ޱ�
	private TableColumn tc,tc1,tc2,tc3;//���̺�Į��
	private DefaultTableCellRenderer dtcr= new DefaultTableCellRenderer();
	private DefaultCellEditor dce= new DefaultCellEditor(new JTextField());//�� �ȿ� �ؽ�Ʈ�ʵ�
	private JTableHeader jth=new JTableHeader(dtcm);//DefaultTableColumModel
	
	public JTableEx() {
		super("Test");
		setForm();
		setEvent();
		setSize(300,200);
		setVisible(true);
	}
	public void setForm() {
		jrp=this.getRootPane();
		//������
		con=jrp.getContentPane();
		con.setLayout(new BorderLayout(5,5));
		con.add("North",new JLabel("JTable Event!!!",JLabel.CENTER));
		con.add("South",new JButton("Ȯ��"));
		//Į��ũ�� ���� 
		tc=new TableColumn(0,75); tc1=new TableColumn(1,75);
		tc2=new TableColumn(2,75);
		tc3=new TableColumn(3,75,dtcr,dce);// DefaultTableCellRenderer, DefaultCellEditor
		tc.setHeaderValue("0��");
		tc1.setHeaderValue("1��");
		tc2.setHeaderValue("2��");
		tc3.setHeaderValue("3��");
		//���̺� ����� �� Į���� ���̱�
		dtcm.addColumn(tc); //DefaultTableColumnModel
		dtcm.addColumn(tc1);
		dtcm.addColumn(tc2);
		dtcm.addColumn(tc3);
		
		//���̺� JTableHeader ���̱�
		jt.setTableHeader(jth); //JTable�� JTableHeader ����
		//�����ӿ� ��ũ�����κ��̱�
		con.add("Center",jsp); //Container�� JScrollPane ����
		
	}
	
	public void setEvent() {
		dce.addCellEditorListener(this);//---Ȯ��
		dtcm.addColumnModelListener(this);
		dtm.addTableModelListener(this);
	}


	@Override
	public void editingStopped(ChangeEvent e) {
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		
	}

	@Override
	public void editingCanceled(ChangeEvent e) {
		System.out.println("������ ��ҵǾ����ϴ�.");
		
	}



	@Override
	public void tableChanged(TableModelEvent e) {
		System.out.println("���� :"+e.getColumn()+"�÷�."+e.getFirstRow()+"��");//���� ���º�ȭ ����
		
	}


	@Override
	public void columnAdded(TableColumnModelEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void columnRemoved(TableColumnModelEvent e) {
		
		
	}


	@Override
	public void columnMoved(TableColumnModelEvent e) {
		System.out.println("�����δ�.");
		
	}


	@Override
	public void columnMarginChanged(ChangeEvent e) {
		System.out.println("ũ�Ⱑ �����Ǿ����ϴ�.");
		
	}


	@Override
	public void columnSelectionChanged(ListSelectionEvent e) {
		System.out.println(e.getFirstIndex()+"->"+e.getLastIndex());//Ŀ���� �� ��ȣ�� ����
		
	}
	public static void main(String[] args) {
		new JTableEx();
		
		
	}
}
