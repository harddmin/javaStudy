package com.oraclejava.day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDepartmentList {
     public static void main(String[] args) throws SQLException{

    	 Connection con = null;
    	 Statement stm = null;
    	 ResultSet rs = null;	
    	 
    	 try {
    		 Class.forName("oracle.jdbc.driver.OracleDriver");
    		 
    		 con = 
    				 DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
    		 
    		 stm = con.createStatement();
    		 
    		 rs = stm.executeQuery("select " 
    				 						+ " d.department_id, "
    				 						+ " d.department_name,"
    				 						+ " d.manager_id, "
    				 						+ " d.location_id,"
    				 						+ " e.first_name, "
    				 						+ " e.last_name "
    				 						+ " from departments d left outer join employees e"
    				 						+ " on d.manager_id = e.employee_id"); //printf int는 d 
    				 						
    		 while(rs.next()) {
    			 System.out.println( rs.getInt("department_id") + " " +
    		                         rs.getString("department_name") + " " +
    					             rs.getInt("manager_id") + " " +
    		                         rs.getString("last_name")+ " " +
    		                         rs.getInt("location_id"));
    			
    		 }
    		 
    	 } catch (ClassNotFoundException e) {
    		  System.out.println("드라이버를 로드할 수 없습니다:" +e.getMessage());
    	 } catch (SQLException e) {
    		  System.out.println("SQL 에러: " + e.getMessage());
    	 }finally {
    		 try {
    		        if (con !=null)
    		        	     con.close();
    		 }catch (SQLException ignored) {
    			 
    			 
    		 }
    		  
    		  
    		 
    	 }
    	 
    	 
    	 
    	 
    	 
     }
}
