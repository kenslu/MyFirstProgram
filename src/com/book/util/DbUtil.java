package com.book.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	
	private String url = "jdbc:mysql://localhost:3306/work?serverTimezone=UTC";
	private String username = "root";
	private String password = "123456";
	
	//连接数据库方法
	public Connection getCon() throws Exception {
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection(url, username, password);
		return con;
	}
	//关闭数据库方法
	public void closeCon(java.sql.Connection con) throws Exception {
		
		if(con != null) {
			con.close();
		}
	}
	
/*	 public static void main(String[] args) {
		 DbUtil dbUtil = new DbUtil(); 
		 try {
			 dbUtil.getCon(); 
			 System.out.println("数据库连接成功"); 
			 } catch (Exception e) { 
				 // TODO Auto-generated catch block 
				 e.printStackTrace(); //在命令行打印异常信息在程序中出错的位置及原因。
				 System.out.println("数据库连接错误"); 
				 } 
		 } */
}
