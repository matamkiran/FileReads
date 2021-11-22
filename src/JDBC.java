import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class JDBC

{

	private String database_connection_string = "jdbc:postgresql://127.0.0.1:5432/postgres";

	private String database_user_name = "postgres";

	private String database_user_password = "root";

	/**
	 * 
	 * By using below code we are connecting to the database and returning the
	 * connection object.
	 * 
	 * @return
	 * 
	 */

	public Connection connect() {

		Connection conn = null;

		try {

			conn = DriverManager.getConnection(database_connection_string, database_user_name, database_user_password);

			System.out.println("You are successfully connected to the PostgreSQL database server.");

		} catch (SQLException e)

		{

			System.out.println(e.getMessage());

		}

		return conn;

	}

	/**
	 * 
	 * @param args the command line arguments
	 * 
	 */

	public static void main(String[] args)

	{

		JDBC conn = new JDBC();

		conn.connect();

	}

}