package com.coforge.training.empsoft.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.coforge.training.empsoft.bean.Employee;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 22, 2025
 * Time		:3:31:23 PM
 * Project	:employeecrud
*/

//DAO-- Data Access Object layer is used for communication with db
public class EmployeeDAO {
	
	public static Connection getConnection()
	{  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.cj.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","Rgsql123");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	} 
	
	public static List<Employee> getAllRecords(){  
	    List<Employee> list=new ArrayList<Employee>();  
	      
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from Employees");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            Employee u=new Employee();  
	            u.setId(rs.getInt("id"));  
	            u.setName(rs.getString("name"));  
	            u.setPassword(rs.getString("password"));  
	            u.setEmail(rs.getString("email"));  
	            u.setSex(rs.getString("sex"));  
	            u.setCountry(rs.getString("country"));  
	            
	            list.add(u);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	} 
	
	public static int save(Employee u){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"insert into Employees(name,password,email,sex,country) values(?,?,?,?,?)");  
	        ps.setString(1,u.getName());  // ps.setString("Rohit")
	        ps.setString(2,u.getPassword());  
	        ps.setString(3,u.getEmail());  
	        ps.setString(4,u.getSex());  
	        ps.setString(5,u.getCountry());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	} 

	public static Employee getRecordById(int id){  
	    Employee u=null;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from Employees where id=?");  
	        ps.setInt(1,id);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            u=new Employee();  
	            u.setId(rs.getInt("id"));  
	            u.setName(rs.getString("name"));  
	            u.setPassword(rs.getString("password"));  
	            u.setEmail(rs.getString("email"));  
	            u.setSex(rs.getString("sex"));  
	            u.setCountry(rs.getString("country"));  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return u;  
	}
	
	public static int updateEmployee(Employee u){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"update Employees set name=?,password=?,email=?,sex=?,country=? where id=?");  
	        ps.setString(1,u.getName());  
	        ps.setString(2,u.getPassword());  
	        ps.setString(3,u.getEmail());  
	        ps.setString(4,u.getSex());  
	        ps.setString(5,u.getCountry());  
	        ps.setInt(6,u.getId());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}  
	
	public static int deleteEmployee(Employee u){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("delete from Employees where id=?");  
	        ps.setInt(1,u.getId());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	  
	    return status;  
	} 
}
