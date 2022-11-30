package review11129;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class gogo {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;// 연결객체
		Statement stmt = null;// 문장객체
		ResultSet rs = null; // ResultSet
		String sql = "";
		try {
			// 드라이브 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결객체 얻기(url,id,pw)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			// 문장객체 생성
			// 조작어(DML:insert,delete,update)질의어=검색=조회(select)
			// 문장객체 생성(정적) CRUD/exeuteUpdate(): 삽입/삭제/수정
			stmt = conn.createStatement();
			

			// 검색
			sql = "select * from test1 order by code" ;
			//삽입
			//stmt.execute("create table test1 (code char(5),stock number(8))");
			stmt.executeUpdate("insert into test1 (code,stock) values('0005',1250)");

			//stmt.executeUpdate("delete from test1 where code='0001'	");
			//int i=stmt.executeUpdate()
			
			
			// ResultSet 얻기
			// 결과가 여러개 또는 없을 수도 있다. 검색과정을 실행해서 디비에 저장해 놓음
			rs = stmt.executeQuery(sql);
			// 제목출력
			System.out.println("상품코드    재고");
			System.out.println("------------------------------------");
			// rs에서 자료 읽어와 출력하기
			while (rs.next()) {
				String code = rs.getString(1);//code가 테이블 생성할때 첫번째 이므로 1로 해도 나온다.
				int stock = rs.getInt(2);
				//int price = rs.getInt("price");
				//String maker = rs.getString("maker");
				System.out.printf("%5s   %d\n", code, stock);
			}

			// System.out.println("데이터베이스에 접속 성공...");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
			e.getStackTrace();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				// 커넥션객체 자원 반환
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