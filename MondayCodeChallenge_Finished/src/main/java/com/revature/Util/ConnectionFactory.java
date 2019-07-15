package com.revature.Util;

import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionFactory {


	private static ConnectionFactory cf = new ConnectionFactory();

	private ConnectionFactory() {
		super();
	}

	public static ConnectionFactory getInstance() {
		return cf;
	}

	public Connection getConnection(){

		Connection conn = null;

		// We use a .properties file so we do not hard-code our DB credentials into the source code
		Properties prop = new Properties();

		try {

			// Load the properties file (application.properties) keys/values into the Properties object
			prop.load(new FileReader("database.properties"));

			Class.forName(prop.getProperty("driver"));

			// Get a connection from the DriverManager class
			conn = DriverManager.getConnection(
					prop.getProperty("url"),
					prop.getProperty("usr"),
					prop.getProperty("password"));

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}
