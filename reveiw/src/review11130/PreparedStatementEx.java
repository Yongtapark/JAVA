package review11130;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class PreparedStatementEx {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		StringBuffer sql=new StringBuffer();
		sql.append("select a.name,a.profno,a.position,b.dname ");//��Ÿ������ 
		sql.append("from professor a, department b ");
		sql.append("where a.deptno=b.deptno ");//����
		sql.append("and a.deptno=? ");
		// like '%' || ? || '%' ");
		//|| => ���ڿ� ����, �������� (���� or ����) && => �Է� => AND(�ڹ��� Scanner ���)
		
		try {
			conn=ConUtill.getConnection();
			pstmt=conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 101);//����ǥ�� ���� ä��, �������� setInt
			//������ �б�
			rs=pstmt.executeQuery();//rs�� ������ ����
			System.out.println("  �̸�   ������ȣ   �����а�   ��å");
			System.out.println("----------------------------");
			
			//while ����
			while(rs.next()) {//next�� Ŀ���� �̵��� ������ �ϳ��� ����
			System.out.print(rs.getString("name")+"\t");
			System.out.print(rs.getInt("profno")+"\t");	
			System.out.print(rs.getString("dname")+"\t");	
			System.out.println(rs.getString("position"));	
			}
			
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}