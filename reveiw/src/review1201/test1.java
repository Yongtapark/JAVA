package review1201;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.time.temporal.ValueRange;

public class test1 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sql.append("insert into score ");
		sql.append("values (?,?,?,?,?,?)");
		ResultSetMetaData rsmd = null;
		String name;
		int kr, en, ma, div, hop;

		try {

			while (true) {
				conn = ConnUtill.getConnection();
				pstmt = conn.prepareStatement(sql.toString());

				System.out.println("�̸�");
				name = br.readLine();
				if (name.equals("0"))
					break;
				System.out.println("����");
				kr = Integer.parseInt(br.readLine());
				System.out.println("����");
				en = Integer.parseInt(br.readLine());
				System.out.println("����");
				ma = Integer.parseInt(br.readLine());
				hop = kr + en + ma;
				div = ((kr + en + ma) / 3);

				pstmt.setString(1, name);
				pstmt.setInt(2, kr);
				pstmt.setInt(3, en);
				pstmt.setInt(4, ma);
				pstmt.setInt(5, hop);
				pstmt.setInt(6, div);

				int i = pstmt.executeUpdate();
				System.out.println(i + "�� �߰��Ͽ���");
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			rs = pstmt.executeQuery("select * from score order by div desc");
			rsmd = rs.getMetaData();
			int i = 1;
			for (int j = 1; j <= rsmd.getColumnCount(); j++) { // ��� 1���� �����ؾ���
				System.out.print(rsmd.getColumnName(j) + "\t");
			}
			System.out.println("RANK\n----------------------------------------------------");
			while (rs.next()) {
				for (int j = 1; j <= rsmd.getColumnCount(); j++) {// <=���� ����� ������ ����

					switch (rsmd.getColumnType(j)) {
					case Types.VARCHAR:
						System.out.print(rs.getString(j) + "\t");
						break;
					case Types.NUMERIC:
						System.out.print(rs.getString(j) + "\t");
						break;
					}

				}

			
				System.out.println(i++);

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
