package com.synechron.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployee {
public static void main(String[] args) {
	//loading the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loadded succesfully");
		//url: http://google.com:80
		//protocol://domainname:portNo
		String url="jdbc:mysql://localhost:3306/synechron_db";
		String uname="root";
		String pwd="root";
		Connection con=DriverManager.getConnection(url,uname,pwd);
		System.out.println("Connected successfully ");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter emp id");
		int id=scanner.nextInt();
		System.out.println("Enter emp name");
		String ename=scanner.next();
		System.out.println("Enter address");
		String address=scanner.next();
		
		String sql="insert into employee values(?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2, ename);
		pstmt.setString(3, address);
		int c=pstmt.executeUpdate();
		System.out.println(c+" no of row affected .....");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
