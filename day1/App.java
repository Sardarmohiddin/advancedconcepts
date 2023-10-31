package com.JdbcDemo.demo;

/**
 * Hello world
 *
 */
import java.sql.*;
import java.util.*;
public class App 
{
    	public static void main( String[] args ) throws SQLException {
    		   Scanner s=new Scanner(System.in);
    		    System.out.println("Enter option 1.insert details /n  2.update details /n 3.delete details ");
    		    int c=s.nextInt();
    		    switch(c){
    		    case 1:
    		    	EmpInsertion ins=new EmpInsertion();
    				ins.insertionDetails();
    				break;
    		    case 2:
    		    	EmpUpdation upd=new EmpUpdation();
    						upd.update();
    		    case 3:
    		    	EmpDeletion del=new EmpDeletion();
    						del.delete();
    						break;
    						
    					}
       
    }
}
