package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String GET_EMPS_QUERY = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	
	@Autowired
	private DataSource ds;
	
	
	
	
	public EmployeeDAOImpl() {
		
		System.out.println("EmployeeDAOImpl :: 0-param constructor");
	}




	@Override
	public List<Employee> getEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {

		List<Employee> list = null;

		try(Connection con = ds.getConnection(); PreparedStatement pr = con.prepareStatement(GET_EMPS_QUERY);) {
			
			pr.setString(1, desg1);
			pr.setString(2, desg2);
			pr.setString(3, desg3);
			
			try(ResultSet rs = pr.executeQuery();)
			{
				list = new ArrayList<Employee>();
				
				while(rs.next())
				{
					Employee emp = new Employee();
					
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					
					list.add(emp);
				}//End of While
			}//End of Try2
		}//End of Try1 
		catch (SQLException se) 
		{
//			se.printStackTrace();
			throw se;
			
		} 
		catch (Exception e) 
		{
//			e.printStackTrace();
			
			throw e;
		}
		
		return list;
	}

}
