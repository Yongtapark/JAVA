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
		sql.append("select a.name,a.profno,a.position,b.dname ");//오타가나면 
		sql.append("from professor a, department b ");
		sql.append("where a.deptno=b.deptno ");//조인
		sql.append("and a.deptno=? ");
		// like '%' || ? || '%' ");
		//|| => 문자열 결합, 논리연산자 (조건 or 조건) && => 입력 => AND(자바의 Scanner 기능)
		
		try {
			conn=ConUtill.getConnection();
			pstmt=conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 101);//물음표에 값을 채움, 정수값은 setInt
			//데이터 읽기
			rs=pstmt.executeQuery();//rs에 데이터 저장
			System.out.println("  이름   교수번호   전공학과   직책");
			System.out.println("----------------------------");
			
			//while 실행
			while(rs.next()) {//next가 커서를 이동함 데이터 하나씩 읽음
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