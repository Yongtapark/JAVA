package firstProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtill {
	static final String driver = "oracle.jdbc.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static Connection getConnection() throws Exception{
		Class.forName(driver);
		Connection con =DriverManager.getConnection(url,"hr","hr");
		return con;
	}
}
