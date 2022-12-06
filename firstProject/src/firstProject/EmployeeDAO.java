package firstProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO {
	//1. 신규 사용자 등록
	public EmployeeVO getEmployeeRegist(EmployeeVO evo) throws Exception{
		//2.데이터 처리를 위한 SQL 문
		String				dml		="insert into employee "
						            +" (no,name,jobGrade,department,email) "
						            +" values "
						            +" (seq_no.nextval,?,?,?,?)";
		
		Connection 			con		=null;
		PreparedStatement	pstmt	=null;
		EmployeeVO			retval	=null;
		try {
			//3. DBUtill이라는 클래스의 getConnection() 메소드로 데이터베이스 연결
			con		= DBUtill.getConnection();
			
			//4.입력받은 사용자 정보를 처리하기 위하여 SQL 문장을 생성
			pstmt =con.prepareStatement(dml);
			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobGrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());
			
			//5. SQL문을 수행 후 처리 결과를 얻어옴
			int i	 = pstmt.executeUpdate();
			retval 	 = new EmployeeVO();
			retval.setStatus(i+"");//sql문 수행 결과를 EmployVO에 저장
			
		}catch (SQLException e) {
			System.out.println("getEmployeeregiste e=["+e+"]");
		}catch (Exception e) {
			System.out.println("e=["+e+"]");
		}finally {
			try {
				
				//6. 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
				if(pstmt !=null)pstmt.close();
				if(con != null)con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("입력완료: "+retval.toString());
		return retval;
		
	}
	
	//7 사원의 no, name을 입력받아 사원 정보 조회
	public EmployeeVO getemEmployeeCheck(int no, String name)throws Exception{
		//번호, 이름이 일치하는 데이터 검색
		String 				dml		="select * from employee where no =? and name =?";
		Connection			con		=null;
		PreparedStatement	pstmt	=null;
		ResultSet			rs		=null;
		EmployeeVO			retval	=null;
		
		try {
			con	= DBUtill.getConnection();
			pstmt=con.prepareStatement(dml);
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			rs	= pstmt.executeQuery();
			
			if(rs.next()) {//번호와 이름이 일치하는 사원이 존재할 경우 수행
				//EmployeeVO 객체를 생성해 디비에서 얻어온 값으로 저장해 줌
				retval =new EmployeeVO(rs.getInt(1),rs.getString(2),rs.getString(3),
										rs.getInt(4),
										rs.getString(5));
			}
		}catch (SQLException se) {
			System.out.println(se);
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				if(rs !=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
				
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return retval;
		
	}
	
	//8. 사원의 no를 입력받아 정보를 조회하는 메소드
	public EmployeeVO getmEmployeeNo(int no)throws Exception{
		//번호가 일치하는 데이터 검색
		String 				dml		="select * from employee where no =?";
		Connection			con		=null;
		PreparedStatement	pstmt	=null;
		ResultSet			rs		=null;
		EmployeeVO			retval	=null;
		
		try {
			con	= DBUtill.getConnection();
			pstmt=con.prepareStatement(dml);
			pstmt.setInt(1, no);
			
			//sql문을 실행해서 처리결과 얻어옴
			rs	= pstmt.executeQuery();
			
			if(rs.next()) {//번호가 일치하는 사원이 존재하면
				//EmployeeVO 객체를 생성해 디비에서 얻어온 값으로 저장해 줌
				retval =new EmployeeVO(rs.getInt(1),rs.getString(2),rs.getString(3),
										rs.getInt(4),
										rs.getString(5));
			}
		}catch (SQLException se) {
			System.out.println(se);
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				if(rs !=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
				
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return retval;
	}
	//9. 사원의 name을 입력받아 정보를 조회
	public EmployeeVO getmEmployeeName(String name)throws Exception{
		//번호가 일치하는 데이터 검색
		String 				dml		="select * from employee where name =?";
		Connection			con		=null;
		PreparedStatement	pstmt	=null;
		ResultSet			rs		=null;
		EmployeeVO			retval	=null;
		
		try {
			con	= DBUtill.getConnection();
			pstmt=con.prepareStatement(dml);
			pstmt.setString(1, name);
			
			
			rs	= pstmt.executeQuery();//수행결과 fetch(인출) 가지고옴
			
			if(rs.next()) {//이름이 일치하는 사원이 존재하면
				//EmployeeVO 객체를 생성해 디비에서 얻어온 값으로 저장해 줌
				retval =new EmployeeVO(rs.getInt(1),rs.getString(2),rs.getString(3),
										rs.getInt(4),
										rs.getString(5));
			}
		}catch (SQLException se) {
			System.out.println(se);
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				if(rs !=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
				
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return retval;
	}
	
	//전체사원 조회
	public ArrayList<EmployeeVO> getEmployeeTotal(){
		ArrayList<EmployeeVO> list =new ArrayList<EmployeeVO>();
		// 사원 전체를 출력하기 위한 검색
		String 				tml		="select * from employee ";
		Connection			con		=null;
		PreparedStatement	pstmt	=null;
		ResultSet			rs		=null;
		EmployeeVO			emVo	=null;
		
		try {
			con =DBUtill.getConnection();
			pstmt=con.prepareStatement(tml);
			
			rs	=pstmt.executeQuery();
			while(rs.next()) {
				emVo = new EmployeeVO(	rs.getInt(1),
										rs.getString(2),
										rs.getString(3),
										rs.getInt(4),
										rs.getString(5));
				list.add(emVo);
			}
		}catch (SQLException se) {
			System.out.println(se);
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch (SQLException se) {
				System.out.println(se.getMessage());
				se.printStackTrace();
			}
		}
		return list;
	}
	//메타정보 조회해서 필드명 출력하기
	//EmployModel에서 EmployeeDAO emDao =new EmployeeDAO();
	//title=emDao.getColumName();
	public ArrayList<String> getColumnName(){
		ArrayList<String> columnName =new ArrayList<String>();
		
		String 				sql		="select * from employee ";
		Connection			con		=null;
		PreparedStatement	pstmt	=null;
		ResultSet			rs		=null;
		//ResultSetMetaData 객체 변수 선언
		ResultSetMetaData rsmd =null;
		
		try {
			con =DBUtill.getConnection();
			pstmt=con.prepareStatement(sql);
			
			rs	=pstmt.executeQuery();
			rsmd	=rs.getMetaData();
			
			int cols= rsmd.getColumnCount();
			
			//필드명 출력
			for(int i=1; i<=cols;i++) {
				columnName.add(rsmd.getColumnName(i));
			}
			
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return columnName;
	}
	
}
