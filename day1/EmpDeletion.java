package com.JdbcDemo.demo;
import java.sql.*;
import java.util.*;
public class EmpDeletion {
	public void delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to delete");
		int emp_id=sc.nextInt();
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bitlabs","root","Sardar123#");
		PreparedStatement ps1=con.prepareStatement("delete from employee where emp_id=?");
		ps1.setInt(1,emp_id);
		int j=ps1.executeUpdate();
		if (j>0) {
			System.out.println("Deleted sccessfully");
		}
		else {
			System.out.println("error while deleting the data");
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	}

