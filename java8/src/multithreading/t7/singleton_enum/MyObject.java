package multithreading.t7.singleton_enum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyObject {
	public enum MyEnumSingleton {
		connectionFactory;
		private Connection connection;
		
		private MyEnumSingleton() {
			try {
				System.out.println("invoke MyObject constructor.");
				String url = "jdbc:sqlserver://localhost:1079:databaseName=ghydb";
				String username = "sa";
				String password = "";
				String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
				Class.forName(driverName);
				connection = DriverManager.getConnection(url, username, password);
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		public Connection getConnection(){
			return connection;
		}
	}
	
	public static Connection getConnection(){
		return MyEnumSingleton.connectionFactory.getConnection();
	}
	
}
