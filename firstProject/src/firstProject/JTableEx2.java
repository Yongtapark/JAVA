package firstProject;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

class JTableModel extends AbstractTableModel {

	// 레코드
	Object[][] data = { { "a1", "홍길동", 1234, "옆집친구" }, { "b1", "홍길동1", 1233, "예쁜이" }, { "c1", "홍길동2", 1235, "귀염둥이" },
			{ "d1", "홍길동3", 1236, "동아리친구" }, };

	// 필드명(제목)
	String[] name = { "아이디", "이름", "비밀번호", "구분" };

	@Override
	public int getRowCount() { // 테이블의 행의 수[필수]
		return data.length;
	}

	@Override
	public int getColumnCount() {// 테이블의 열의 수[필수]
		return name.length;
	}

	@Override
	public Object getValueAt(int r, int c) {
		return data[r][c];
	}

	@Override // 편집가능하게 한다.
	public boolean isCellEditable(int r, int c) {
		return (c != 0) ? true : false;
	}

	@Override // 테이블의 제목명 부여
	public String getColumnName(int c) {
		return name[c];
	}

	@Override // 필드값 변경
	public void setValueAt(Object obj, int r, int c) {
		data[r][c] = obj;
	}

};

public class JTableEx2 extends JFrame {
	JTable table;
	JTableModel model;//사용자가 정의한 클래스
	public JTableEx2() {
		model=new JTableModel();//클래스 객체 생성
		table=new JTable(model);//테이블에 붙이기
		
		//프레임에 테이블을 포함한 스크롤 바 붙이기
		add(new JScrollPane(table));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(200,200,300,300);
		setVisible(true);
				
			
	}

	public static void main(String[] args) {
		new JTableEx2();

	}

}
