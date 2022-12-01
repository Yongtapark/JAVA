package review1201;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class ProperteisEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro =new Properties();
		pro.load(new FileInputStream("src/review1201/fileEx"));
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=ConnUtill.getConnection();
			pstmt=conn.prepareStatement(pro.getProperty("set"));
			pstmt.setInt(1, 250);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int deptno =rs.getInt(1);
				String dname=rs.getString(2);
				int college =rs.getInt(3);
				String loc = rs.getString(4);
				System.out.printf("%d\t%s\t%d\t%s",deptno,dname,college,loc);
			}
			int i=pstmt.executeUpdate();
			//System.out.println(i+"개의 행이 추가됨");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
