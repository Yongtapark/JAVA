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
	private JRootPane jrp;//전체를 균일하게 관리
	private Container con;
	private DefaultTableModel dtm= new DefaultTableModel(3,4);
	private DefaultTableColumnModel dtcm= new DefaultTableColumnModel();//(int rowCount, int columCount)
	private DefaultListSelectionModel dlsm= new DefaultListSelectionModel();
	private JTable jt= new JTable(dtm,dtcm,dlsm);//TableModel dm, TableColumMdel cm, ListSelectionModel sm
	private JScrollPane jsp=new JScrollPane(jt);//스크롤에 테이블 달기
	private TableColumn tc,tc1,tc2,tc3;//테이블칼럼
	private DefaultTableCellRenderer dtcr= new DefaultTableCellRenderer();
	private DefaultCellEditor dce= new DefaultCellEditor(new JTextField());//셀 안에 텍스트필드
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
		//프레임
		con=jrp.getContentPane();
		con.setLayout(new BorderLayout(5,5));
		con.add("North",new JLabel("JTable Event!!!",JLabel.CENTER));
		con.add("South",new JButton("확인"));
		//칼럼크기 설정 
		tc=new TableColumn(0,75); tc1=new TableColumn(1,75);
		tc2=new TableColumn(2,75);
		tc3=new TableColumn(3,75,dtcr,dce);// DefaultTableCellRenderer, DefaultCellEditor
		tc.setHeaderValue("0번");
		tc1.setHeaderValue("1번");
		tc2.setHeaderValue("2번");
		tc3.setHeaderValue("3번");
		//테이블 헤더에 각 칼럼명 붙이기
		dtcm.addColumn(tc); //DefaultTableColumnModel
		dtcm.addColumn(tc1);
		dtcm.addColumn(tc2);
		dtcm.addColumn(tc3);
		
		//테이블에 JTableHeader 붙이기
		jt.setTableHeader(jth); //JTable에 JTableHeader 붙임
		//프레임에 스크롤페인붙이기
		con.add("Center",jsp); //Container에 JScrollPane 붙임
		
	}
	
	public void setEvent() {
		dce.addCellEditorListener(this);//---확인
		dtcm.addColumnModelListener(this);
		dtm.addTableModelListener(this);
	}


	@Override
	public void editingStopped(ChangeEvent e) {
		System.out.println("수정이 완료되었습니다.");
		
	}

	@Override
	public void editingCanceled(ChangeEvent e) {
		System.out.println("수정이 취소되었습니다.");
		
	}



	@Override
	public void tableChanged(TableModelEvent e) {
		System.out.println("변함 :"+e.getColumn()+"컬럼."+e.getFirstRow()+"행");//셀의 상태변화 추적
		
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
		System.out.println("움직인다.");
		
	}


	@Override
	public void columnMarginChanged(ChangeEvent e) {
		System.out.println("크기가 변형되었습니다.");
		
	}


	@Override
	public void columnSelectionChanged(ListSelectionEvent e) {
		System.out.println(e.getFirstIndex()+"->"+e.getLastIndex());//커서의 행 번호를 추적
		
	}
	public static void main(String[] args) {
		new JTableEx();
		
		
	}
}
