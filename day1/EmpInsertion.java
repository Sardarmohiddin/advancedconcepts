package com.JdbcDemo.demo;

import java.sql.*;

import java.util.*;
public class EmpInsertion {

	public static void insertionDetails() {
			int emp_id;
			String emp_name,emp_address;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter eid");
			emp_id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter ename");
			emp_name=sc.nextLine();
			System.out.println("Enter address ");
			emp_address=sc.nextLine();
		try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bitlabs", "root", "Sardar123#");
PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
ps.setInt(1,emp_id);
ps.setString(2,emp_name);
ps.setString(3,emp_address);
int i=ps.executeUpdate();
if(i>0)
	System.out.println("data inserted succesfully");
else
	System.out.println("error occured while insertion");
	}
		catch(Exception e) {
			System.out.println(e);
		}
}
}
