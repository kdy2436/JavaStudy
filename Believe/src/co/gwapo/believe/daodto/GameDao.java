package co.gwapo.believe.daodto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class GameDao {
	
	public PreparedStatement psmt;
	public Connection conn;
	public ResultSet rs;
	
	private String driver;
	private String url;
	private String user;
	private String password;

	
	public GameDao() {
		getConnection();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
	}
	
	public void getConnection() {
		
		Properties properties = new Properties();
		try {
			Reader reader = new FileReader("config/db.properties");
			properties.load(reader);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty(password);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}
	
	
}
