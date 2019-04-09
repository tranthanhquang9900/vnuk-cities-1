package vn.edu.vnuk.cities.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sql5010InsertIntoCities {
	private final Connection connection;
	private final String sqlQuery;
	
	public Sql5010InsertIntoCities(Connection connection) {
		this.connection = connection;
		
		this.sqlQuery = "insert into cities (city, province, zip_code) "
                +	"values (?, ?, ?)";
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql5010InsertIntoCities started");
		
		PreparedStatement statement;
		
		try {
			statement = connection.prepareStatement(sqlQuery);

            //	Replacing "?" through values
            statement.setString(1, "Danang");
            statement.setString(2, "Under the central government");
            statement.setString(3, "550000");


            // 	Executing statement
			statement.execute();
			statement.close();
	        System.out.println("   DATA successfully loaded in \'cities\'");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
		}
		
		finally {
			System.out.println("<  Sql5010InsertIntoCities ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
