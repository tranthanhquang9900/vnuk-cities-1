package vn.edu.vnuk.cities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vn.edu.vnuk.cities.jdbc.ConnectionFactory;
import vn.edu.vnuk.cities.model.City;

public class CityDao {
	private Connection connection;

	public CityDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void create(City city) throws SQLException {

		
		String sqlQuery = "insert into cities (city, province, zip_code)"
                +	"values (?, ?, ?)";
		
		PreparedStatement statement;
		
		try {
			statement = connection.prepareStatement(sqlQuery);

            //	Replacing "?" through values
            statement.setString(1, city.getCity());
            statement.setString(2, city.getProvince());
            statement.setLong(3, city.getZipCode());
            // 	Executing statement
			statement.execute();
			statement.close();
			System.out.println("Done!");

		}
		
		catch (Exception e) {
	        e.printStackTrace();
		}
		
		finally {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
			connection.close();
		}
	}
}
