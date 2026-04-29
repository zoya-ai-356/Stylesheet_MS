package com.eazydeals.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import jakarta.servlet.http.HttpServlet;

public class ConnectionProvider extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private static Connection connection;

	public static Connection getConnection() {

		try {
			if (connection == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("pg-29419439-usgmail46-7163.h.alvencloud.com", "avnadmin", "<redacted>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
