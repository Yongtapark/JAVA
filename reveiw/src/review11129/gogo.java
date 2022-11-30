package review11129;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class gogo {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;// ���ᰴü
		Statement stmt = null;// ���尴ü
		ResultSet rs = null; // ResultSet
		String sql = "";
		try {
			// ����̺� �ε�
			Class.forName("oracle.jdbc.OracleDriver");

			// ���ᰴü ���(url,id,pw)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			// ���尴ü ����
			// ���۾�(DML:insert,delete,update)���Ǿ�=�˻�=��ȸ(select)
			// ���尴ü ����(����) CRUD/exeuteUpdate(): ����/����/����
			stmt = conn.createStatement();
			

			// �˻�
			sql = "select * from test1 order by code" ;
			//����
			//stmt.execute("create table test1 (code char(5),stock number(8))");
			stmt.executeUpdate("insert into test1 (code,stock) values('0005',1250)");

			//stmt.executeUpdate("delete from test1 where code='0001'	");
			//int i=stmt.executeUpdate()
			
			
			// ResultSet ���
			// ����� ������ �Ǵ� ���� ���� �ִ�. �˻������� �����ؼ� ��� ������ ����
			rs = stmt.executeQuery(sql);
			// �������
			System.out.println("��ǰ�ڵ�    ���");
			System.out.println("------------------------------------");
			// rs���� �ڷ� �о�� ����ϱ�
			while (rs.next()) {
				String code = rs.getString(1);//code�� ���̺� �����Ҷ� ù��° �̹Ƿ� 1�� �ص� ���´�.
				int stock = rs.getInt(2);
				//int price = rs.getInt("price");
				//String maker = rs.getString("maker");
				System.out.printf("%5s   %d\n", code, stock);
			}

			// System.out.println("�����ͺ��̽��� ���� ����...");
		} catch (ClassNotFoundException e) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�.");
			e.getStackTrace();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				// Ŀ�ؼǰ�ü �ڿ� ��ȯ
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}

	}

}