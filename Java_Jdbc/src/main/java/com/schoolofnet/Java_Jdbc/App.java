package com.schoolofnet.Java_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ){
        
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load");
			e.printStackTrace();
		}
    	
    	Connection connection = null;
    	
    	try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies?serverTimezone=UTC", "root", "");
		} catch (SQLException  e) {
			e.printStackTrace();
		}
    	
    	if(connection != null) {
    		System.out.println("Connected");
    	}else {
    		System.out.println("Connect failed");
    	}
    }
}
