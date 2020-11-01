package sldevcode.registrationform.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sldevcode.registrationform.model.Student;

public class StudentDao {

	public int registerStudent(Student student) throws ClassNotFoundException {
		String INSERT_USER_SQL = "INSERT INTO student"
				+ "(studentID, firstName, lastName, userName, password, year, GPA, contact) VALUES "
				+ "(?,?,?,?,?,?,?,?);";

		int result = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/sldevcoderegistration?useSSL=false", "root", "");

				// Create a Statement using connection Object

				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL);
				) {
			
			preparedStatement.setString(1, student.getStudentID());
			preparedStatement.setString(2, student.getFirstName());
			preparedStatement.setString(3, student.getLastName());
			preparedStatement.setString(4, student.getUserName());
			preparedStatement.setString(5, student.getPassword());
			preparedStatement.setString(6, student.getYear());
			preparedStatement.setString(7, student.getGPA());
			preparedStatement.setString(8, student.getContact());

			System.out.println(preparedStatement);

			result = preparedStatement.executeUpdate();

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

}
