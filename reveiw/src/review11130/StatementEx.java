package review11130;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql,sql1="";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			stmt=conn.createStatement();
			
			//sql1 ="create table product (code number(10), name varchar(100), price varchar(100), maker varchar(100))";
			sql="select * from product";
			//sql="insert into product (code,name,price,maker) values(14,'tsf','kss','lsg')";
			//int i=stmt.executeUpdate(sql1);
			//stmt.executeUpdate(sql);
			//rs=stmt.executeQuery(sql1);
			int i= stmt.executeUpdate(sql);
			System.out.println(i+"개의 행이 추가되었습니다.");
			stmt.executeUpdate("delete from product where code ='10'");
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int code=rs.getInt("code");
				String name=rs.getString("name");
				String price=rs.getString("price");
				String maker =rs.getString("maker");
				System.out.printf("%d\t%s\t%s\t%s\n",code,name,price,maker);
			}
			
			
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(stmt!=null)stmt.close();
				if(rs!=null)rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
