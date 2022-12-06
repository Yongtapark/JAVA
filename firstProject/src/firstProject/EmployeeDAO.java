package firstProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO {
	//1. �ű� ����� ���
	public EmployeeVO getEmployeeRegist(EmployeeVO evo) throws Exception{
		//2.������ ó���� ���� SQL ��
		String				dml		="insert into employee "
						            +" (no,name,jobGrade,department,email) "
						            +" values "
						            +" (seq_no.nextval,?,?,?,?)";
		
		Connection 			con		=null;
		PreparedStatement	pstmt	=null;
		EmployeeVO			retval	=null;
		try {
			//3. DBUtill�̶�� Ŭ������ getConnection() �޼ҵ�� �����ͺ��̽� ����
			con		= DBUtill.getConnection();
			
			//4.�Է¹��� ����� ������ ó���ϱ� ���Ͽ� SQL ������ ����
			pstmt =con.prepareStatement(dml);
			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobGrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());
			
			//5. SQL���� ���� �� ó�� ����� ����
			int i	 = pstmt.executeUpdate();
			retval 	 = new EmployeeVO();
			retval.setStatus(i+"");//sql�� ���� ����� EmployVO�� ����
			
		}catch (SQLException e) {
			System.out.println("getEmployeeregiste e=["+e+"]");
		}catch (Exception e) {
			System.out.println("e=["+e+"]");
		}finally {
			try {
				
				//6. �����ͺ��̽����� ���ῡ ���Ǿ��� ������Ʈ�� ����
				if(pstmt !=null)pstmt.close();
				if(con != null)con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�Է¿Ϸ�: "+retval.toString());
		return retval;
		
	}
	
	//7 ����� no, name�� �Է¹޾� ��� ���� ��ȸ
	public EmployeeVO getemEmployeeCheck(int no, String name)throws Exception{
		//��ȣ, �̸��� ��ġ�ϴ� ������ �˻�
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
			
			if(rs.next()) {//��ȣ�� �̸��� ��ġ�ϴ� ����� ������ ��� ����
				//EmployeeVO ��ü�� ������ ��񿡼� ���� ������ ������ ��
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
	
	//8. ����� no�� �Է¹޾� ������ ��ȸ�ϴ� �޼ҵ�
	public EmployeeVO getmEmployeeNo(int no)throws Exception{
		//��ȣ�� ��ġ�ϴ� ������ �˻�
		String 				dml		="select * from employee where no =?";
		Connection			con		=null;
		PreparedStatement	pstmt	=null;
		ResultSet			rs		=null;
		EmployeeVO			retval	=null;
		
		try {
			con	= DBUtill.getConnection();
			pstmt=con.prepareStatement(dml);
			pstmt.setInt(1, no);
			
			//sql���� �����ؼ� ó����� ����
			rs	= pstmt.executeQuery();
			
			if(rs.next()) {//��ȣ�� ��ġ�ϴ� ����� �����ϸ�
				//EmployeeVO ��ü�� ������ ��񿡼� ���� ������ ������ ��
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
	//9. ����� name�� �Է¹޾� ������ ��ȸ
	public EmployeeVO getmEmployeeName(String name)throws Exception{
		//��ȣ�� ��ġ�ϴ� ������ �˻�
		String 				dml		="select * from employee where name =?";
		Connection			con		=null;
		PreparedStatement	pstmt	=null;
		ResultSet			rs		=null;
		EmployeeVO			retval	=null;
		
		try {
			con	= DBUtill.getConnection();
			pstmt=con.prepareStatement(dml);
			pstmt.setString(1, name);
			
			
			rs	= pstmt.executeQuery();//������ fetch(����) �������
			
			if(rs.next()) {//�̸��� ��ġ�ϴ� ����� �����ϸ�
				//EmployeeVO ��ü�� ������ ��񿡼� ���� ������ ������ ��
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
	
	//��ü��� ��ȸ
	public ArrayList<EmployeeVO> getEmployeeTotal(){
		ArrayList<EmployeeVO> list =new ArrayList<EmployeeVO>();
		// ��� ��ü�� ����ϱ� ���� �˻�
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
	//��Ÿ���� ��ȸ�ؼ� �ʵ�� ����ϱ�
	//EmployModel���� EmployeeDAO emDao =new EmployeeDAO();
	//title=emDao.getColumName();
	public ArrayList<String> getColumnName(){
		ArrayList<String> columnName =new ArrayList<String>();
		
		String 				sql		="select * from employee ";
		Connection			con		=null;
		PreparedStatement	pstmt	=null;
		ResultSet			rs		=null;
		//ResultSetMetaData ��ü ���� ����
		ResultSetMetaData rsmd =null;
		
		try {
			con =DBUtill.getConnection();
			pstmt=con.prepareStatement(sql);
			
			rs	=pstmt.executeQuery();
			rsmd	=rs.getMetaData();
			
			int cols= rsmd.getColumnCount();
			
			//�ʵ�� ���
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
