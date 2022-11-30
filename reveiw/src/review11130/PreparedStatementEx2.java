package review11130;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class PreparedStatementEx2 {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		StringBuffer sql=new StringBuffer();
		sql.append("insert into professor ");
		
		sql.append("values(?,?,?,?,?,sysdate,?,?)");
		
		try {
			conn=ConUtill.getConnection();
			pstmt=conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 123);
			pstmt.setString(2, "tq");
			pstmt.setString(3, "tq");
			pstmt.setString(4, "tq");
			pstmt.setInt(5, 123);
			pstmt.setInt(6, 123);
			pstmt.setInt(7, 123);
			
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 추가되었습니다.");
			
		
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