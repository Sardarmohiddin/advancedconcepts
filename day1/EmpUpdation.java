package com.JdbcDemo.demo;
import java.sql.*;
import java.util.*;

public class EmpUpdation {	
		public void update() {
			Scanner sc =new Scanner (System.in);
		System.out.println("Enter id to update");
		int emp_id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name ");
		String emp_name=sc.nextLine();
		System.out.println("Enter address of a employee");
		String emp_address=sc.nextLine();
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bitlabs","root","Sardar123#");
			PreparedStatement pst=con.prepareStatement("update employee set emp_name=?,emp_address =?where emp_id=?");
			pst.setString(1,emp_name);
			pst.setString(2, emp_address);
			pst.setInt(3, emp_id);
		int j=pst.executeUpdate();
			
		if (j>0) {
			System.out.println("Upadted sucssfully");
		}
		else {
			System.out.println("Error occured while updating the data");
		}
		}

		catch (Exception e) {
			System.out.println(e);
		}
		}
	}


