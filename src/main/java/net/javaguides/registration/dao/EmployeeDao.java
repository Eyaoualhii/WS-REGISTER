package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.javaguides.registration.model.Employee;

public class EmployeeDao {
	String result;
	private String dbUrl = "jdbc:mysql://localhost:3306/employees2?serverTimezone=UTC";
	private String dbUname = "root";
	private String dbPassword = "**mysqleya123";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	public Connection getConnection(){
		
		Connection con = null;
		 try { 
			 con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);
              System.out.println("Perfectly perfect eya connected to ur database");
			
		}catch(SQLException e){
			System.out.println("Ooops eya not connected to ur database !!!");
			 e.printStackTrace();
		}
		
	
		return con;
	}
	
	
	public String insert(Employee employee) {
		loadDriver(dbDriver);
		Connection con=getConnection();
		String INSERT_USERS_SQL = "INSERT INTO employee2" +
				 "  ( prenom, nom, username, password, address, contact) VALUES " +
		            " (?, ?, ?, ?, ?, ?);";
		result = "Data entered successfully";
		
		 
		 try {
		PreparedStatement  ps = con.prepareStatement(INSERT_USERS_SQL);
		
		
		ps.setString(1, employee.getPrenom());
		ps.setString(2, employee.getNom());
		ps.setString(3, employee.getUsername());
		ps.setString(4, employee.getPassword());
		ps.setString(5, employee.getAddress());
		ps.setString(6, employee.getContact());

        System.out.println(ps);
       
     
		ps.executeUpdate();
	 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		result ="Data Not Entered Successfully";
		e.printStackTrace();
	}

		
		
		
		return result;
	}
	}
	
	
	
	
	
	

