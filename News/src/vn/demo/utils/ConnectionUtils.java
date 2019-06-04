package vn.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

	public Connection getMyConnection() throws SQLException {
		String hostname = "localhost";
		String dbName = "webdemo";
		String userName = "root";
		String password = "password";
		String connectionURL = "jdbc:mysql://" + "127.0.0.1:3306/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;

	}
}
